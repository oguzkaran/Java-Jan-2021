/*----------------------------------------------------------------------------------------------------------------------
    Sarmalayan sınıflar (wrapper classes): Java'da her temel (primitive, built-in) türe karşılık bir sınıf vardır. Bunun
    nedeni bu sınıfları tanıdıkça anlaşılacaktır. Bu sınıflar sarmalamanın dışında ilgili türe ilişkin bazı işlemlerin de
    yapılmasını sağlarlar. Örneğin Integer sınıfının parseInt metodu bir yazıdan int türden değer elde etmek için
    kullanılır.

    Temel türlere ilişkin sarmalayan sınıflar şunlardır:

    Temel Tür                   Sarmalayan sınıf
    --------------------------------------------
    short                           Short
    int                             Integer
    long                            Long
    byte                            Byte
    double                          Double
    float                           Float
    char                            Character
    bool                            Boolean

    
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        SampleFactory factory = new SampleFactory();
        A x;

        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        while (n-- > 0) {
            System.out.println("------------------------------");
            x = factory.getRandomA();
            System.out.println(x.getClass().getName());

            if (!(x instanceof B))
                continue;

            B b = (B)x;

            b.foo();
            System.out.println("------------------------------");
        }
    }
}

class SampleFactory {
    private final Random m_random = new Random();

    public A getRandomA()
    {
        int val = m_random.nextInt(4);
        A x;

        switch (val) {
            case 0:
                x = new B();
                break;
            case 1:
                x = new C();
                break;
            case 2:
                x = new D();
                break;
            default:
                x = new A();
        }

        return x;
    }
}

class D extends A {
    //..
}

class C extends B {
    //...
}

class B extends A {
    public void foo()
    {
        System.out.println("B.foo");
    }
    //...
}

class A {
    //...
}
