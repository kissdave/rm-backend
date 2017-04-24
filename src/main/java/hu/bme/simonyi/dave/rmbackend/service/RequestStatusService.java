package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.RequestStatus;
import hu.bme.simonyi.dave.rmbackend.repository.RequestStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by dkiss on 2017. 04. 10..
 */
@Service
public class RequestStatusService {
    @PersistenceContext
    EntityManager em;

    @Autowired
    RequestStatusRepository requestStatusRepository;

    @Transactional
    public RequestStatus createRequestStatus(RequestStatus requestStatus) {
        if (requestStatus.getRequestStatusID() != null) {
            requestStatus.setRequestStatusID(null);
        }

        em.persist(requestStatus);
        em.flush();
        return requestStatus;
    }

    public Boolean isRequestStatusExists(String name) {
        final List<RequestStatus> requestStatuses = requestStatusRepository.findAll();
        for(RequestStatus r : requestStatuses) {
            if(r.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public RequestStatus getRequestStatus(String name) {
        final List<RequestStatus> requestStatuses = requestStatusRepository.findAll();
        for (RequestStatus r : requestStatuses) {
            if(r.getName().equals(name)) {
                return r;
            }
        }
        return null;
    }
}
