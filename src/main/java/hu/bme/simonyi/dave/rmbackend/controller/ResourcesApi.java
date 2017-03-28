package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.Resource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Api(value = "resources", description = "the resources API")
public interface ResourcesApi {

    @ApiOperation(value = "Get all resources", notes = "Get all resources from database", response = Resource.class, responseContainer = "List", tags={ "Resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response = Resource.class) })
    @RequestMapping(value = "/resources",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Resource>> resourcesGet();

}
