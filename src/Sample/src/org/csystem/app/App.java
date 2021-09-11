/*----------------------------------------------------------------------------------------------------------------------
    Fraction sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.math.Fraction;
import org.csystem.math.FractionException;
import org.csystem.util.console.Console;

import java.util.Random;

class App {
    public static void main(String [] args)
    {
        FractionTest.run();
    }
}

class FractionTest {
    public static void run()
    {
        Fraction f = new Fraction();
        Random r = new Random();

        int n = Console.readInt("Bir sayı giriniz:");

        while (n-- > 0) {
            try {
                f.setNumerator(r.nextInt(11) - -5);
                f.setDenominator(r.nextInt(11) - 5);

                System.out.println(f);
                System.out.println("---------------------------");
            }
            catch (FractionException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

