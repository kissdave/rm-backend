package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceFault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Controller
public class ResourcefaultsApiController implements ResourcefaultsApi {

    public ResponseEntity<List<ResourceFault>> resourcefaultsGet() {
        // do some magic!
        return new ResponseEntity<List<ResourceFault>>(HttpStatus.OK);
    }

}
