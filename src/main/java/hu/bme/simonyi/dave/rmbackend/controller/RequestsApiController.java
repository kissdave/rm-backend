package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Request;
import hu.bme.simonyi.dave.rmbackend.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")

@Controller
public class RequestsApiController implements RequestsApi {

    @Autowired
    RequestRepository requestRepository;

    public ResponseEntity<List<Request>> requestsGet() {
        return new ResponseEntity<List<Request>>(requestRepository.findAll(), HttpStatus.OK);
    }

}
