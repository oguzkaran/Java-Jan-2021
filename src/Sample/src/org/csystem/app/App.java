/*----------------------------------------------------------------------------------------------------------------------
    enum türünün ordinal isimli non-static metodu referansa ilişkin nesnenin adresini tutan enum sabitinin
    sıra numarasını döndürür. Ordinal numarası sıfırdan başlar. enum türünün toString metodu vardır ve sabitin
    yazı karşılığını döndürür. enum türünün values static metodu ile enum sabitlerine ilişkin dizinin bir
    kopyası elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        DayOfWeek dayOfWeek = DayOfWeek.WED;

        System.out.printf("Ordinal:%d%n", dayOfWeek.ordinal());
        System.out.println(dayOfWeek.toString());

        System.out.println("--------------------------");
        for (DayOfWeek dow : DayOfWeek.values())
            System.out.println(dow.toString());

        System.out.println("--------------------------");

        int ordinal = 4;

        dayOfWeek = DayOfWeek.values()[ordinal];

        System.out.println(dayOfWeek.toString());
    }
}

enum DayOfWeek {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

