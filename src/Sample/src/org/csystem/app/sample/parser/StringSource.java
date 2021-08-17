package org.csystem.app.sample.parser;

public class StringSource extends Source {
    private final String m_str;
    private int m_idx;

    public StringSource(String str)
    {
        //...
        m_str = str;
    }

    public int nextChar()
    {
        return m_idx == m_str.length() ? -1 : m_str.charAt(m_idx++);
    }

    public void reset()
    {
        m_idx = 0;
    }
}
