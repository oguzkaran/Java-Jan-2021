package org.csystem.app.sample.devices;

public class DeviceFactory {
    private String [] m_devicesStr;

    private void loadDevicesStr()
    {
        m_devicesStr = new String[] {
                "Weather sensor\0:23000:\0:192.168.1.123",
                "Humidity\0:33000:\0:192.168.2.223",
                "Test Sensor\0:40000:\0:192.168.3.123",
        };
    }

    public DeviceFactory()
    {
        loadDevicesStr();
    }

    public Device [] getDevices()
    {
        Device [] devices = new Device[m_devicesStr.length];

        for (int i = 0; i < m_devicesStr.length; ++i) {
            String deviceStr = m_devicesStr[i];

            int firstNullCharIndex = deviceStr.indexOf('\0');
            //...

            int lastNullCharIndex = deviceStr.lastIndexOf('\0');
            //...

            int port = Integer.parseInt(deviceStr, firstNullCharIndex + 2, lastNullCharIndex - 1, 10); //Since Java 9

            String name = deviceStr.substring(0, firstNullCharIndex);
            String host = deviceStr.substring(lastNullCharIndex + 2);
            devices[i] = new Device(name, host, port);
        }

        return devices;
    }
}



