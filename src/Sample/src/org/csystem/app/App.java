/*----------------------------------------------------------------------------------------------------------------------
    Time sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Time;

class App {
    public static void main(String[] args)
    {
        Time time = new Time(5, 0, 23, 123);

        System.out.println(time.toShortTimeString());
        System.out.println(time.toString());
        System.out.println(time.toLongTimeString());

        time.setMinute(0);

        System.out.println(time.toShortTimeString());
        System.out.println(time.toString());
        System.out.println(time.toLongTimeString());
    }
}

