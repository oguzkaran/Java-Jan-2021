package org.csystem.app.sample.randomgenerator;

import org.csystem.math.Fraction;
import org.csystem.util.ArrayUtil;
import org.csystem.util.StringUtil;
import org.csystem.util.datetime.Date;
import org.csystem.util.wrapper.IntValue;

import java.util.Random;

public class RandomObjectArrayFactory {
    private final Random m_random;

    //String, Fraction, IntValue, Random, int[], Date
    private Object getRandomObject()
    {
        Object object;

        switch (m_random.nextInt(6)) {
            case 0:
                object = StringUtil.getRandomTextTR(m_random, m_random.nextInt(10) + 1);
                break;
            case 1:
                object = new Fraction(m_random.nextInt(10) - 5, m_random.nextInt(5) + 1);
                break;
            case 2:
                object = IntValue.of(m_random.nextInt(255) - 128);
                break;
            case 3:
                object = new Random();
                break;
            case 4:
                object = ArrayUtil.getRandomArray(m_random, 10, 0, 100);
                break;
            default:
                object = Date.ofRandom(m_random);
        }

        return object;
    }

    private Object[] fillObjects(Object [] objects)
    {
        for (int i = 0; i < objects.length; ++i)
            objects[i] = getRandomObject();

        return objects;
    }

    public RandomObjectArrayFactory()
    {
        this(new Random());
    }

    public RandomObjectArrayFactory(Random random)
    {
        m_random = random;
    }

    public Object [] getObjects(int count)
    {
        return fillObjects(new Object[count]);
    }
}
