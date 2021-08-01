/*----------------------------------------------------------------------------------------------------------------------
	Fraction sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.math;

public class Fraction {
    private int m_a;
    private int m_b;

    private static Fraction add(int a1, int b1, int a2, int b2)
    {
        return new Fraction(a1 * b2 + a2 * b1, b1 * b2);
    }

    private static Fraction subtract(int a1, int b1, int a2, int b2)
    {
        return add(a1, b1, -a2, b2);
    }

    private static Fraction multiply(int a1, int b1, int a2, int b2)
    {
        return new Fraction(a1 * a2, b1 * b2);
    }

    private static Fraction divide(int a1, int b1, int a2, int b2)
    {
        return multiply(a1, b1, b2, a2);
    }

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
        this.setSign();
        this.simplify();
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
        this.set(a, b);
    }

    public int getNumerator()
    {
        return m_a;
    }

    public void setNumerator(int val)
    {
        if (m_a == val)
            return;

        this.set(val, m_b);
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
        this.set(m_a, val);
    }

    public double getRealValue()
    {
        return (double)m_a / m_b;
    }

    //add methods
    public static Fraction add(int val, Fraction fraction)
    {
        return add(val, 1, fraction.m_a, fraction.m_b);
    }

    public Fraction add(Fraction other)
    {
        return add(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction add(int val)
    {
        return add(m_a, m_b, val, 1);
    }

    //subtract methods
    public static Fraction subtract(int val, Fraction fraction)
    {
        return subtract(val, 1, fraction.m_a, fraction.m_b);
    }

    public Fraction subtract(Fraction other)
    {
        return subtract(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction subtract(int val)
    {
        return subtract(m_a, m_b, val, 1);
    }

    //multiply methods
    public static Fraction multiply(int val, Fraction fraction)
    {
        return multiply(val, 1, fraction.m_a, fraction.m_b);
    }

    public Fraction multiply(Fraction other)
    {
        return multiply(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction multiply(int val)
    {
        return multiply(m_a, m_b, val, 1);
    }

    //divide methods
    public static Fraction divide(int val, Fraction fraction)
    {
        return divide(val, 1, fraction.m_a, fraction.m_b);
    }

    public Fraction divide(Fraction other)
    {
        return divide(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction divide(int val)
    {
        return divide(m_a, m_b, val, 1);
    }

    //increment
    public void increment(int val)
    {
        m_a += m_b * val;
    }

    public void increment()
    {
        this.increment(1);
    }

    //decrement
    public void decrement(int val)
    {
        this.increment(-val);
    }

    public void decrement()
    {
        this.decrement(1);
    }

    public int compareTo(Fraction other)
    {
        return m_a * other.m_b - other.m_a * m_b;
    }

    public String toString()
    {
        return String.format("%d%s", m_a, m_b != 1 ? " / " + m_b + " = " + this.getRealValue() : "");
    }
}
