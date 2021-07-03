package org.csystem.app.sample.studentinfoparser;

public class StudentInfoParser {

    public static StudentInfo parse(String str)
    {
        String [] studentInfoStr = str.split("[:]+");

        //... (format kontrolü)

        String [] birthDateInfo = studentInfoStr[1].split("[/]");

        //... (format kontrolü)

        StudentInfo studentInfo = new StudentInfo();

        studentInfo.setDay(Integer.parseInt(birthDateInfo[0]));
        studentInfo.setMonthValue(Integer.parseInt(birthDateInfo[1]));
        studentInfo.setYear(Integer.parseInt(birthDateInfo[2]));
        studentInfo.setName(studentInfoStr[0]);
        studentInfo.setLectureName(studentInfoStr[2]);
        studentInfo.setMidTermGrade(Integer.parseInt(studentInfoStr[3]));
        studentInfo.setFinalGrade(Integer.parseInt(studentInfoStr[4]));

        return studentInfo;
    }

    //...
}