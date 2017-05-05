package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.User;
import hu.bme.simonyi.dave.rmbackend.service.CardService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-05T06:41:06.636Z")

@Controller
public class UserbycardApiController implements UserbycardApi {

    @Autowired
    CardService cardService;

    @Override
    public ResponseEntity<User> userbycardCardIDGet(@ApiParam(value = "",required=true ) @PathVariable("cardID") String cardID) {
        HttpStatus responseStatus = HttpStatus.OK;
        User user = cardService.getUserByCard(cardID);
        if(user == null) {
            responseStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(user, responseStatus);
    }

}
