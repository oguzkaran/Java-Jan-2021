package org.csystem.app.game.ballfall;

public class BallFall {
    public String shape;

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

    public void fillSpace(int begin, int end)
    {
        for (int i = begin; i < end; ++i)
            shape += ' ';
    }

    public void fillBall(int ballIndex, int end)
    {
        fillSpace(0, ballIndex);
        shape += '*';
        fillSpace(ballIndex + 1, end);
    }

    public BallFall()
    {
        shape = "";
    }

    public void play(int width, int height)
    {
        int ballIndex = 0;
        boolean isRight = true;

        shape = "";
        for (int i = 1; i <= height; ++i) {
            shape += '|';
            fillBall(ballIndex, width);
            isRight = updateRightFlag(ballIndex, isRight, width);
            if (width != 1)
                ballIndex = updateBallIndex(isRight, ballIndex);
            shape += "|\r\n";
        }
    }
}
