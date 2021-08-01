/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın metotlarının aynı referans üzerinden zincir biçiminde aşağıdaki gibi çağrılabilmesi için implementasyonda
    this referansı kullanılmalıdır (fluent)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.wrapper.MutableIntValue;

class App {
    public static void main(String[] args)
    {
        MutableIntValue intValue = new MutableIntValue(10);

        intValue.add(3).multiply(2).subtract(4);

        System.out.println(intValue.getVal());

        int val = intValue.setVal(20).subtract(3).multiply(4).add(5).getVal();

        //...

        System.out.println(val);
    }
}

