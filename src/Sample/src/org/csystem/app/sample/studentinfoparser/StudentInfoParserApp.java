/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Klavyeden aşağıdaki formatta girilen bilgiyi ayrıştırarak ekrana detayları yazdıran programı
    yazınız.
    <isim>:<gg/aa/yyyy>:<ders adı>:<arasınav>:<final>
    Oğuz Karan:10/09/1976:Matematik:90:78
    Açıklamalar:
    - Bu formata göre kişinin arasınav ve final notlarına arasınav * 0.4 + final * 0.6 formülüne göre geçme notunu da
    yazdırılacaktır

    - Doğum tarihinin hangi güne geldiği de ekrana yazdırılacaktır

    - Geçme notu 50 olarak düşünülmelidir. Geçti veya kaldı bilgisi de ekrana yazdırılacaktır

    - Programda format kontrolü yapılmayacaktır

    Aşağıdaki örnekte RandomStudentInfoStrFactory sınıfında veriler herhangi bir kaynaktan (dosya, veritabanı vs)
    elde edilebilir. Uygulama verinin nnasıl elde edildiğinden bağımsızdır

    Not: Uygulama şu ana kadar gördüklerimize göre yazılmıştır. İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.sample.studentinfoparser;

public class StudentInfoParserApp {
    private StudentInfoParserApp()
    {
    }

    public static void run()
    {
        RandomStudentInfoStrFactory factory = new RandomStudentInfoStrFactory();
        StudentInfo [] randomStudents = new StudentInfo[factory.getNumberOfStudents()];

        for (int i = 0; i < randomStudents.length; ++i) {

            StudentInfo studentInfo = StudentInfoParser.parse(factory.getRandomStudentInfoStr());
            //...
            randomStudents[i] = studentInfo;
        }

        for (int i = 0; i < randomStudents.length; ++i)
            System.out.println(randomStudents[i].toString());
    }
}
