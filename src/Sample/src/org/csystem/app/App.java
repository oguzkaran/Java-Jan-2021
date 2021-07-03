/*----------------------------------------------------------------------------------------------------------------------
    Fraction sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.math.Fraction;

class App {
    public static void main(String[] args)
    {
        Fraction f = new Fraction();

        System.out.println(f.toString());

        f.setDenominator(0);

        System.out.println(f.toString());

    }
}