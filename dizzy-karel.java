public class DizzyKarel extends SuperKarel
{
    public void run()
    {
        // Spin Karel 32 times in total
        for(int i = 0; i < 32; i++)
        {
            turnLeft();
        }
    }
}