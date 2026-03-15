// This program has Karel solve the maze and find the ball
class MazeKarel extends Karel
{
    public void run()
    {
        while(frontIsClear())
        {
            move();
            if(frontIsBlocked())
            {
                turnLeft();
            }
        }

        turnLeft();
        turnLeft();

        while(frontIsClear())
        {
            move();
            if(frontIsBlocked())
            {
                turnLeft();
                turnLeft();
                turnLeft();
            }
            if(frontIsBlocked())
            {
                turnLeft();
            }

            while(frontIsClear())
            {
                move();
                if(frontIsBlocked())
                {
                    turnLeft();
                    turnLeft();
                    turnLeft();
                }
                if(frontIsBlocked())
                {
                    turnLeft();
                    turnLeft();
                }
            }
        }

        turnLeft();
        turnLeft();
        turnLeft();
    }
}