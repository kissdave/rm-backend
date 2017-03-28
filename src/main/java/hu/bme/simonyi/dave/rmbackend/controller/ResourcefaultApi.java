package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceFault;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Api(value = "resourcefault", description = "the resourcefault API")
public interface ResourcefaultApi {

    @ApiOperation(value = "Creates a resource fault", notes = "Creates a resource fault in the database", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "ResourceFault", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class) })
    @RequestMapping(value = "/resourcefault",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> resourcefaultPost(@ApiParam(value = "", required = true) @RequestBody ResourceFault body);


    @ApiOperation(value = "Delete a resource fault", notes = "Delete a resource fault by resourcefaultID", response = Void.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "ResourceFault", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Void.class),
        @ApiResponse(code = 404, message = "Resource type does not exists", response = Void.class) })
    @RequestMapping(value = "/resourcefault/{resourcefaultID}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> resourcefaultResourcefaultIDDelete(@ApiParam(value = "The identifier of the resource fault to delete", required = true) @PathVariable("resourcefaultID") Integer resourcefaultID);


    @ApiOperation(value = "Get a single resource fault", notes = "Get a single resource fault", response = ResourceFault.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "ResourceFault", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Succesful operation", response = ResourceFault.class),
        @ApiResponse(code = 404, message = "Resource fault does not exists", response = ResourceFault.class) })
    @RequestMapping(value = "/resourcefault/{resourcefaultID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResourceFault> resourcefaultResourcefaultIDGet(@ApiParam(value = "", required = true) @PathVariable("resourcefaultID") Integer resourcefaultID);


    @ApiOperation(value = "Edit a resource fault", notes = "Modify a resource fault by handling all the fields and the identifier", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "ResourceFault", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class),
        @ApiResponse(code = 400, message = "Malformed request", response = Integer.class) })
    @RequestMapping(value = "/resourcefault/{resourcefaultID}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Integer> resourcefaultResourcefaultIDPut(@ApiParam(value = "The identifier of the resource fault to modify", required = true) @PathVariable("resourcefaultID") Integer resourcefaultID,
                                                            @ApiParam(value = "", required = true) @RequestBody ResourceFault body);

}
