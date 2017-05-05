package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Card;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-05T06:41:06.636Z")

@Api(value = "cards", description = "the cards API")
public interface CardsApi {

    @ApiOperation(value = "Get all cards", notes = "Get all user cards", response = Card.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Card.class) })
    @RequestMapping(value = "/cards",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Card>> cardsGet();

}
