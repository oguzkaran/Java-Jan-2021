/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki durumlardan en az biri varsa veri elemanının gizlenmesi gerekir:
    
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class Device {
    private String m_name;
    private String m_host;
    private int m_port;
    private boolean m_open;

    //...

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public String getHost()
    {
        return m_host;
    }

    public void setHost(String host)
    {
        m_host = host;
    }

    public int getPort()
    {
        return m_port;
    }

    public void setPort(int port)
    {
        m_port = port;
    }

    public boolean isOpen()
    {
        return m_open;
    }

    public void setOpen(boolean open)
    {
        m_open = open;
    }
}

