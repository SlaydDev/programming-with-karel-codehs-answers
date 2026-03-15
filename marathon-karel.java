public class MarathonKarel extends SuperKarel
{
    public void run()
    {
        // Move until Karel reaches column 27
        for (int i = 0; i < 26; i++)
        {
            if (ballsPresent())
            {
                takeBall();
            }
            move();
        }

        // Final tile check
        if (ballsPresent())
        {
            takeBall();
        }
    }
}