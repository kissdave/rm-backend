package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourcesApiController implements ResourcesApi {

    @Autowired
    ResourceRepository resourceRepository;

    public ResponseEntity<List<Resource>> resourcesGet() {
        return new ResponseEntity<List<Resource>>(resourceRepository.findAll(), HttpStatus.BAD_REQUEST);
    }

}
