package se.forsakringskassan.fifty.taxservice.logic;

public class TaxDoesNotExistException extends RuntimeException
{
    private static final long serialVersionUID = 2L;
    public TaxDoesNotExistException(String s)
    {
        super(s);
    }
}
