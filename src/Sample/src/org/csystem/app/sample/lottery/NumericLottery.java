/*----------------------------------------------------------------------------------------------------------------------
	NumericLottery sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.sample.lottery;

import java.util.Random;

public class NumericLottery {
    private final Random m_random;

    private boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];
        int val;

        for (int i = 0; i < 6; ++i) {
            for (;;) {
                val = m_random.nextInt(49) + 1;
                if (!flags[val])
                    break;
            }
            flags[val] = true;
        }

        return flags;
    }

    private int[] getNumbers(boolean [] flags)
    {
        int [] numbers = new int[6];
        int index = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                numbers[index++] = i;

        return numbers;
    }

    public NumericLottery()
    {
        m_random = new Random();
    }

    public NumericLottery(Random r)
    {
        m_random = r;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }

    public int [][] getNumbers(int n)
    {
        int [][] result = new int[n][];

        for (int i = 0; i < n; ++i)
            result[i] = getNumbers();

        return result;
    }
}
