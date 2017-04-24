package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Request;
import io.swagger.annotations.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")

@Api(value = "request", description = "the request API")
public interface RequestApi {

    @ApiOperation(value = "Creates a request", notes = "Creates a resource request in the database with NEW status", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "Request", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class) })
    @RequestMapping(value = "/request",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> requestPost(@ApiParam(value = "", required = true) @RequestBody Request body);


    @ApiOperation(value = "Delete a request", notes = "Delete a request by requestID", response = Void.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "Request", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Void.class),
        @ApiResponse(code = 404, message = "Request does not exists", response = Void.class) })
    @RequestMapping(value = "/request/{requestID}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> requestRequestIDDelete(@ApiParam(value = "The identifier of the request to delete", required = true) @PathVariable("requestID") Integer requestID);


    @ApiOperation(value = "Get a single request", notes = "Get a single request", response = Request.class, tags={ "Request", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Succesful operation", response = Request.class),
        @ApiResponse(code = 404, message = "Request does not exists", response = Request.class) })
    @RequestMapping(value = "/request/{requestID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Request> requestRequestIDGet(@ApiParam(value = "", required = true) @PathVariable("requestID") Integer requestID);


    @ApiOperation(value = "Edit a request", notes = "Modify a request by handling all the fields and the identifier", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "Request", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class),
        @ApiResponse(code = 400, message = "Malformed request", response = Integer.class) })
    @RequestMapping(value = "/request/{requestID}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Integer> requestRequestIDPut(@ApiParam(value = "The identifier of the request to modify", required = true) @PathVariable("requestID") Integer requestID,
                                                @ApiParam(value = "", required = true) @RequestBody Request body);

}
