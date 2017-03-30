#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.rest.controller;

import org.apache.log4j.Logger;

import ${package}.core.business.service.dto.CatDto;
import ${package}.core.business.service.CatService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;

@Path("hello")
public class HelloController {

    private static final Logger LOGGER = Logger.getLogger(HelloController.class);

    @Inject
    private CatService catService;

    @GET
    @Consumes("text/plain")
    @Produces("application/json")
    @Path("/")
    public List<CatDto> getHelloCat() {
        return catService.getHelloCat();
    }
}
