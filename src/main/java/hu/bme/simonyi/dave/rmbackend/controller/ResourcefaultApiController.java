package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceFault;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourcefaultApiController implements ResourcefaultApi {

    public ResponseEntity<Integer> resourcefaultPost(@ApiParam(value = "" ,required=true ) @RequestBody ResourceFault body) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    public ResponseEntity<Void> resourcefaultResourcefaultIDDelete(@ApiParam(value = "The identifier of the resource fault to delete",required=true ) @PathVariable("resourcefaultID") Integer resourcefaultID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ResourceFault> resourcefaultResourcefaultIDGet(@ApiParam(value = "",required=true ) @PathVariable("resourcefaultID") Integer resourcefaultID) {
        // do some magic!
        return new ResponseEntity<ResourceFault>(HttpStatus.OK);
    }

    public ResponseEntity<Integer> resourcefaultResourcefaultIDPut(@ApiParam(value = "The identifier of the resource fault to modify",required=true ) @PathVariable("resourcefaultID") Integer resourcefaultID,
                                                                   @ApiParam(value = "" ,required=true ) @RequestBody ResourceFault body) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

}
