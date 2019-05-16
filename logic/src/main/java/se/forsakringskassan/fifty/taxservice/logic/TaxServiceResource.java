package se.forsakringskassan.fifty.taxservice.logic;


import se.forsakringskassan.fifty.taxservice.api.Taxes;
import se.forsakringskassan.fifty.taxservice.api.TaxesResult;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/taxservice")
public class TaxServiceResource
{
    @Inject
    TaxService taxService;

    @Path("/ASU/")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TaxesResult getRegionTaxes(Taxes taxInput)
    {
    	return taxService.calcTax(taxInput);
    }



}
