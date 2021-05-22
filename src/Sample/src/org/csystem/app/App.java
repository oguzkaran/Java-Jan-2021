/*----------------------------------------------------------------------------------------------------------------------
    Homework-002-4. sorunun bir çözümü.
    (Not: Çözümler import bildirimi dışında çalışma sorusunun verildiği tarihte görülen konulara göre yapılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        BallFallGameApp.run();
    }
}

class BallFall {
    public static void fillSpace(int begin, int end)
    {
        for (int i = begin; i < end; ++i)
            System.out.print(' ');
    }

    public static void fillBall(int ballIndex, int end)
    {
        fillSpace(0, ballIndex);
        System.out.print('*');
        fillSpace(ballIndex + 1, end);
    }

    public static boolean updateRightFlag(int ballIndex, boolean isRight, int width)
    {
        if (ballIndex == 0)
            isRight = true;
        else if (ballIndex == width - 1)
            isRight = false;

        return isRight;
    }

    public static int updateBallIndex(boolean isRight, int ballIndex)
    {
        if (isRight)
            ++ballIndex;
        else
            --ballIndex;

        return ballIndex;
    }

    public static void play(int width, int height)
    {
        int ballIndex = 0;
        boolean isRight = true;

        for (int i = 1; i <= height; ++i) {
            System.out.print('|');
            fillBall(ballIndex, width);
            isRight = updateRightFlag(ballIndex, isRight, width);
            if (width != 1)
                ballIndex = updateBallIndex(isRight, ballIndex);
            System.out.println('|');
        }
    }
}

class BallFallGameApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Width değerini giriniz:");
            int width = Integer.parseInt(kb.nextLine());

            if (width <= 0)
                break;

            System.out.print("Height değerini giriniz:");
            int height = Integer.parseInt(kb.nextLine());

            BallFall.play(width, height);
        }
    }
}


