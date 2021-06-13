package org.csystem.app.sample.studentinfoparser;

import org.csystem.app.sample.date.DateUtil;

public class StudentInfo {
    public String name;
    public int day;
    public int month;
    public int year;
    public String lectureName;
    public int midTermGrade;
    public int finalGrade;

    public static StudentInfo parse(String str)
    {
        String [] studentInfoStr = str.split("[:]+");

        //... (format kontrolü)

        String [] birthDateInfo = studentInfoStr[1].split("[/]");

        //... (format kontrolü)

        StudentInfo studentInfo = new StudentInfo();

        studentInfo.day = Integer.parseInt(birthDateInfo[0]);
        studentInfo.month = Integer.parseInt(birthDateInfo[1]);
        studentInfo.year = Integer.parseInt(birthDateInfo[2]);
        studentInfo.name = studentInfoStr[0];
        studentInfo.lectureName = studentInfoStr[2];
        studentInfo.midTermGrade = Integer.parseInt(studentInfoStr[3]);
        studentInfo.finalGrade = Integer.parseInt(studentInfoStr[4]);

        return studentInfo;
    }

    public double getGrade()
    {
        return midTermGrade * 0.4 + finalGrade * 0.6;
    }

    public String getBirthDateDayOfWeekTR()
    {
        return DateUtil.getDayOfWeekTR(day, month, year);
    }

    public String getBirthDateInfoTR()
    {
        return DateUtil.getDateTR(day, month, year);
    }

    public String toString()
    {
        double grade = getGrade();
        String status = grade >= 50 ? "Geçti" : "Kaldı";
        String fmt = "{name: %s, birthDate: %s, lectureName: %s, midTermGrade: %d, finalGrade: %d, grade: %d, status: %s}";

        return String.format(fmt, name, getBirthDateInfoTR(), lectureName, midTermGrade, finalGrade, Math.round(grade), status);
    }
}

