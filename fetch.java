public class FetchKarel extends SuperKarel
{
    public void run()
    {
        turnLeft();
        for (int i = 0; i < 4; i++)
        {
            move();
        }

        turnRight();
        move();
        move();
        takeBall();
        move();
        turnRight();

        for (int i = 0; i < 4; i++)
        {
            move();
        }
       
        turnRight();
        move();
        move();
        move();
        turnAround();
        putBall();
    }
//CONTINUE

    private void ff()
    {
        move();
    }

    private void ee()
    {
        move();
    }

    private void gg()
    {
        move();
    }
}