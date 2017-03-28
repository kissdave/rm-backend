package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceFault;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Api(value = "resourcefaults", description = "the resourcefaults API")
public interface ResourcefaultsApi {

    @ApiOperation(value = "Get all resource faults", notes = "Get all resource faults", response = ResourceFault.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "user", description = "User scope")
            })
    }, tags={ "ResourceFault", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Succesful operation", response = ResourceFault.class),
        @ApiResponse(code = 404, message = "No resource fault found", response = ResourceFault.class) })
    @RequestMapping(value = "/resourcefaults",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ResourceFault>> resourcefaultsGet();

}
