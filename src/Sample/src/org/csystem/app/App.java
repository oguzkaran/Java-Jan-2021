/*----------------------------------------------------------------------------------------------------------------------
    CSDArrayList
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.StringUtil;
import org.csystem.util.collection.CSDArrayList;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        CSDArrayList passwords = new CSDArrayList();
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < 12; ++i)
            passwords.add(StringUtil.getRandomTextTR(r, r.nextInt(6) + 5));

        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("--------------------------");

        passwords.ensureCapacity(15);

        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("--------------------------");

        passwords.ensureCapacity(32);

        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("--------------------------");

        passwords.ensureCapacity(90);

        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("--------------------------");
    }
}
