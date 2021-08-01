package org.csystem.app.sample.devices;

public final class DeviceUtil {
    private DeviceUtil()
    {
    }

    public static Device findFirstDeviceByName(Device [] devices, String name)
    {
        for (Device dev : devices)
            if (dev.getName().equals(name))
                return dev;

        return null;
    }

    //...
}
