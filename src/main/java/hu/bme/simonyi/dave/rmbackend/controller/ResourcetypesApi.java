package hu.bme.simonyi.dave.rmbackend.controller;

import hu.bme.simonyi.dave.rmbackend.model.ResourceType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-28T10:02:05.849Z")

@Api(value = "resourcetypes", description = "the resourcetypes API")
public interface ResourcetypesApi {

    @ApiOperation(value = "Get all resourceTypes", notes = "Get all resourceTypes", response = ResourceType.class, responseContainer = "List", tags={ "ResourceType", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Succesful operation", response = ResourceType.class),
        @ApiResponse(code = 404, message = "No resource type found", response = ResourceType.class) })
    @RequestMapping(value = "/resourcetypes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ResourceType>> resourcetypesGet();

}
