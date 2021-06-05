/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının en fazla 3(üç) basamaklı ayrılmış sayılarından
	oluşan int türden diziyi döndüren getDigitsInThrees metodunu NumberUtil sınıfı içerisinde yazınız ve test ediniz:
	Örnek:
	12345678 -> 12 345 678
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        String str = "1@Oğuz Karan@10/09/1976@Matematik@78@100";

        String [] info = str.split("@");

        for (int i = 0; i < info.length; ++i)
            System.out.println(info[i]);

        double midtermGrade = Integer.parseInt(info[info.length - 2]);
        double finalGrade = Integer.parseInt(info[info.length - 1]);
        double grade = midtermGrade * 0.4 + finalGrade * 0.6;

        System.out.println(grade > 50 ? "Geçti" : "Kaldı");
    }
}
