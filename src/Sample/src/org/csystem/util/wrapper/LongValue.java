/*----------------------------------------------------------------------------------------------------------------------
    LongValue sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.wrapper;

public final class LongValue {
    private static final int MIN_VALUE = -128;
    private static final int MAX_VALUE = 127;
    private static final int INDEX_PLUS_VALUE = -MIN_VALUE;
    private static final LongValue[] CACHE = new LongValue[MAX_VALUE - MIN_VALUE + 1];
    private final long m_value;

    private LongValue(long value)
    {
        m_value = value;
    }

    public static final LongValue ZERO = of(0L);
    public static final LongValue ONE = of(1L);
    public static final LongValue TWO = of(2L);
    public static final LongValue TEN = of(10L);

    public static LongValue of(long value)
    {
        if (value < MIN_VALUE || value > MAX_VALUE)
            return new LongValue(value);

        if (CACHE[(int)value + INDEX_PLUS_VALUE] == null)
            CACHE[(int)value + INDEX_PLUS_VALUE] = new LongValue(value);

        return CACHE[(int)value + INDEX_PLUS_VALUE];
    }

    public long getValue()
    {
        return m_value;
    }

    public LongValue add(long value)
    {
        return of(m_value + value);
    }

    public LongValue add(LongValue intValue)
    {
        return this.add(intValue.m_value);
    }

    public LongValue subtract(long value)
    {
        return this.add(-value);
    }

    public LongValue subtract(LongValue intValue)
    {
        return this.subtract(intValue.m_value);
    }

    public LongValue multiply(long value)
    {
        return of(m_value * value);
    }

    public LongValue multiply(LongValue intValue)
    {
        return this.multiply(intValue.m_value);
    }

    public LongValue divide(long value)
    {
        return of(m_value / value);
    }

    public LongValue divide(LongValue intValue)
    {
        return this.divide(intValue.m_value);
    }

    public LongValue increment()
    {
        return this.add(1);
    }

    public LongValue decrement()
    {
        return this.subtract(1);
    }

    public int compareTo(LongValue other)
    {
        long diff = m_value - other.m_value;
        int result = -1;

        if (diff > 0)
            result = 1;
        else if (diff == 0)
            result = 0;

        return result;
    }


    public String toString()
    {
        return m_value + "";
    }
}
