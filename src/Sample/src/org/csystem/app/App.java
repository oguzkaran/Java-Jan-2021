/*----------------------------------------------------------------------------------------------------------------------
    Car, Plane ve Engine sınnıfları arasındaki ilişkiler
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Car car = new Car(/*...*/);
        Plane plane = new Plane(4/*...*/);

        car.run();
        System.out.println("-------------------------");
        plane.fly();
    }
}

class Plane {
    private Engine [] m_engines;

    private void startEngines()
    {
        for (Engine engine : m_engines)
            engine.startEngine();
    }

    private void accelerateEngines()
    {
        for (Engine engine : m_engines)
            engine.accelerateEngine();
    }

    private void slowEngines()
    {
        for (Engine engine : m_engines)
            engine.slowEngine();
    }

    private void stopEngines()
    {
        for (Engine engine : m_engines)
            engine.stopEngine();
    }

    //...

    public Plane(int n/*...*/)
    {
        m_engines = new Engine[n];

        for (int i = 0; i < n; ++i)
            m_engines[i] = new Engine(/*...*/);
    }

    //...

    public void fly()
    {
        startEngines();
        accelerateEngines();
        System.out.println("flying");
        slowEngines();
        //...
        stopEngines();
    }
}

class Car {
    private Engine m_engine;

    public Car(/*...*/)
    {
        //...
        m_engine = new Engine(/*...*/);
        //...
    }

    //...

    public void brake()
    {
        System.out.println("Car.brake");
        m_engine.slowEngine();
    }

    public void run()
    {
        m_engine.startEngine();
        m_engine.accelerateEngine();

        //....
        System.out.println("Running");

        brake();
        m_engine.stopEngine();
    }
}

class Engine {
    //...
    public void startEngine()
    {
        System.out.println("Start engine");
    }

    public void accelerateEngine()
    {
        System.out.println("Accelerate engine");
    }

    public void slowEngine()
    {
        System.out.println("Slow engine");
    }

    public void stopEngine()
    {
        System.out.println("Stop engine");
    }

    //...
}
