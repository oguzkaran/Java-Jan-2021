/*----------------------------------------------------------------------------------------------------------------------
    Time sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.datetime;

public class Time {
    private int m_hour;
    private int m_minute;
    private int m_second;
    private int m_millisecond;

    private static void doWorkException(String message)
    {
        System.out.println(message);
        System.exit(1); //exception işlemlerine kadar sabredin
    }

    private static boolean isValidForBound(int val, int bound)
    {
        return 0 <= val && val <= bound;
    }

    private static boolean isValidForHour(int val)
    {
        return isValidForBound(val, 23);
    }

    private static boolean isValidForMinute(int val)
    {
        return isValidForBound(val, 59);
    }

    private static boolean isValidForSecond(int val)
    {
        return isValidForBound(val, 59);
    }

    private static boolean isValidForMillisecond(int val)
    {
        return isValidForBound(val, 999);
    }

    private static boolean isValidForTime(int hour, int minute, int second, int millisecond)
    {
        return isValidForHour(hour) && isValidForMinute(minute) && isValidForSecond(second)
                && isValidForMillisecond(millisecond);
    }

    private static void checkForHour(int val)
    {
        if (!isValidForHour(val))
            doWorkException("Invalid hour value:" + val);
    }

    private static void checkForMinute(int val)
    {
        if (!isValidForMinute(val))
            doWorkException("Invalid minute value:" + val);
    }

    private static void checkForSecond(int val)
    {
        if (!isValidForSecond(val))
            doWorkException("Invalid second value:" + val);
    }

    private static void checkForMillisecond(int val)
    {
        if (!isValidForMillisecond(val))
            doWorkException("Invalid millisecond value:" + val);
    }

    private static void checkForTime(int hour, int minute, int second, int millisecond)
    {
        if (!isValidForTime(hour, minute, second, millisecond))
            doWorkException(String.format("Invalid time value(s): h-> %d, m -> %d, s-> %d, ms -> %d",
                    hour, minute, second, millisecond));
    }
    //...
    public Time(int hour, int minute, int second, int millisecond)
    {
        checkForTime(hour, minute, second, millisecond);
        m_hour = hour;
        m_minute = minute;
        m_second = second;
        m_millisecond = millisecond;
    }

    public int getHour()
    {
        return m_hour;
    }

    public void setHour(int hour)
    {
        if (m_hour == hour)
            return;

        checkForHour(hour);
        m_hour = hour;
    }

    public int getMinute()
    {
        return m_minute;
    }

    public void setMinute(int minute)
    {
        if (m_minute == minute)
            return;

        checkForMinute(minute);
        m_minute = minute;
    }

    public int getSecond()
    {
        return m_second;
    }

    public void setSecond(int second)
    {
        if (m_second == second)
            return;

        checkForSecond(second);
        m_second = second;
    }

    public int getMillisecond()
    {
        return m_millisecond;
    }

    public void setMillisecond(int millisecond)
    {
        if (m_millisecond == millisecond)
            return;

        checkForMillisecond(millisecond);
        m_millisecond = millisecond;
    }

    public String toShortTimeString()
    {
        return String.format("%02d:%02d", m_hour, m_minute);
    }

    public String toString()
    {
        return String.format("%s:%02d", toShortTimeString(), m_second);
    }

    public String toLongTimeString()
    {
        return String.format("%s.%03d", toString(), m_millisecond);
    }
}
