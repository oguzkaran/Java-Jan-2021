package org.csystem.app.sample.studentinfoparser;

import java.util.Random;

public class RandomStudentInfoStrFactory {
    private String [] m_studentsInfo;
    private boolean [] m_flags;
    private int count;
    private final Random m_random;

    public void init()
    {
        m_studentsInfo = new String[] {
                "Oğuz Karan:10/09/1976:Matematik:60:34",
                "Özgün Karan:14/12/1990:Fizik:90:100",
                "Onur Tan:11/09/1985:Kimya:67:98",
                "Kubilay Sami Şeker:17/09/1996:Matematik:89:87",
        };
        m_flags = new boolean[m_studentsInfo.length];
    }

    public RandomStudentInfoStrFactory()
    {
        m_random = new Random();
        init();
    }

    public int getNumberOfStudents()
    {
        return m_studentsInfo.length;
    }

    public String getRandomStudentInfoStr()
    {
        if (count == m_studentsInfo.length)
            return "";

        int index;

        for (;;) {
            index = m_random.nextInt(m_studentsInfo.length);

            if (!m_flags[index])
                break;
        }
        ++count;
        m_flags[index] = true;

        return m_studentsInfo[index];
    }
}
