package org.csystem.app.sample.parser;

import org.csystem.util.StringUtil;

import java.util.Random;

public class RandomSourceFactory {
    private final Random m_random;

    public RandomSourceFactory()
    {
        this(new Random());
    }

    public RandomSourceFactory(Random random)
    {
        m_random = random;
    }

    public Source createSource()
    {
        int val = m_random.nextInt(2);

        Source source = null;

        String text = StringUtil.getRandomText(m_random, m_random.nextInt(11) + 5, "abcdxyzt0123456789 \t");

        switch (val) {
            case 0:
                source = new StringSource(text);
                break;
            case 1:
                source = new CharArraySource(text);
                break;
        }
        return source;
    }
}
