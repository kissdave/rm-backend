package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
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
    public void createResource(Resource resource) {
        if(resource.getResourceID() != null) {
            resource.setResourceID(null);
        }
        em.persist(resource);
    }
}
