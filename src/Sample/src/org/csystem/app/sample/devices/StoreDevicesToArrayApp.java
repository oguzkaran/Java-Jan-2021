package org.csystem.app.sample.devices;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class StoreDevicesToArrayApp {
    private StoreDevicesToArrayApp()
    {
    }

    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Başlangıç capacity değerini giriniz:");
        ArrayList devices = new ArrayList(Integer.parseInt(kb.nextLine()));

        for (;;) {
            System.out.print("Cihaz adını giriniz:");
            String name = kb.nextLine();

            if ("elma".equals(name))
                break;

            System.out.print("Cihaz ip adresini giriniz:");
            String host = kb.nextLine();

            System.out.print("Cihaz port numarasını giriniz:");
            int port = Integer.parseInt(kb.nextLine());

            devices.add(new Device(name, host, port, r.nextBoolean()));
        }

        System.out.println("---------------------------------");

        for (Object obj : devices) {
            Device dev = (Device)obj;
            System.out.println(dev.toString());
        }
    }
}
