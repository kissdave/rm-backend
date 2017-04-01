package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
import hu.bme.simonyi.dave.rmbackend.model.ResourceFault;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceFaultRepository;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;

/**
 * Created by dkiss on 2017. 04. 02..
 */
@Service
public class ResourceFaultService {

    @PersistenceContext
    EntityManager em;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    ResourceFaultRepository resourceFaultRepository;

    @Transactional
    public Long createResourceFault(ResourceFault resourceFault) {
        if(resourceFault != null) {
            if(resourceFault.getResourceFaultID() != null) {
                resourceFault.setResourceFaultID(null);
            }

            if(resourceFault.getResource() != null) {
                final Resource resource = resourceRepository.findOne(resourceFault.getResource().getResourceID());
                resourceFault.setResource(resource);
                resource.addResourceFault(resourceFault);
            }

            em.persist(resourceFault);
            em.flush();
            return resourceFault.getResourceFaultID();
        } else {
            return null;
        }
    }

    @Transactional
    public ResourceFault getResourceFaultById(Integer resourceFaultID) {
        if (resourceFaultID != null) {
            return resourceFaultRepository.findOne(resourceFaultID.longValue());
        } else {
            return null;
        }
    }

    @Transactional
    public Long updateResourceFaultById(Integer resourceFaultId, ResourceFault resourceFault) {
        if(resourceFaultId != null && resourceFault != null) {
            resourceFault.setResourceFaultID(resourceFaultId.longValue());

            em.merge(resourceFault);
            em.flush();
            return resourceFault.getResourceFaultID();
        } else {
            return null;
        }
    }

    @Transactional
    public void deleteResourceFault(Integer resourcefaultID) {
        if(resourcefaultID != null) {
            final ResourceFault resourceFault = resourceFaultRepository.findOne(resourcefaultID.longValue());

            em.remove(resourceFault);
            em.flush();
        }
    }
}
