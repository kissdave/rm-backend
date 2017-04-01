package hu.bme.simonyi.dave.rmbackend.controller;


import hu.bme.simonyi.dave.rmbackend.model.Resource;
import hu.bme.simonyi.dave.rmbackend.service.ResourceService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourceApiController implements ResourceApi {

    @Autowired
    ResourceService resourceService;

    @Override
    public ResponseEntity<Integer> resourcePost(@ApiParam(value = "" ,required=true ) @RequestBody Resource body) {

        Integer newId = Math.toIntExact(resourceService.createResource(body));

        return new ResponseEntity<>(newId, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> resourceResourceIDDelete(@ApiParam(value = "The identifier of the resource to delete",required=true ) @PathVariable("resourceID") Integer resourceID) {
        resourceService.deleteResource(resourceID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Resource> resourceResourceIDGet(@ApiParam(value = "",required=true ) @PathVariable("resourceID") Integer resourceID) {
        HttpStatus returnStatus = HttpStatus.OK;
        Resource resource = resourceService.getResourceById(resourceID);
        if(resource == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(resource, returnStatus);
    }

    @Override
    public ResponseEntity<Integer> resourceResourceIDPut(@ApiParam(value = "The identifier of the resource to modify",required=true ) @PathVariable("resourceID") Integer resourceID,
                                                         @ApiParam(value = "" ,required=true ) @RequestBody Resource body) {
        HttpStatus returnStatus = HttpStatus.OK;
        Integer response = Math.toIntExact(resourceService.updateResourceById(resourceID, body));
        if(response == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(response, returnStatus);
    }

}
