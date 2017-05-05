package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Card;
import hu.bme.simonyi.dave.rmbackend.service.CardService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-05T06:41:06.636Z")

@Controller
public class CardApiController implements CardApi {

    @Autowired
    CardService cardService;

    @Override
    public ResponseEntity<Void> cardCardIDDelete(@ApiParam(value = "The identifier of the card entry fault to delete",required=true ) @PathVariable("cardID") Integer cardID) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Card> cardCardIDGet(@ApiParam(value = "",required=true ) @PathVariable("cardID") Integer cardID) {
        HttpStatus responseStatus = HttpStatus.OK;
        Card card = cardService.getCardById(cardID);
        if(card == null) {
            responseStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(card, responseStatus);
    }

    @Override
    public ResponseEntity<Integer> cardCardIDPut(@ApiParam(value = "The identifier of the card entry to modify",required=true ) @PathVariable("cardID") Integer cardID,
        @ApiParam(value = "" ,required=true ) @RequestBody Card body) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Integer> cardPost(@ApiParam(value = "" ,required=true ) @RequestBody Card body) {
        return new ResponseEntity<>(cardService.createCard(body), HttpStatus.OK);
    }

}
