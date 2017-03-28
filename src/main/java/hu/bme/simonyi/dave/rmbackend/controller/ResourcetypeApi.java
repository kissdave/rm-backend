package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceType;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Api(value = "resourcetype", description = "the resourcetype API")
public interface ResourcetypeApi {

    @ApiOperation(value = "Creates a resource type", notes = "Creates a resource type in the database", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "ResourceType", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class) })
    @RequestMapping(value = "/resourcetype",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> resourcetypePost(@ApiParam(value = "", required = true) @RequestBody ResourceType body);


    @ApiOperation(value = "Delete a resource type", notes = "Delete a resource type by resourcetypeID", response = Void.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "ResourceType", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Void.class),
        @ApiResponse(code = 404, message = "Resource type does not exists", response = Void.class) })
    @RequestMapping(value = "/resourcetype/{resourcetypeID}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> resourcetypeResourcetypeIDDelete(@ApiParam(value = "The identifier of the resource type to delete", required = true) @PathVariable("resourcetypeID") Integer resourcetypeID);


    @ApiOperation(value = "Get a single resource type", notes = "Get a single resource type", response = ResourceType.class, tags={ "ResourceType", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Succesful operation", response = ResourceType.class),
        @ApiResponse(code = 404, message = "Resource type does not exists", response = ResourceType.class) })
    @RequestMapping(value = "/resourcetype/{resourcetypeID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResourceType> resourcetypeResourcetypeIDGet(@ApiParam(value = "", required = true) @PathVariable("resourcetypeID") Integer resourcetypeID);


    @ApiOperation(value = "Edit a resource type", notes = "Modify a resource type by handling all the fields and the identifier", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "ResourceType", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class),
        @ApiResponse(code = 400, message = "Malformed request", response = Integer.class) })
    @RequestMapping(value = "/resourcetype/{resourcetypeID}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Integer> resourcetypeResourcetypeIDPut(@ApiParam(value = "The identifier of the resource type to modify", required = true) @PathVariable("resourcetypeID") Integer resourcetypeID,
                                                          @ApiParam(value = "", required = true) @RequestBody ResourceType body);

}
