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
public class RequestApiController implements RequestApi {

    @Autowired
    RequestService requestService;

    public ResponseEntity<Integer> requestPost(@ApiParam(value = "" ,required=true ) @RequestBody Request body) {
        Integer newId = requestService.createRequest(body);
        return new ResponseEntity<Integer>(newId, HttpStatus.OK);
    }

    public ResponseEntity<Void> requestRequestIDDelete(@ApiParam(value = "The identifier of the request to delete",required=true ) @PathVariable("requestID") Integer requestID) {
        requestService.deleteRequest(requestID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Request> requestRequestIDGet(@ApiParam(value = "",required=true ) @PathVariable("requestID") Integer requestID) {
        HttpStatus returnStatus = HttpStatus.OK;
        Request request = requestService.getResourceById(requestID);
        if(request == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(request, returnStatus);
    }

    public ResponseEntity<Integer> requestRequestIDPut(@ApiParam(value = "The identifier of the request to modify",required=true ) @PathVariable("requestID") Integer requestID,
                                                       @ApiParam(value = "" ,required=true ) @RequestBody Request body) {
        HttpStatus returnStatus = HttpStatus.OK;
        Integer response = Math.toIntExact(requestService.updateRequestById(requestID, body));
        if(response == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<Integer>(response, HttpStatus.OK);
    }

}
