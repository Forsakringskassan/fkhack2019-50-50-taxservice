package se.forsakringskassan.fifty.taxservice.api;

import io.quarkus.runtime.annotations.RegisterForReflection;



@RegisterForReflection
public final class TaxesResult
{
    public Double brutOut;
    public Double netOut;

    @Override
    public String toString()
    {
        return "TaxesResult{" +
                "brutOut=" + brutOut +
                ", netOut=" + netOut +
                '}';
    }
}
