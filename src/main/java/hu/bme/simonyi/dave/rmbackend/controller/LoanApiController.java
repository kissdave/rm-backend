package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Loan;
import hu.bme.simonyi.dave.rmbackend.service.LoanService;
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
public class LoanApiController implements LoanApi {

    @Autowired
    LoanService loanService;

    public ResponseEntity<Void> loanLoanIDDelete(@ApiParam(value = "The identifier of the loan entry fault to delete",required=true ) @PathVariable("loanID") Integer loanID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Loan> loanLoanIDGet(@ApiParam(value = "",required=true ) @PathVariable("loanID") Integer loanID) {
        HttpStatus returnStatus = HttpStatus.OK;

        Loan loan = loanService.getLoanById(loanID);
        if(loan == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }

        return new ResponseEntity<Loan>(loan, returnStatus);
    }

    public ResponseEntity<Integer> loanLoanIDPut(@ApiParam(value = "The identifier of the loan entry to modify",required=true ) @PathVariable("loanID") Integer loanID,
        @ApiParam(value = "" ,required=true ) @RequestBody Loan body) {
        HttpStatus returnStatus = HttpStatus.OK;

        Integer response = loanService.updateLoanById(loanID, body);

        if(response == null) {
            returnStatus = HttpStatus.NOT_FOUND;
        }

        return new ResponseEntity<Integer>(response, returnStatus);
    }

    public ResponseEntity<Integer> loanPost(@ApiParam(value = "" ,required=true ) @RequestBody Loan body) {
        Integer newId = loanService.createLoan(body);
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

}
