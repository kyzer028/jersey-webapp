package fr.domicalis.care.resources.rest;

import fr.domicalis.care.resources.rest.model.Certificate;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/rest")
public class DefaultResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON + "; charset=UTF-8"})
    public String test() {
        return "coucou";
    }

    @GET
    @Path("/licenses/{licenceId}")
    @Produces({MediaType.APPLICATION_JSON + "; charset=UTF-8"})
    public Certificate getCertificate(@PathParam("licenceId") final long licenceId) {
        //{produit}-{version}
        Certificate res = new Certificate();
        res.setCustomer("CHU Toulouse");
        res.setType("COMMERCIAL_DEMO");
        res.setDelivery("2018-01-05T18:17:16Z");
        res.setExpiration("2018-01-05T18:17:16Z");
        res.setProduct("Portail de Coordination");
        if (licenceId == 12) {
            res.setVersion("1.0.0");
        }
        return res;
    }
}
