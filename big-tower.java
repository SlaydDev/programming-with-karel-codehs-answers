/* This program draws a big tower from Karel's starting spot */
public class BigTowerKarel extends SuperKarel
{
    public void run()
    {
        while(facingSouth())
        {
            for(int i = 0; i < 2; i++)
            {
                turnLeft();
            }
        }
        while(facingWest())
        {
            turnRight();
        }
        while(facingEast())
        {
            turnLeft();
        }
        while(frontIsClear())
        {
            putBall();
            move();
        }
        while(noBallsPresent())
        {
            putBall();
        }
    }
    public void ohyeahhhhhhh()
    {
        turnLeft();
    }
    public void mhhmmmmmmm()
    {
        turnLeft();
    }
}