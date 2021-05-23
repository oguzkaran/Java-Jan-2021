/*----------------------------------------------------------------------------------------------------------------------
    [] operatörüne pozitif ya da bakımdan sınırlar dışında bir indeks numarası verilmesi durumunda exception oluşur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int [] a;

        a = new int[n];

        for (int i = 0; i < a.length; ++i)
            a[i] = i * 10;

        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
        System.out.println(a[5]);
    }
}

