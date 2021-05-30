/*----------------------------------------------------------------------------------------------------------------------
    Referans dizileri:

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.StringUtil;

class App {
    public static void main(String[] args)
    {
        GetRandomTextTest.run();
    }
}

class GetRandomTextTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        java.util.Random r = new java.util.Random();

        for (;;) {
            System.out.print("Bir sayı giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            System.out.println("----------------------");
            System.out.println(StringUtil.getRandomTextTR(r, n));
            System.out.println(StringUtil.getRandomTextEN(r, n));
            System.out.println("----------------------");
        }
    }
}
