/*----------------------------------------------------------------------------------------------------------------------
    MutableIntValue sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.wrapper;

public class MutableIntValue {
    private int m_val;

    public MutableIntValue()
    {
    }

    public MutableIntValue(int val)
    {
        m_val = val;
    }

    public int getVal()
    {
        return m_val;
    }

    public MutableIntValue setVal(int val)
    {
        m_val = val;

        return this;
    }

    public MutableIntValue add(int val)
    {
        m_val += val;

        return this;
    }

    public MutableIntValue subtract(int val)
    {
        return add(-val);
    }

    public MutableIntValue multiply(int val)
    {
        m_val *= val;

        return this;
    }

    public MutableIntValue divide(int val)
    {
        m_val /= val;

        return this;
    }

    //...
}
