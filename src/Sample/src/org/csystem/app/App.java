/*----------------------------------------------------------------------------------------------------------------------
    IllegalArgumentException sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        Random r = new Random();

        int n = Console.readInt("Bir sayı giriniz:");

        for (int i = 0; i < n; ++i) {
            try {
                int count = Console.readInt("Dizinin eleman sayısını giriniz:");
                int min = Console.readInt("Minimum değeri giriniz:");
                int max = Console.readInt("Maximum değeri giriniz:");

                int[] a = Util.getRandomArray(r, count, min, max);

                for (int val : a)
                    System.out.printf("%d ", val);

                System.out.println("\n---------------------------");
            }
            catch (IllegalArgumentException ex) {
                System.out.println("Geçersiz argüman(lar)");
            }
        }
    }
}

class Util {
    public static int [] getRandomArray(Random r, int n, int min, int max)
    {
        if (r == null || n <= 0 || min >= max)
            throw new IllegalArgumentException("Illegal Argument(s)");

        int [] a = new int[n];

        for (int i = 0; i < n; ++i)
            a[i] = r.nextInt(max - min) + min;

        return a;
    }
}