package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-05T06:41:06.636Z")

@Api(value = "userbycard", description = "the userbycard API")
public interface UserbycardApi {

    @ApiOperation(value = "Get a user by card number", notes = "Get a user by card number", response = User.class, tags={ "Card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = User.class),
        @ApiResponse(code = 404, message = "card entry does not exists", response = User.class) })
    @RequestMapping(value = "/userbycard/{cardID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> userbycardCardIDGet(@ApiParam(value = "",required=true ) @PathVariable("cardID") String cardID);

}
