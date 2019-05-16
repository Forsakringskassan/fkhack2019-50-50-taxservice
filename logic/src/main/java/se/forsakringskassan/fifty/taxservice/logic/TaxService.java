package se.forsakringskassan.fifty.taxservice.logic;


import se.forsakringskassan.fifty.taxservice.api.Taxes;
import se.forsakringskassan.fifty.taxservice.api.TaxesResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TaxService
{
    public TaxesResult calcTax(Taxes taxInput)
    {
    	TaxesResult taxResult = new TaxesResult();
        taxResult.brutOut = taxInput.grossIn;
        taxResult.netOut = taxInput.grossIn - (taxInput.grossIn * taxInput.taxConfig.getRegionTax());
        return taxResult;
    }

}
