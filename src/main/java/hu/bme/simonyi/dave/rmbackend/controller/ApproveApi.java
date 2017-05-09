package hu.bme.simonyi.dave.rmbackend.controller;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-09T00:33:07.032Z")

@Api(value = "approve", description = "the approve API")
public interface ApproveApi {

    @ApiOperation(value = "Approve or decline a request", notes = "Approve or decline a request depending on the isApproved parameter", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Request", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = Integer.class),
        @ApiResponse(code = 404, message = "Requets does not exists", response = Integer.class) })
    @RequestMapping(value = "/approve/{requestID}",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> approveRequestIDPost(@ApiParam(value = "The identifier of the request to approve or decline",required=true ) @PathVariable("requestID") Integer requestID,
        @ApiParam(value = "The state of approvement" ,required=true ) @RequestBody Boolean isApproved);

}
