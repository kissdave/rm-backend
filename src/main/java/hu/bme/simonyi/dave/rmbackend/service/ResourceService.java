package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
import hu.bme.simonyi.dave.rmbackend.model.ResourceType;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceRepository;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by dkiss on 2017. 04. 01..
 */
@Service
public class ResourceService {

    @PersistenceContext
    EntityManager em;

    @Autowired
    ResourceTypeRepository resourceTypeRepository;

    @Autowired
    ResourceRepository resourceRepository;

    @Transactional
    public Long createResource(Resource resource) {
        // Identifier is automatically generated
        if(resource.getResourceID() != null) {
            resource.setResourceID(null);
        }

        if(resource.getResourceType() != null) {
            final ResourceType resourceType = resourceTypeRepository.findOne(resource.getResourceType().getResourceTypeID());
            resource.setResourceType(resourceType);
        }

        if(resource.getArchived()) {
            resource.setActive(false);
        }

        em.persist(resource);
        em.flush();
        return resource.getResourceID();
    }

    public Resource getResourceById(Integer resourceID) {
        if (resourceID != null) {
            return resourceRepository.findOne(resourceID.longValue());
        } else {
            return null;
        }
    }
}
