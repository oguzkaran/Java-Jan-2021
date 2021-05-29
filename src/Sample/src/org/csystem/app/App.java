/*----------------------------------------------------------------------------------------------------------------------
    Partition algoritması: Bir dizinin içerisinde bulunan elemanlardan belirli koşula uyanları (mantıksal) solda, uymayanları
	sağda kalacak şekilde dizi üzerinde değişiklik yapmaktır. Bu algoritmada ikinci bir dizi kullanılmamalıdır.
	AraryUtil sınıfınmızda partition metodu bir eşik değerinden küçük olanları dizinin solunda büyük veya eşit
	olanları dizinin sağında toplayacak şekilde yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        PartitionTest.run();
    }
}

class PartitionTest {
    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i) {
            int [] a = ArrayUtil.getRandomArray(r, r.nextInt(20) + 1, 0, 100);
            int threshold = r.nextInt(220) - 110;
            System.out.println("--------------------------");
            System.out.printf("Threshold:%d%n", threshold);
            ArrayUtil.display(2, a);
            int partitionIndex = ArrayUtil.partition(a, threshold);
            System.out.printf("Partition point (index):%d%n", partitionIndex);
            ArrayUtil.display(2, a);
            System.out.println("--------------------------");
        }
    }
}

