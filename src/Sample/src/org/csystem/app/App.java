/*----------------------------------------------------------------------------------------------------------------------
    Java 5 ile birlikte aşağıdaki gibi ikinci [] içerisinde uzunluk bilgisi yazıldığında dizi dizisinin her bir
    elemanının gösterdiği dizilerin hepsi o uzunlukta yaratılır. Yani örnekte matrisin satır sayısı verilmiş olur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz:");
        int m = Integer.parseInt(kb.nextLine());

        System.out.print("Sütun sayısını giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        int [][] a = new int[m][n];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                a[i][j] = r.nextInt(100);

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j)
                System.out.printf("%02d ", a[i][j]);
            System.out.println();
        }
    }
}
