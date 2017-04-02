package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceType;
import hu.bme.simonyi.dave.rmbackend.service.ResourceTypeService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourcetypeApiController implements ResourcetypeApi {

    @Autowired
    ResourceTypeService resourceTypeService;

    public ResponseEntity<Integer> resourcetypePost(@ApiParam(value = "" ,required=true ) @RequestBody ResourceType body) {
        Integer newID = Math.toIntExact(resourceTypeService.createResourceType(body));
        return new ResponseEntity<Integer>(newID, HttpStatus.OK);
    }

    public ResponseEntity<Void> resourcetypeResourcetypeIDDelete(@ApiParam(value = "The identifier of the resource type to delete",required=true ) @PathVariable("resourcetypeID") Integer resourcetypeID) {
        resourceTypeService.deleteResourceType(resourcetypeID);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ResourceType> resourcetypeResourcetypeIDGet(@ApiParam(value = "",required=true ) @PathVariable("resourcetypeID") Integer resourcetypeID) {
        HttpStatus returnStatus = HttpStatus.OK;
        ResourceType resourceType = resourceTypeService.getResourceTypeById(resourcetypeID);
        if(resourceType == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<ResourceType>(resourceType, returnStatus);
    }

    public ResponseEntity<Integer> resourcetypeResourcetypeIDPut(@ApiParam(value = "The identifier of the resource type to modify",required=true ) @PathVariable("resourcetypeID") Integer resourcetypeID,
                                                                 @ApiParam(value = "" ,required=true ) @RequestBody ResourceType body) {
        HttpStatus returnStatus = HttpStatus.OK;
        Integer response = Math.toIntExact(resourceTypeService.updateResourceType(resourcetypeID, body));
        if(response == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<Integer>(response, returnStatus);
    }

}
