package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Card;
import hu.bme.simonyi.dave.rmbackend.model.User;
import hu.bme.simonyi.dave.rmbackend.service.CardService;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-03T09:13:05.654Z")

@Controller
public class UserbycardApiController implements UserbycardApi {

    @Autowired
    CardService cardService;

    public ResponseEntity<User> userbycardCardIDGet(@ApiParam(value = "",required=true ) @PathVariable("cardID") String cardID) {
        return new ResponseEntity<User>(cardService.getUserByCard(cardID), HttpStatus.OK);
    }
}
