public class MyKarel extends SuperKarel
{
    public void run()
    {
        if (ballsPresent())
        {
            takeBall();
        }

        if (noBallsPresent())
        {
            putBall();
        }

        move();
    }
}