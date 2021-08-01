/*----------------------------------------------------------------------------------------------------------------------
    IntValue sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.wrapper;

public final class IntValue {
    private static final int MIN_VALUE = -128;
    private static final int MAX_VALUE = 127;
    private static final int INDEX_PLUS_VALUE = -MIN_VALUE;
    private static final IntValue [] CACHE = new IntValue[MAX_VALUE - MIN_VALUE + 1];
    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static final IntValue ZERO = of(0);
    public static final IntValue ONE = of(1);
    public static final IntValue TWO = of(2);
    public static final IntValue TEN = of(10);

    public static IntValue of(int value)
    {
        if (value < MIN_VALUE || value > MAX_VALUE)
            return new IntValue(value);

        if (CACHE[value + INDEX_PLUS_VALUE] == null)
            CACHE[value + INDEX_PLUS_VALUE] = new IntValue(value);

        return CACHE[value + INDEX_PLUS_VALUE];
    }

    public int getValue()
    {
        return m_value;
    }

    public IntValue add(int value)
    {
        return of(m_value + value);
    }

    public IntValue add(IntValue intValue)
    {
        return this.add(intValue.m_value);
    }

    public IntValue subtract(int value)
    {
        return this.add(-value);
    }

    public IntValue subtract(IntValue intValue)
    {
        return this.subtract(intValue.m_value);
    }

    public IntValue multiply(int value)
    {
        return of(m_value * value);
    }

    public IntValue multiply(IntValue intValue)
    {
        return this.multiply(intValue.m_value);
    }

    public IntValue divide(int value)
    {
        return of(m_value / value);
    }

    public IntValue divide(IntValue intValue)
    {
        return this.divide(intValue.m_value);
    }

    public IntValue increment()
    {
        return this.add(1);
    }

    public IntValue decrement()
    {
        return this.subtract(1);
    }

    public int compareTo(IntValue other)
    {
        return m_value - other.m_value;
    }

    public String toString()
    {
        return m_value + "";
    }
}
