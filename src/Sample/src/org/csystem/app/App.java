/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Sample s;

        s = new Sample(); //rc1:1

        {
            Sample k;

            k = s; //rc1:2
            Mample.foo(s); //rc1:3 -> rc1:4
            //rc1:3->rc1:2
        } //rc1:1
        s = new Sample(); //rc1:0 (garbage collected), rc2:1
        //...
    }
}

class Mample {
    public static void foo(Sample s)
    {
        Sample k;

        //...

        k = s;

        //...
    }
}

class Sample {
    //...
}


