/*----------------------------------------------------------------------------------------------------------------------
    this ve super ctor sentaksı aynı anda bulunamazlar. Böyle bir durumla karşılaşan programcu yazdığı koda ve tasarımına
    bakmalıdır. Çünkü doğru bir tasarım (yaklaşım) ve kodlama programcıyı bu şekilde bir kullanıma zaten getirmez
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        new A(10);
    }
}

class B extends A {
    public B()
    {
        System.out.println("B.B()");
    }

    public B(int a)
    {
        this();
        super(a); //error

        System.out.println("B.B(int)");
    }
}
class A {
    public A()
    {
        System.out.println("A.A()");
    }

    public A(int a)
    {
        System.out.println("A.A(int)");
    }
}