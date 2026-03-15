public class DoubleTennisBallsKarel extends SuperKarel
{
    public void run()
    {
        move();
        doubleBalls();
        move();
        turnAround();
        putBack();
        goHome();
    }

    // this doubles the pile of balls
    private void doubleBalls()
    {
        while (ballsPresent())
        {
            takeBall();
            move();
            putBall();
            putBall();
            turnAround();
            move();
            turnAround();
        }
    }

    private void putBack()
    {
        while (ballsPresent())
        {
            takeBall();
            move();
            putBall();
            // putBall();
            turnAround();
            move();
            turnAround();
        }
    }

    private void goHome()
    {
        move();
        move();
        turnAround();
    }
}