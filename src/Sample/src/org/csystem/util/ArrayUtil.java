/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import java.util.Random;

public class ArrayUtil {
    public static void bubbleSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k] > a[k + 1])
                    swap(a, k, k + 1);
    }

    public static void bubbleSortDescending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k] < a[k + 1])
                    swap(a, k, k + 1);
    }

    public static void selectionSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i) {
            int min = a[i];
            int minIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }
            a[minIndex] = a[i];
            a[i] = min;
        }
    }

    public static void selectionSortDescending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i) {
            int max = a[i];
            int maxIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (a[k] > max) {
                    max = a[k];
                    maxIndex = k;
                }
            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    public static void addBy(int [] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] += val;
    }

    public static double average(int [] a)
    {
        return (double)sum(a) / a.length;
    }

    public static void bubbleSort(int [] a, boolean desc)
    {
        if (desc)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    public static void bubbleSort(int [] a)
    {
        bubbleSortAscending(a);
    }

    public static void display(int [] a)
    {
        display(1, a);
    }

    public static void display(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i]);

        System.out.println();
    }

    public static void fillRandomArray(int [] a, int min, int max) //[min, max)
    {
        fillRandomArray(new Random(), a, min, max);
    }

    public static void fillRandomArray(Random r, int [] a, int min, int max) //[min, max)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(max - min) + min;
    }

    public static int [] getRandomArray(int n, int min, int max) //[min, max)
    {
        return getRandomArray(new Random(), n, min, max);
    }

    public static int [] getRandomArray(Random r, int n, int min, int max) //[min, max)
    {
        int [] a = new int[n];

        fillRandomArray(r, a, min, max);

        return a;
    }

    public static int min(int [] a)
    {
        int minVal = a[0];

        for (int i = 1; i < a.length; ++i)
            if (a[i] < minVal)
                minVal = a[i];

        return minVal;
    }

    public static int max(int [] a)
    {
        int maxVal = a[0];

        for (int i = 1; i < a.length; ++i)
            if (a[i] > maxVal)
                maxVal = a[i];

        return maxVal;
    }

    public static void multiplyBy(int [] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] *= val;
    }

    public static int partition(int [] a, int threshold)
    {
        int partitionIndex = 0;

        while (partitionIndex != a.length && a[partitionIndex] < threshold)
            ++partitionIndex;

        if (partitionIndex == a.length)
            return partitionIndex;

        for (int i = partitionIndex + 1; i < a.length; ++i)
            if (a[i] < threshold)
                swap(a, i, partitionIndex++);

        return partitionIndex;
    }

    public static void reverse(int [] a)
    {
         int halfLength = a.length / 2;

         for (int i = 0; i < halfLength; ++i)
             swap(a, i, a.length - 1 - i);
    }

    public static void selectionSort(int [] a, boolean desc)
    {
        if (desc)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }

    public static void selectionSort(int [] a)
    {
        selectionSortAscending(a);
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }
}
