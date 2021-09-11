package org.csystem.math;

public class FractionException extends RuntimeException {
    private final FractionExceptionStatus m_exceptionStatus;

    public FractionException(String message, FractionExceptionStatus exceptionStatus)
    {
        super(message);
        m_exceptionStatus = exceptionStatus;
    }

    public String getMessage()
    {
        return String.format("Message:%s, Status:%s", super.getMessage(), m_exceptionStatus);
    }
}
