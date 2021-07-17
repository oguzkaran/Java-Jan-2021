/*----------------------------------------------------------------------------------------------------------------------
    DateTime sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Random;

public class DateTime {
    private final Date m_date;
    private final Time m_time;

    public static DateTime ofRandom()
    {
        return ofRandom(new Random());
    }

    public static DateTime ofRandom(Random r)
    {
        return new DateTime(Date.ofRandom(r), Time.ofRandom(r));
    }

    public static DateTime ofRandom(int year)
    {
        return ofRandom(new Random(), year);
    }

    public static DateTime ofRandom(Random r, int year)
    {
        return ofRandom(r, year, year);
    }

    public static DateTime ofRandom(int minYear, int maxYear)
    {
        return ofRandom(new Random(), minYear, maxYear);
    }

    public static DateTime ofRandom(Random r, int minYear, int maxYear)
    {
        return new DateTime(Date.ofRandom(r, minYear, maxYear), Time.ofRandom(r));
    }

    public DateTime()
    {
        m_date = new Date();
        m_time = new Time();
    }

    public DateTime(Date date, Time time)
    {
        this(date.getDay(), date.getMonth(), date.getYear(), time.getHour(), time.getMinute(), time.getSecond(), time.getMillisecond());
    }

    public DateTime(int day, Month month, int year)
    {
        this(day, month, year, 0, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute)
    {
        this(day, month, year, hour, minute, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute, int second)
    {
        this(day, month, year, hour, minute, second, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute, int second, int millisecond)
    {
        m_date = new Date(day, month, year);
        m_time = new Time(hour, minute, second, millisecond);
    }

    public int getDay()
    {
        return m_date.getDay();
    }

    public void setDay(int day)
    {
        m_date.setDay(day);
    }

    public int getMonthValue()
    {
        return m_date.getMonthValue();
    }

    public void setMonthValue(int month)
    {
        m_date.setMonthValue(month);
    }

    public Month getMonth()
    {
        return m_date.getMonth();
    }

    public void setMonth(Month month)
    {
        m_date.setMonth(month);
    }

    public int getYear()
    {
        return m_date.getYear();
    }

    public void setYear(int year)
    {
        m_date.setYear(year);
    }

    public DayOfWeek getDayOfWeek()
    {
        return m_date.getDayOfWeek();
    }

    public String getDayOfWeekTR()
    {
        return m_date.getDayOfWeekTR();
    }

    public String getDayOfWeekEN()
    {
        return m_date.getDayOfWeekEN();
    }

    public boolean isWeekend()
    {
        return m_date.isWeekend();
    }

    public boolean isWeekday()
    {
        return m_date.isWeekday();
    }

    public boolean isLeapYear()
    {
        return m_date.isLeapYear();
    }

    public int getHour()
    {
        return m_time.getHour();
    }

    public void setHour(int hour)
    {
        m_time.setHour(hour);
    }

    public int getMinute()
    {
        return m_time.getMinute();
    }

    public void setMinute(int minute)
    {
        m_time.setMinute(minute);
    }

    public int getSecond()
    {
        return m_time.getSecond();
    }

    public void setSecond(int second)
    {
        m_time.setSecond(second);
    }

    public int getMillisecond()
    {
        return m_time.getMillisecond();
    }

    public void setMillisecond(int millisecond)
    {
        m_time.setMillisecond(millisecond);
    }

    public Date toDate()
    {
        return new Date(m_date);
    }

    public Time toTime()
    {
        return new Time(m_time);
    }

    public String toDateString()
    {
        return m_date.toString();
    }

    public String toTimeString()
    {
        return m_time.toString();
    }

    public String toStringTR()
    {
        return String.format("%s %s", m_date.toStringTR(), m_time.toString());
    }

    public String toStringEN()
    {
        return String.format("%s %s", m_date.toStringEN(), m_time.toString());
    }

    public String toLongDateTimeStringTR()
    {
        return String.format("%s %s", m_date.toLongDateStringTR(), m_time.toLongTimeString());
    }

    public String toLongDateTimeStringEN()
    {
        return String.format("%s %s", m_date.toLongDateStringEN(), m_time.toLongTimeString());
    }

    public String toLongDateStringTR()
    {
        return m_date.toLongDateStringTR();
    }

    public String toLongDateStringEN()
    {
        return m_date.toLongDateStringEN();
    }

    public String toShortTimeString()
    {
        return m_time.toShortTimeString();
    }

    public String toLongTimeString()
    {
        return m_time.toLongTimeString();
    }

    public String toString()
    {
        return String.format("%s %s", m_date.toString(), m_time.toString());
    }
}
