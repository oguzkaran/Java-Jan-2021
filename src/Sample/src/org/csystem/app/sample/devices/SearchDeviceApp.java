package org.csystem.app.sample.devices;

import java.util.Scanner;

public class SearchDeviceApp {
    private SearchDeviceApp()
    {
    }

    public static void run()
    {
        Device [] devices = new DeviceFactory().getDevices();

        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Cihaz ismini giriniz:");
            String name = kb.nextLine();

            if (name.isBlank())
                break;

            Device device = DeviceUtil.findFirstDeviceByName(devices, name);

            if (device != null)
                System.out.println(device.toString());
            else
                System.out.printf("%s isimli cihaz bulunamadı%n", name);
        }
    }
}
