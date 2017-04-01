package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceType;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourcetypesApiController implements ResourcetypesApi {

    @Autowired
    ResourceTypeRepository resourceTypeRepository;

    public ResponseEntity<List<ResourceType>> resourcetypesGet() {
        return new ResponseEntity<List<ResourceType>>(resourceTypeRepository.findAll(), HttpStatus.OK);
    }

}
