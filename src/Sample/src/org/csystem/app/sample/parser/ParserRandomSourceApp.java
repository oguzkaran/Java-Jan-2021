package org.csystem.app.sample.parser;

import java.util.Random;

public final class ParserRandomSourceApp {
    private ParserRandomSourceApp()
    {
    }

    public static void run()
    {
        Random random = new Random();
        Parser parser = new Parser();
        RandomSourceFactory factory = new RandomSourceFactory(random);
        int n = random.nextInt(10) + 20;

        while (n-- > 0) {
            parser.setSource(factory.createSource());
            System.out.printf("Rakam sayısı:%d%n", parser.countDigits());
            System.out.printf("Boşluk sayısı:%d%n", parser.countWhitespaces());
            System.out.println("--------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
