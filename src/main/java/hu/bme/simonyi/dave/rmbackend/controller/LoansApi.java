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

@Api(value = "loans", description = "the loans API")
public interface LoansApi {

    @ApiOperation(value = "Get all loans", notes = "Get all loans", response = Loan.class, responseContainer = "List", tags={ "Loan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = Loan.class),
        @ApiResponse(code = 404, message = "No loan fault found", response = Loan.class) })
    @RequestMapping(value = "/loans",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Loan>> loansGet();

}
