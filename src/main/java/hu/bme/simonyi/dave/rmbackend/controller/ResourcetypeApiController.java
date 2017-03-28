package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceType;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourcetypeApiController implements ResourcetypeApi {

    public ResponseEntity<Integer> resourcetypePost(@ApiParam(value = "" ,required=true ) @RequestBody ResourceType body) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    public ResponseEntity<Void> resourcetypeResourcetypeIDDelete(@ApiParam(value = "The identifier of the resource type to delete",required=true ) @PathVariable("resourcetypeID") Integer resourcetypeID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ResourceType> resourcetypeResourcetypeIDGet(@ApiParam(value = "",required=true ) @PathVariable("resourcetypeID") Integer resourcetypeID) {
        // do some magic!
        return new ResponseEntity<ResourceType>(HttpStatus.OK);
    }

    public ResponseEntity<Integer> resourcetypeResourcetypeIDPut(@ApiParam(value = "The identifier of the resource type to modify",required=true ) @PathVariable("resourcetypeID") Integer resourcetypeID,
                                                                 @ApiParam(value = "" ,required=true ) @RequestBody ResourceType body) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

}
