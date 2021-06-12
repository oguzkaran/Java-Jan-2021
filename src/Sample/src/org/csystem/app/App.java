/*----------------------------------------------------------------------------------------------------------------------
    for-each döngü deyimi ile dizi dizilerinin dolaşılması
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11}};

        for (int [] array : a) {
            for (int val : array)
                System.out.printf("%02d ", val);

            System.out.println();
        }
    }
}

