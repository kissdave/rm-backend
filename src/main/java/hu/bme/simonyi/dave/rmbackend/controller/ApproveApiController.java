package hu.bme.simonyi.dave.rmbackend.controller;


import hu.bme.simonyi.dave.rmbackend.model.Request;
import hu.bme.simonyi.dave.rmbackend.service.RequestService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")

@Controller
public class ApproveApiController implements ApproveApi {

    @Autowired
    RequestService requestService;

    public ResponseEntity<Void> approveRequestIDPost(@ApiParam(value = "The identifier of the request to approve or decline",required=true ) @PathVariable("requestID") Integer requestID,
                                                     @ApiParam(value = "The state of approvement" ,required=true ) @RequestBody Boolean isApproved) {
        HttpStatus returnStatus = HttpStatus.OK;
        Request request = requestService.approveRequest(requestID, isApproved);
        if(request == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
