public class ManyHurdlesKarel extends SuperKarel
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            // Move forward until the hurdle (up to 3 steps, but stop if there’s a wall)
            if (frontIsClear())
            {
                move();
            }
            if (frontIsClear())
            {
                move();
            }
            if (frontIsClear())
            {
                move();
            }

            jumpHurdle();
        }
    }

    public void jumpHurdle()
    {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
}