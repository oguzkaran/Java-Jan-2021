package org.csystem.app.sample.parser;

public class CharArraySource extends Source {
    private final char [] m_chars;
    private int m_idx;

    public CharArraySource(char [] chars)
    {
        m_chars = chars;
    }

    public CharArraySource(String str)
    {
        this(str.toCharArray());
    }

    public int nextChar()
    {
        return m_idx == m_chars.length ? -1 : m_chars[m_idx++];
    }

    public void reset()
    {
        m_idx = 0;
    }
}
