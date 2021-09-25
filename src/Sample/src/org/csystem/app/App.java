/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte devices referansına ilişkin ArrayList nesnesine yeni bir eleman eklenmiştir. clone
	referansına ilişkin ArrayList nesnesinin bundan haberi olmaz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList devices = new ArrayList();

        devices.add(new DeviceInfo(1, "test", 5050));
        devices.add(new DeviceInfo(2, "sensor", 5051));
        devices.add(new DeviceInfo(3, "mest", 5698));

        System.out.printf("devices:%s%n", devices);

        ArrayList clone = (ArrayList)devices.clone();

        System.out.printf("clone:%s%n", clone);

        System.out.println("------------------------------------------------");

        devices.add(new DeviceInfo(5, "weathersensor", 9898));

        System.out.printf("devices:%s%n", devices);
        System.out.printf("clone:%s%n", clone);
    }
}

class DeviceInfo {
    private int m_id;
    private String m_name;
    private int m_port;

    public DeviceInfo() {}

    public DeviceInfo(int id, String name, int port)
    {
        //...
        m_id = id;
        m_name = name;
        m_port = port;
    }

    public int getId()
    {
        return m_id;
    }

    public void setId(int id)
    {
        //...
        m_id = id;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        //...
        m_name = name;
    }

    public int getPort()
    {
        return m_port;
    }

    public void setPort(int port)
    {
        //...
        m_port = port;
    }
    public String toString()
    {
        return String.format("[%d]%s:%d", m_id, m_name, m_port);
    }
}

