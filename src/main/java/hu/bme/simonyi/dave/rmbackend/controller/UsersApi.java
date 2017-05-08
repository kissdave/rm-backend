package hu.bme.simonyi.dave.rmbackend.controller;


import hu.bme.simonyi.dave.rmbackend.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-07T19:11:54.786Z")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Get all users", notes = "Get all users", response = User.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = User.class),
        @ApiResponse(code = 404, message = "No user found", response = User.class) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> usersGet();

}
