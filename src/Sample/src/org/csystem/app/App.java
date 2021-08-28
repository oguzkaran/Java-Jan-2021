/*----------------------------------------------------------------------------------------------------------------------
    Throwable paraemetreli catch bloğu tüm fırlatılan exception nesnelerini yakalayabilir. Şüphesiz Throwable parametreli
    catch bloğunun tüm catch bloklarından sonra yazılması gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("Bir sayı giriniz:");
            double val = Double.parseDouble(kb.nextLine());

            System.out.printf("log(%.2f) = %f%n", val, MathUtil.myLog(val));
        }
        catch (YourException ex) {
            System.out.println("YourException yakalandı");
        }
        catch (MyException ex) {
            System.out.println("MyException yakalandı");
        }
        catch (Throwable ex) {
            System.out.println("Exception yakalandı");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class MathUtil {
    public static double myLog(double val)
    {
        if (val == 0)
            throw new MyException();

        if (val < 0)
            throw new YourException();

        return Math.log(val);
    }
}

class MyException extends RuntimeException {

}

class YourException extends MyException {

}

