package org.csystem.app.sample.devices;

public class DevicesApp {
    private DevicesApp()
    {
    }

    public static void run()
    {
        DeviceFactory factory = new DeviceFactory();

        for (Device device : factory.getDevices()) {
            device.setOpen(true);
            System.out.println(device.toString());
        }
    }
}
