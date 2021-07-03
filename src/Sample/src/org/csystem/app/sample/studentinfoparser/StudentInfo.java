package org.csystem.app.sample.studentinfoparser;

import org.csystem.util.datetime.Date;

public class StudentInfo {
    private String m_name;
    private final Date m_birthDate = new Date();
    private String m_lectureName;
    private int m_midTermGrade;
    private int m_finalGrade;

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public void setLectureName(String lectureName)
    {
        m_lectureName = lectureName;
    }


    public int getMidTermGrade()
    {
        return m_midTermGrade;
    }

    public void setMidTermGrade(int midTermGrade)
    {
        m_midTermGrade = midTermGrade;
    }

    public int getFinalGrade()
    {
        return m_finalGrade;
    }

    public void setFinalGrade(int finalGrade)
    {
        m_finalGrade = finalGrade;
    }

    public int getDay()
    {
        return m_birthDate.getDay();
    }

    public void setDay(int day)
    {
        m_birthDate.setDay(day);
    }

    public int getMonthValue()
    {
        return m_birthDate.getMonthValue();
    }

    public void setMonthValue(int month)
    {
        m_birthDate.setMonthValue(month);
    }

    public int getYear()
    {
        return m_birthDate.getYear();
    }

    public void setYear(int year)
    {
        m_birthDate.setYear(year);
    }

    public double getGrade()
    {
        return m_midTermGrade * 0.4 + m_finalGrade * 0.6;
    }

    public String getBirthDateDayOfWeekTR()
    {
        return m_birthDate.getDayOfWeekTR();
    }

    public String getBirthDateInfoTR()
    {
        return m_birthDate.toLongDateStringTR();
    }

    public String toString()
    {
        double grade = getGrade();
        String status = grade >= 50 ? "Geçti" : "Kaldı";
        String fmt = "{name: %s, birthDate: %s, lectureName: %s, midTermGrade: %d, finalGrade: %d, grade: %d, status: %s}";

        return String.format(fmt, m_name, getBirthDateInfoTR(), m_lectureName, m_midTermGrade, m_finalGrade, Math.round(grade), status);
    }
}
