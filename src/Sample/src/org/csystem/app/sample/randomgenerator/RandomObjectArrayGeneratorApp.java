package org.csystem.app.sample.randomgenerator;

import org.csystem.math.Fraction;
import org.csystem.util.ArrayUtil;
import org.csystem.util.datetime.Date;
import org.csystem.util.wrapper.IntValue;

import java.util.Random;
import java.util.Scanner;

public class RandomObjectArrayGeneratorApp {
    private RandomObjectArrayGeneratorApp()
    {
    }

    public static void run()
    {
        Random random = new Random();
        RandomObjectArrayFactory factory = new RandomObjectArrayFactory(random);
        Scanner kb = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (Object object : factory.getObjects(count)) {
            String typeName = object.getClass().getName();

            System.out.printf("Dinamik tür ismi:%s%n", typeName);

            if (object instanceof String) {
                String s = (String)object;

                System.out.printf("Yazı:%s%n", s);
                System.out.printf("Yazı:%s%n", s.toUpperCase());
            }
            else if (object instanceof Fraction) {
                Fraction f = (Fraction)object;

                f.increment();

                System.out.println(f.toString());
            }
            else if (object instanceof Integer) {
                int val = (int)object;

                System.out.println(val * val);
            }
            else if (object instanceof Random) {
                Random r = (Random)object;

                System.out.println(r.nextDouble());
            }
            else if (object instanceof int[]) {
                int [] a = (int[])object;

                ArrayUtil.display(2, a);
            }
            else if (object instanceof Date) {
                Date date = (Date)object;

                System.out.println(date.toLongDateStringTR());
            }
            else if (object instanceof Double) {
                double val = (double)object;

                System.out.println(val);
            }
            else if (object instanceof Character) {
                char ch = (char)object;

                System.out.println(ch);
            }
            else if (object instanceof Boolean) {
                boolean b = (boolean)object;

                System.out.println(b);
            }

            System.out.println("-----------------------------------------------");
        }
    }
}
