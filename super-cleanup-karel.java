// this is personally one of the most complicated java programs for me in codehs
public class SuperCleanupKarel extends SuperKarel
{
    public void run()
    {
        turnLeft();

        if(frontIsBlocked())
        {
            turnRight();
            clean();
        }
        else if(frontIsClear())
        {
            clean();
        }
    }

    private void cleanKarel()
    {
        for(int i = 0; i < 20; i++)
        {
            if(ballsPresent())
            {
                takeBall();
            }

            while(frontIsClear())
            {
                move();
                if(ballsPresent())
                {
                    takeBall();
                }
            }

            if(facingNorth())
            {
                turnRight();
                if(frontIsClear())
                {
                    move();
                    turnRight();
                }
            }
            else if(facingSouth())
            {
                turnLeft();
                if(frontIsClear()) // it works
                {
                    move();
                    turnLeft();
                }
            }
            else if(frontIsClear())
            {
                move();
            }
            else if(rightIsBlocked())
            {
                turnAround();
            }
        }
    }

    private void turnTo()
    {
        turnRight();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void turn()
    {
        turnLeft();
        move();
        turnLeft();
    }

    private void clean()
    {
        cleanKarel();

        if(rightIsClear())
        {
            turnTo();
            for(int i = 0; i < 100; i++)
            {
                cleanKarel();
            }
        }
        else if(frontIsClear())
        {
            for(int i = 0; i < 100; i++)
            {
                cleanKarel();
            }
        }
    }
}