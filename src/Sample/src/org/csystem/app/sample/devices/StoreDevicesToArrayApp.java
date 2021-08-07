package org.csystem.app.sample.devices;

import java.util.Random;
import java.util.Scanner;

public final class StoreDevicesToArrayApp {
    private static Device [] enlarge(Device [] devices, int newCapacity)
    {
        Device [] result = new Device[newCapacity];

        for (int i = 0; i < devices.length; ++i)
            result[i] = devices[i];

        return result;
    }

    private StoreDevicesToArrayApp()
    {
    }

    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Başlangıç capacity değerini giriniz:");
        Device [] devices = new Device[Integer.parseInt(kb.nextLine())];

        int idx = 0;

        for (;;) {
            System.out.print("Cihaz adını giriniz:");
            String name = kb.nextLine();

            if ("elma".equals(name))
                break;

            System.out.print("Cihaz ip adresini giriniz:");
            String host = kb.nextLine();

            System.out.print("Cihaz port numarasını giriniz:");
            int port = Integer.parseInt(kb.nextLine());

            if (idx == devices.length)
                devices = enlarge(devices, devices.length == 0 ? 1 : devices.length * 2);

            devices[idx++] = new Device(name, host, port, r.nextBoolean());

            System.out.printf("Capacity:%d%n", devices.length);
            System.out.printf("Size:%d%n", idx);
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < idx; ++i)
            System.out.println(devices[i].toString());

        System.out.printf("Capacity:%d%n", devices.length);
        System.out.printf("Size:%d%n", idx);
    }
}
