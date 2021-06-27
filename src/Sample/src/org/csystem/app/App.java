/*----------------------------------------------------------------------------------------------------------------------
    LongValue sınıfı ve test kodu
    Kullanım biçimine odaklanınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.wrapper.IntValue;
import org.csystem.util.wrapper.LongValue;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        LongValue n = LongValue.of(Long.parseLong(kb.nextLine()));
        LongValue result = LongValue.ZERO;

        for (LongValue i = LongValue.ONE; i.compareTo(n) <= 0; i = i.increment())
            result = result.add(i);

        System.out.println(result.toString());
    }
}

