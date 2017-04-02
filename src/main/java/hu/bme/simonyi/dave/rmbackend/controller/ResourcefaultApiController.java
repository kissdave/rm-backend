package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
import hu.bme.simonyi.dave.rmbackend.model.ResourceFault;
import hu.bme.simonyi.dave.rmbackend.service.ResourceFaultService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourcefaultApiController implements ResourcefaultApi {

    @Autowired
    ResourceFaultService resourceFaultService;

    public ResponseEntity<Integer> resourcefaultPost(@ApiParam(value = "" ,required=true ) @RequestBody ResourceFault body) {
        Integer newID = Math.toIntExact(resourceFaultService.createResourceFault(body));
        return new ResponseEntity<Integer>(newID, HttpStatus.OK);
    }

    public ResponseEntity<Void> resourcefaultResourcefaultIDDelete(@ApiParam(value = "The identifier of the resource fault to delete",required=true ) @PathVariable("resourcefaultID") Integer resourcefaultID) {
        resourceFaultService.deleteResourceFault(resourcefaultID);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ResourceFault> resourcefaultResourcefaultIDGet(@ApiParam(value = "",required=true ) @PathVariable("resourcefaultID") Integer resourcefaultID) {
        HttpStatus returnStatus = HttpStatus.OK;
        ResourceFault resourceFault = resourceFaultService.getResourceFaultById(resourcefaultID);
        if(resourceFault == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<ResourceFault>(resourceFault, returnStatus);
    }

    public ResponseEntity<Integer> resourcefaultResourcefaultIDPut(@ApiParam(value = "The identifier of the resource fault to modify",required=true ) @PathVariable("resourcefaultID") Integer resourcefaultID,
                                                                   @ApiParam(value = "" ,required=true ) @RequestBody ResourceFault body) {
        HttpStatus returnStatus = HttpStatus.OK;
        Integer response = Math.toIntExact(resourceFaultService.updateResourceFaultById(resourcefaultID, body));
        if(response == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<Integer>(response, returnStatus);
    }

}
