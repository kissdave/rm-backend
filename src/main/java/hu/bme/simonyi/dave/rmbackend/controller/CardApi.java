package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Card;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-03T09:13:05.654Z")

@Api(value = "card", description = "the card API")
public interface CardApi {

    @ApiOperation(value = "Delete a card entry", notes = "Delete a loan card by loanID", response = Void.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Void.class),
        @ApiResponse(code = 404, message = "Card entry does not exists", response = Void.class) })
    @RequestMapping(value = "/card/{cardID}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> cardCardIDDelete(@ApiParam(value = "The identifier of the card entry fault to delete",required=true ) @PathVariable("cardID") Integer cardID);


    @ApiOperation(value = "Get a single card entry", notes = "Get a single card entry", response = Card.class, tags={ "Card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = Card.class),
        @ApiResponse(code = 404, message = "card entry does not exists", response = Card.class) })
    @RequestMapping(value = "/card/{cardID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Card> cardCardIDGet(@ApiParam(value = "",required=true ) @PathVariable("cardID") Integer cardID);


    @ApiOperation(value = "Edit a card entry", notes = "Modify a card entry by handling all the fields and the identifier", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class),
        @ApiResponse(code = 400, message = "Malformed request", response = Integer.class) })
    @RequestMapping(value = "/card/{cardID}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Integer> cardCardIDPut(@ApiParam(value = "The identifier of the card entry to modify",required=true ) @PathVariable("cardID") Integer cardID,
        @ApiParam(value = "" ,required=true ) @RequestBody Card body);


    @ApiOperation(value = "Creates a card entry", notes = "Creates a card entry in the database", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class) })
    @RequestMapping(value = "/card",
        produces = { "application/json" }, 
        consumes = { "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> cardPost(@ApiParam(value = "" ,required=true ) @RequestBody Card body);

}
