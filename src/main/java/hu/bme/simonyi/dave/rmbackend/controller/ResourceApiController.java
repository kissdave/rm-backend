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

    public ResponseEntity<Integer> resourcePost(@ApiParam(value = "" ,required=true ) @RequestBody Resource body) {

        resourceService.createResource(body);

        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    public ResponseEntity<Void> resourceResourceIDDelete(@ApiParam(value = "The identifier of the resource to delete",required=true ) @PathVariable("resourceID") Integer resourceID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Resource> resourceResourceIDGet(@ApiParam(value = "",required=true ) @PathVariable("resourceID") Integer resourceID) {
        // do some magic!
        return new ResponseEntity<Resource>(HttpStatus.OK);
    }

    public ResponseEntity<Integer> resourceResourceIDPut(@ApiParam(value = "The identifier of the resource to modify",required=true ) @PathVariable("resourceID") Integer resourceID,
                                                         @ApiParam(value = "" ,required=true ) @RequestBody Resource body) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

}
