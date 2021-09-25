/*----------------------------------------------------------------------------------------------------------------------
	twr bloğu yalnız başına olabilir. Scanner sınıfı Closeable arayüzünü destekler
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        try (Scanner kb = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz:");
            int val = Integer.parseInt(kb.nextLine());

            System.out.println(val * val);
        }
    }
}

