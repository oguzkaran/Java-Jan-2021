/*----------------------------------------------------------------------------------------------------------------------
    Bir metodun fırlatabileceği checked exception sınıfları arasında türetme ilişkisi varsa throws listesine istenirse
    yalnızca taban sınıf yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String [] args)
    {
        try {
            double val = Console.readDouble("Bir sayı giriniz:", "Hatalı giriş yaptınız:");

            double result = MathUtil.myLog(val);

            System.out.printf("log(%.2f) = %f%n", val, result);
        }
        catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class MathUtil {
    public static double myLog(double val) throws MathZeroException
    {
        if (val == 0)
            throw new MathZeroException("val can be zero");

        if (val < 0)
            throw new MathNegativeException("val can be zero");

        return Math.log(val);
    }
}

class MathZeroException extends Exception {
    public MathZeroException(String message)
    {
        super(message);
    }
}


class MathNegativeException extends MathZeroException {
    public MathNegativeException(String message)
    {
        super(message);
    }
}
