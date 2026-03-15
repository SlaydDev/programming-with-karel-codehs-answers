public class MidpointKarel extends SuperKarel
{
    public void run()
    {
        turnLeft();
        while(frontIsClear())
        {
            move();
            if(frontIsClear())
        {
            move();
            turnRight();
            move();
            turnLeft();
        }
}
        turnAround();
        while(frontIsClear())
        {
            move();
        }
            turnLeft();
            putBall();
        }
}