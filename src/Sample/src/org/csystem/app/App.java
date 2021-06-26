/*----------------------------------------------------------------------------------------------------------------------
    final değişkenler:
    final anahtar sözcüğü ile bildirilen değişkenlerdir. 
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);

        s1.setX(10);

        System.out.println(s2.getX());
    }
}

class Singleton {
    private static Singleton ms_instance;

    private int m_x;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (ms_instance == null)
            ms_instance = new Singleton();

        return ms_instance;
    }

    public int getX()
    {
        return m_x;
    }

    public void setX(int x)
    {
        m_x = x;
    }

    //...
}
