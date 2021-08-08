/*----------------------------------------------------------------------------------------------------------------------
    Date sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Date {
    private static final String [] DAYS_OF_WEEK_TR;
    private static final String [] DAYS_OF_WEEK_EN;
    private static final String [] MONTHS_TR;
    private static final String [] MONTHS_EN;
    private final static Month [] MONTHS;

    static {
        DAYS_OF_WEEK_TR = new String[] {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
        DAYS_OF_WEEK_EN = new String[] {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        MONTHS_TR = new String[] {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos",
                "Eylül", "Ekim", "Kasım", "Aralık"
        };
        MONTHS_EN = new String[] {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        MONTHS = Month.values();
    }

    private int m_day;
    private int m_month;
    private int m_year;
    private int m_dayOfWeek;

    private static String getDaySuffix(int day)
    {
        String suffix = "th";

        switch (day) {
            case 1:
            case 21:
            case 31:
                suffix = "st";
                break;
            case 2:
            case 22:
                suffix = "nd";
                break;
            case 3:
            case 23:
                suffix = "rd";
        }

        return suffix;
    }

    private static int getDayOfWeek(int day, int month, int year)
    {
        int totalDays = getDayOfYear(day, month, year);

        for (int y = 1900; y < year; ++y)
            totalDays += Month.isLeapYear(y) ? 366 : 365;

        return totalDays % 7;
    }

    private static String getDayOfWeekTR(int day, int month, int year)
    {
        return DAYS_OF_WEEK_TR[getDayOfWeek(day, month, year)];
    }

    private static String getDayOfWeekEN(int day, int month, int year)
    {
        return DAYS_OF_WEEK_EN[getDayOfWeek(day, month, year)];
    }

    private static int getDayOfYear(int day, int month, int year)
    {
        return day + getTotalDays(month, year);
    }

    private static int getTotalDays(int month, int year)
    {
        int totalDays = 0;

        for (int m = month - 1; m >= 1; --m )
            totalDays += MONTHS[m - 1].getDays();

        return month > 2 && Month.isLeapYear(year) ? totalDays + 1 : totalDays;
    }

    private static boolean isValidDate(int day, int month, int year)
    {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900)
            return false;

        return day <= MONTHS[month - 1].getDays(year);
    }

    private static void doWorkForException(String messsage)
    {
        System.out.println(messsage);
        System.exit(1); //Exception işlemleri konusuna kadar sabredin
    }

    private static void checkForDate(int day, int month, int year, String errMsg)
    {
        if (!isValidDate(day, month, year))
            doWorkForException(errMsg);
    }

    private void checkForDay(int val)
    {
        checkForDate(val, m_month, m_year, "Invalid day value:" + val);
    }

    private void checkForMonth(int val)
    {
        checkForDate(m_day, val, m_year, "Invalid month value:" + val);
    }

    private void checkForYear(int val)
    {
        checkForDate(m_day, m_month, val, "Invalid year value:" + val);
    }

    private void set(int day, int month, int year)
    {
        m_day = day;
        m_month = month;
        m_year = year;
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);
    }

    public static Date ofRandom()
    {
        return ofRandom(new Random());
    }

    public static Date ofRandom(Random r)
    {
        return ofRandom(r, new Date().m_year);
    }

    public static Date ofRandom(int year)
    {
        return ofRandom(new Random(), year);
    }

    public static Date ofRandom(Random r, int year)
    {
        return ofRandom(r, year, year);
    }

    public static Date ofRandom(int minYear, int maxYear)
    {
        return ofRandom(new Random(), minYear, maxYear);
    }

    public static Date ofRandom(Random r, int minYear, int maxYear)
    {
        int year = r.nextInt(maxYear - minYear + 1) + minYear;
        int month = r.nextInt(12) + 1;
        int day = r.nextInt(MONTHS[month - 1].getDays( year)) + 1;

        return new Date(day, month, year);
    }

    private Date(int day, int month, int year, String errMsg)
    {
        checkForDate(day, month, year, errMsg);
        this.set(day, month, year);
    }

    Date(Date date)
    {
        this.set(date.m_day, date.m_month, date.m_year);
    }

    public Date() //Bu ctor o anki sistem tarihini alır. Burada yazılan kodların ne anlama geldiği şu an önemsizdir. Tasarım açısından bu ctor yazılmıştır
    {
        Calendar today = new GregorianCalendar();

        m_day = today.get(Calendar.DAY_OF_MONTH);
        m_month = today.get(Calendar.MONTH) + 1;
        m_year = today.get(Calendar.YEAR);
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);

    }

    public Date(int day, Month month, int year)
    {
        this(day, month.ordinal() + 1, year,
                String.format("Invalid date values: d -> %d, m -> %d, y -> %d", day, month.ordinal() + 1, year));
    }

    public Date(int day, int month, int year)
    {
        this(day, month, year, String.format("Invalid date values: d -> %d, m -> %d, y -> %d", day, month, year));
    }

    public int getDay()
    {
        return m_day;
    }

    public void setDay(int day)
    {
        if (m_day == day)
            return;

        this.checkForDay(day);
        this.set(day, m_month, m_year);
    }

    public int getMonthValue()
    {
        return m_month;
    }

    public void setMonthValue(int month)
    {
        if (m_month == month)
            return;

        this.checkForMonth(month);
        this.set(m_day, month, m_year);
    }

    public Month getMonth()
    {
        return MONTHS[m_month - 1];
    }

    public void setMonth(Month month)
    {
        this.setMonthValue(month.ordinal() + 1);
    }

    public int getYear()
    {
        return m_year;
    }

    public void setYear(int year)
    {
        if (m_year == year)
            return;

        this.checkForYear(year);
        this.set(m_day, m_month, year);
    }

    public DayOfWeek getDayOfWeek() {return DayOfWeek.values()[m_dayOfWeek];}

    public String getDayOfWeekTR()
    {
        return DAYS_OF_WEEK_TR[m_dayOfWeek];
    }

    public String getDayOfWeekEN()
    {
        return DAYS_OF_WEEK_EN[m_dayOfWeek];
    }

    public boolean isWeekend()
    {
        return m_dayOfWeek == 0 || m_dayOfWeek == 6;
    }

    public boolean isWeekday()
    {
        return !this.isWeekend();
    }

    public boolean isLeapYear()
    {
        return Month.isLeapYear(m_year);
    }

    public String toString()
    {
        return toString('/');
    }

    public String toString(char delimiter)
    {
        return String.format("%02d%c%02d%c%04d", m_day, delimiter, m_month, delimiter, m_year);
    }

    public String toStringTR()
    {
        return String.format("%d %s %d", m_day, MONTHS_TR[m_month], m_year);
    }

    public String toStringEN()
    {
        return String.format("%d%s %s %d", m_day, getDaySuffix(m_day), MONTHS_EN[m_month], m_year);
    }

    public String toLongDateStringTR()
    {
        return String.format("%s %s", this.toStringTR(), this.getDayOfWeekTR());
    }

    public String toLongDateStringEN()
    {
        return String.format("%s %s", this.toStringEN(), this.getDayOfWeekEN());
    }
}
