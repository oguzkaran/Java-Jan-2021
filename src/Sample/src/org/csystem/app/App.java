/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının initialCapacity parametreli ctor'u ile başlangıç capacity değeri belirlenebilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Vector;

class App {
    public static void main(String[] args)
    {
        Vector numbers = new Vector(32);

        System.out.printf("Capacity:%d%n", numbers.capacity());
        System.out.printf("Size:%d%n", numbers.size());
    }
}



