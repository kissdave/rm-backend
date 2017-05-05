package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Card;
import hu.bme.simonyi.dave.rmbackend.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-05T06:41:06.636Z")

@Controller
public class CardsApiController implements CardsApi {

    @Autowired
    CardRepository cardRepository;

    @Override
    public ResponseEntity<List<Card>> cardsGet() {
        // do some magic!
        return new ResponseEntity<>(cardRepository.findAll(), HttpStatus.OK);
    }

}
