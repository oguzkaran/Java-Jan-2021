package org.csystem.app.sample.studentinfoparser;

import java.util.Random;

public class RandomStudentInfoStrFactory {
    public String [] studentsInfo;
    public boolean [] flags;
    public int count;
    public Random random;

    public void init()
    {
        studentsInfo = new String[] {
                "Oğuz Karan:10/09/1976:Matematik:60:34",
                "Özgün Karan:14/12/1990:Fizik:90:100",
                "Onur Tan:11/09/1985:Kimya:67:98",
                "Kubilay Sami Şeker:17/09/1996:Matematik:89:87",
        };
        flags = new boolean[studentsInfo.length];
    }

    public RandomStudentInfoStrFactory()
    {
        random = new Random();
        init();
    }

    public int getNumberOfStudents()
    {
        return studentsInfo.length;
    }

    public String getRandomStudentInfoStr()
    {
        if (count == studentsInfo.length)
            return "";
        int index;

        for (;;) {
            index = random.nextInt(studentsInfo.length);

            if (!flags[index])
                break;
        }
        ++count;
        flags[index] = true;

        return studentsInfo[index];
    }
}
