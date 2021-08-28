/*----------------------------------------------------------------------------------------------------------------------
    Console sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String [] args)
    {
        double a = Console.readDouble("Birinci sayıyı giriniz:", "Hatalı giriş yaptınız:");
        double b = Console.readDouble("İkinci sayıyı giriniz:", "Hatalı giriş yaptınız:");

        System.out.printf("%f + %f = %f%n", a, b, a + b);
    }
}