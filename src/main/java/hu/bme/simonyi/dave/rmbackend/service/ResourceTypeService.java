package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.ResourceType;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceRepository;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by dkiss on 2017. 04. 02..
 */
@Service
public class ResourceTypeService {
    @PersistenceContext
    EntityManager em;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    ResourceTypeRepository resourceTypeRepository;

    @Transactional
    public Long createResourceType(ResourceType resourceType) {
        if (resourceType != null) {
            if (resourceType.getResourceTypeID() != null) {
                resourceType.setResourceTypeID(null);
            }

            em.persist(resourceType);
            em.flush();
            return resourceType.getResourceTypeID();
        } else {
            return null;
        }
    }

    public ResourceType getResourceTypeById(Integer resourceTypeId) {
        if (resourceTypeId != null) {
            return resourceTypeRepository.findOne(resourceTypeId.longValue());
        } else {
            return null;
        }
    }

    @Transactional
    public Long updateResourceType(Integer resourceTypeId, ResourceType resourceType) {
        if(resourceTypeId != null && resourceType != null) {
            resourceType.setResourceTypeID(resourceTypeId.longValue());

            em.merge(resourceType);
            em.flush();
            return resourceType.getResourceTypeID();
        } else {
            return null;
        }
    }

    @Transactional
    public void deleteResourceType(Integer resourceTypeId) {
        if(resourceTypeId != null) {
            final ResourceType resourceType = resourceTypeRepository.findOne(resourceTypeId.longValue());

            em.remove(resourceType);
            em.flush();
        }
    }
}
