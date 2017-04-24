package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.Request;
import hu.bme.simonyi.dave.rmbackend.model.RequestStatus;
import hu.bme.simonyi.dave.rmbackend.model.Resource;
import hu.bme.simonyi.dave.rmbackend.model.User;
import hu.bme.simonyi.dave.rmbackend.repository.RequestRepository;
import hu.bme.simonyi.dave.rmbackend.repository.RequestStatusRepository;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceRepository;
import hu.bme.simonyi.dave.rmbackend.repository.UserRepository;
import hu.bme.simonyi.dave.rmbackend.util.RequestStatusGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by dkiss on 2017. 04. 10..
 */
@Service
public class RequestService {
    @PersistenceContext
    EntityManager em;

    @Autowired
    RequestRepository requestRepository;

    @Autowired
    RequestStatusRepository requestStatusRepository;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RequestStatusGetter requestStatusGetter;

    @Transactional
    public Integer createRequest(Request request) {
        if (request != null) {
            if (request.getRequestID() != null) {
                request.setRequestID(null);
            }

            request.setRequestStatus(requestStatusGetter.getNew());
            if (request.getRequestStatus() != null) {
                final RequestStatus requestStatus = requestStatusRepository.findOne(request.getRequestStatus().getRequestStatusID());
                requestStatus.addRequestsItem(request);
            }

            if (request.getResource() != null) {
                final Resource resource = resourceRepository.findOne(request.getResource().getResourceID());
                resource.addRequestsItem(request);
            }

            if (request.getUser() != null) {
                final User user = userRepository.findOne(request.getUser().getUserID());
                if (user != null) {
                    user.addRequestsItem(request);
                }
            }

            em.persist(request);
            em.flush();
            return request.getRequestID().intValue();

        } else {
            return null;
        }
    }

    @Transactional
    public void deleteRequest(Integer requestID) {
        if (requestID != null) {
            final Request request = requestRepository.findOne(requestID.longValue());
            em.remove(request);
            em.flush();
        }
    }

    public Request getResourceById(Integer requestID) {
        if (requestID != null) {
            return requestRepository.findOne(requestID.longValue());
        } else {
            return null;
        }
    }

    @Transactional
    public Request approveRequest(Integer requestID, Boolean isApproved) {
        if (requestID != null) {
            Request request = requestRepository.findOne(requestID.longValue());
            if (request != null) {
                if (isApproved) {
                    request.setRequestStatus(requestStatusGetter.getApproved());
                } else {
                    request.setRequestStatus(requestStatusGetter.getDeclined());
                }

                em.merge(request);
                em.flush();
                return request;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Transactional
    public Long updateRequestById(Integer requestID, Request body) {
        if (requestID != null || body != null) {
            body.setRequestID(requestID.longValue());

            final Request requestOld = requestRepository.findOne(body.getRequestID());

            // Update Resource connection
            if (body.getResource() != null && !body.getResource().equals(requestOld.getResource())) {
                Resource resourceOld = requestOld.getResource();
                final Resource resourceNew = resourceRepository.findOne(body.getResource().getResourceID());

                if (resourceOld != null || resourceNew != null) {
                    resourceOld.deleteRequestItem(requestOld);
                    resourceNew.addRequestsItem(body);
                }
            } else {
                return null;
            }

            // Update RequestStatus connection
            // Modified status
            body.setRequestStatus(requestStatusGetter.getUpdated());

            em.merge(body);
            em.flush();
            return body.getRequestID();
        } else {
            return null;
        }
    }
}