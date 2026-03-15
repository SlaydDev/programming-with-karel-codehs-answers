/* This program has karel lay a diagonal row of tennis balls. */

public class Diagonal extends SuperKarel
{
    public void run()
    {
        while(frontIsClear())
        {
            putBall();
            move();
            turnLeft();
            move();
            for(int i = 0; i < 3; i++)
            {
                turnLeft();
            }
        }
        putBall();
    }
}