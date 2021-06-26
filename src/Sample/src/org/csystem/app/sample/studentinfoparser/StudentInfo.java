package org.csystem.app.sample.studentinfoparser;

import org.csystem.app.sample.date.DateUtil;

public class StudentInfo {
    private String m_name;
    private int m_day;
    private int m_month;
    private int m_year;
    private String m_lectureName;
    private int m_midTermGrade;
    private int m_finalGrade;

    public static StudentInfo parse(String str)
    {
        String [] studentInfoStr = str.split("[:]+");

        //... (format kontrolü)

        String [] birthDateInfo = studentInfoStr[1].split("[/]");

        //... (format kontrolü)

        StudentInfo studentInfo = new StudentInfo();

        studentInfo.m_day = Integer.parseInt(birthDateInfo[0]);
        studentInfo.m_month = Integer.parseInt(birthDateInfo[1]);
        studentInfo.m_year = Integer.parseInt(birthDateInfo[2]);
        studentInfo.m_name = studentInfoStr[0];
        studentInfo.m_lectureName = studentInfoStr[2];
        studentInfo.m_midTermGrade = Integer.parseInt(studentInfoStr[3]);
        studentInfo.m_finalGrade = Integer.parseInt(studentInfoStr[4]);

        return studentInfo;
    }

    public String getName()
    {
        return m_name;
    }

    //...

    public double getGrade()
    {
        return m_midTermGrade * 0.4 + m_finalGrade * 0.6;
    }

    public String getBirthDateDayOfWeekTR()
    {
        return DateUtil.getDayOfWeekTR(m_day, m_month, m_year);
    }

    public String getBirthDateInfoTR()
    {
        return DateUtil.getDateTR(m_day, m_month, m_year);
    }

    public String toString()
    {
        double grade = getGrade();
        String status = grade >= 50 ? "Geçti" : "Kaldı";
        String fmt = "{name: %s, birthDate: %s, lectureName: %s, midTermGrade: %d, finalGrade: %d, grade: %d, status: %s}";

        return String.format(fmt, m_name, getBirthDateInfoTR(), m_lectureName, m_midTermGrade, m_finalGrade, Math.round(grade), status);
    }
}

