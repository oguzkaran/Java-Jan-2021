package org.csystem.app.game.ballfall;

import java.util.Scanner;

public final class BallFallGameApp {
    private BallFallGameApp()
    {
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        BallFall ballFall = new BallFall();
        for (;;) {
            System.out.print("Width değerini giriniz:");
            int width = Integer.parseInt(kb.nextLine());

            if (width <= 0)
                break;

            System.out.print("Height değerini giriniz:");
            int height = Integer.parseInt(kb.nextLine());

            ballFall.play(width, height);
            String shape = ballFall.getShape();

            System.out.println(shape);
        }
    }
}