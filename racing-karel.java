public class RacingKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i < 4; i++)
        {
            put8();
            race();
        }  
    }
//this puts 8 balls
private void put8()
    {
        for(int i = 0; i < 8; i++)
        {
            putBall();
        }
}

private void race()
    {
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
}
}