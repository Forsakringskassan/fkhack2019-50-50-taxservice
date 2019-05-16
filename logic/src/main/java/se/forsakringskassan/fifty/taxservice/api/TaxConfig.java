package se.forsakringskassan.fifty.taxservice.api;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public enum TaxConfig
{
	
    KALIX(0.33),
    KIRUNA(0.35),
    SUNDSVALL(0.25),
	STATIC(0.30);

    private final Double regionTax;

    TaxConfig(double regionTax)
    {
        this.regionTax = regionTax;
    }

    public Double getRegionTax()
    {
        return regionTax;
    }
}
