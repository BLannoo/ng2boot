package be.cegeka.ng2boot.smurf;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import static be.cegeka.ng2boot.smurf.SmurfResource.SMURF_BASE_URL;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Produces(APPLICATION_JSON_UTF8_VALUE)
@Consumes(APPLICATION_JSON_UTF8_VALUE)
@Path(SMURF_BASE_URL)
public interface SmurfResource {

    String SMURF_BASE_URL = "smurf";

    @GET
    Response all();

    @POST
    Response create(SmurfR smurf);

}
