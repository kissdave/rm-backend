package hu.bme.simonyi.dave.rmbackend.controller;


import hu.bme.simonyi.dave.rmbackend.model.Request;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")

@Api(value = "requests", description = "the requests API")
public interface RequestsApi {

    @ApiOperation(value = "Gets all requests", notes = "Gets all requests from database", response = Request.class, responseContainer = "List", tags={ "Request", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Request.class) })
    @RequestMapping(value = "/requests",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Request>> requestsGet();

}
