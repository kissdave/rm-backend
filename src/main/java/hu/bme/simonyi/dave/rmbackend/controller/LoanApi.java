package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Loan;
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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-03T09:13:05.654Z")

@Api(value = "loan", description = "the loan API")
public interface LoanApi {

    @ApiOperation(value = "Delete a loan entry", notes = "Delete a loan entry by loanID", response = Void.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Loan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Void.class),
        @ApiResponse(code = 404, message = "Loan entry does not exists", response = Void.class) })
    @RequestMapping(value = "/loan/{loanID}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> loanLoanIDDelete(@ApiParam(value = "The identifier of the loan entry fault to delete",required=true ) @PathVariable("loanID") Integer loanID);


    @ApiOperation(value = "Get a single loan entry", notes = "Get a single loan entry", response = Loan.class, tags={ "Loan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = Loan.class),
        @ApiResponse(code = 404, message = "loan entry does not exists", response = Loan.class) })
    @RequestMapping(value = "/loan/{loanID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Loan> loanLoanIDGet(@ApiParam(value = "",required=true ) @PathVariable("loanID") Integer loanID);


    @ApiOperation(value = "Edit a loan entry", notes = "Modify a loan entry by handling all the fields and the identifier", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Loan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class),
        @ApiResponse(code = 400, message = "Malformed request", response = Integer.class) })
    @RequestMapping(value = "/loan/{loanID}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Integer> loanLoanIDPut(@ApiParam(value = "The identifier of the loan entry to modify",required=true ) @PathVariable("loanID") Integer loanID,
        @ApiParam(value = "" ,required=true ) @RequestBody Loan body);


    @ApiOperation(value = "Creates a loan entry", notes = "Creates a loan entry in the database", response = Integer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = {
            @AuthorizationScope(scope = "admin", description = "Admin scope")
            })
    }, tags={ "Loan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Integer.class) })
    @RequestMapping(value = "/loan",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> loanPost(@ApiParam(value = "" ,required=true ) @RequestBody Loan body);

}
