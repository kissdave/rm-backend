package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Api(value = "resource", description = "the resource API")
public interface ResourceApi {

    @ApiOperation(value = "Creates a resource", notes = "Creates a resource", response = Integer.class, authorizations = {
            @Authorization(value = "OauthSecurity", scopes = {
                    @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags = {"Resource",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Succesful operation", response = Integer.class)})
    @RequestMapping(value = "/resource",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Integer> resourcePost(@ApiParam(value = "", required = true) @RequestBody Resource body);


    @ApiOperation(value = "Delete a resource", notes = "Delete a resource by resourceID", response = Void.class, authorizations = {
            @Authorization(value = "OauthSecurity", scopes = {
                    @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags = {"Resource",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation", response = Void.class),
            @ApiResponse(code = 404, message = "Resource does not exists", response = Void.class)})
    @RequestMapping(value = "/resource/{resourceID}",
            produces = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Void> resourceResourceIDDelete(@ApiParam(value = "The identifier of the resource to delete", required = true) @PathVariable("resourceID") Integer resourceID);


    @ApiOperation(value = "Get a single resource", notes = "Get a single resource", response = Resource.class, tags = {"Resource",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Succesful operation", response = Resource.class),
            @ApiResponse(code = 404, message = "Resource does not exists", response = Resource.class)})
    @RequestMapping(value = "/resource/{resourceID}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Resource> resourceResourceIDGet(@ApiParam(value = "", required = true) @PathVariable("resourceID") Integer resourceID);


    @ApiOperation(value = "Edit a resource", notes = "Modify a resource by handling all the fields and the identifier", response = Integer.class, authorizations = {
            @Authorization(value = "OauthSecurity", scopes = {
                    @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags = {"Resource",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation", response = Integer.class),
            @ApiResponse(code = 400, message = "Malformed resource", response = Integer.class)})
    @RequestMapping(value = "/resource/{resourceID}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Integer> resourceResourceIDPut(@ApiParam(value = "The identifier of the resource to modify", required = true) @PathVariable("resourceID") Integer resourceID,
                                                  @ApiParam(value = "", required = true) @RequestBody Resource body);

}
