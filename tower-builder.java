public class TowerBuilderKarel extends SuperKarel
{
    public void run()
    {
        buildTower();
        while (frontIsClear())
        {
            checkPath();
            buildTower();
        }
    }
    /*This method allows Karel to build
    a tower*/
    private void buildTower()
    {
        turnLeft();
        for(int i = 0; i < 2; i++)
        {
            putBall();
            move();
        }
        putBall();
        turnAround();
        move();
        move();
        turnLeft();
        if(frontIsClear())
        {
            move();
        }
    }
     /*This method allows Karel to go back down
     */
    private void backDown()
    {
        turnRight();
        move();
        move();
    }
     /*This method allows Karel to check the path
     */
    private void checkPath()
    {
        if (frontIsClear())
        {
            move();
        }
    }
}