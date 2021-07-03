/*----------------------------------------------------------------------------------------------------------------------
	Fraction sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.math;

public class Fraction {
    private int m_a;
    private int m_b;

    private static void check(int a, int b)
    {
        if (b == 0) {
            if (a == 0)
                System.out.println("Indefinite");
            else
                System.out.println("Undefined");

            System.exit(1); //Exception işlemleri konusuna kadar sabredin
        }
    }

    private void simplify()
    {
        int min = Math.min(Math.abs(m_a), m_b);

        for (int i = min; i >= 2; --i)
            if (m_a % i == 0 && m_b % i == 0) {
                m_a /= i;
                m_b /= i;
                break;
            }
    }

    private void setSign()
    {
        if (m_b < 0) {
            m_a = -m_a;
            m_b = -m_b;
        }
    }

    private void set(int a, int b)
    {
        if (a == 0) {
            m_a = 0;
            m_b = 1;
            return;
        }
        m_a = a;
        m_b = b;
        setSign();
        simplify();
    }

    public Fraction()
    {
        m_b = 1;
    }

    public Fraction(int a)
    {
        m_a = a;
        m_b = 1;
    }

    public Fraction(int a, int b)
    {
        check(a, b);
        set(a, b);
    }

    public int getNumerator()
    {
        return m_a;
    }

    public void setNumerator(int val)
    {
        if (m_a == val)
            return;

        set(val, m_b);
    }

    public int getDenominator()
    {
        return m_b;
    }

    public void setDenominator(int val)
    {
        if (m_b == val)
            return;

        check(m_a, val);
        set(m_a, val);
    }

    public double getRealValue()
    {
        return (double)m_a / m_b;
    }

    public String toString()
    {
        return String.format("%d%s", m_a, m_b != 1 ? " / " + m_b + " = " + getRealValue() : "");
    }
}
