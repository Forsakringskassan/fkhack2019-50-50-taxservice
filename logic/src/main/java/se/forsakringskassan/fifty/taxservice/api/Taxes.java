package se.forsakringskassan.fifty.taxservice.api;

import io.quarkus.runtime.annotations.RegisterForReflection;



@RegisterForReflection
public final class Taxes
{
    public Double grossIn;
    public TaxConfig taxConfig;

    @Override
    public String toString()
    {
        return "Taxes{" +
                "grossIn=" + grossIn + '\'' +
                ", taxConfig=" + taxConfig +
                '}';
    }
}
