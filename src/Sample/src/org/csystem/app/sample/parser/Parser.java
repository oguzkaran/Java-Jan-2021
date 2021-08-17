package org.csystem.app.sample.parser;

public class Parser {
    private Source m_source;

    public Parser()
    {
    }

    public Parser(Source source)
    {
        m_source = source;
    }

    public void setSource(Source source)
    {
        m_source = source;
    }

    public int countWhitespaces()
    {
        m_source.reset();
        int count = 0;

        int ch;

        while ((ch = m_source.nextChar()) != -1)
            if (Character.isWhitespace(ch))
                ++count;

        return count;
    }

    public int countDigits()
    {
        m_source.reset();
        int count = 0;

        int ch;

        while ((ch = m_source.nextChar()) != -1)
            if (Character.isDigit(ch))
                ++count;

        return count;
    }
    //...
}
