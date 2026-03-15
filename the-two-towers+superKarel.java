public class TwoTowersKarel extends SuperKarel
{
    public void run()
    {
        buildTower();
        buildTower2();
    }

    private void buildTower()
    {
        move();
        turnLeft();
        putBall();
        move();
        putBall();
        move();
        putBall();
        turnAround();
        move();
        move();
        turnLeft();
    }

    private void buildTower2()
    {
        move();
        move();
        turnLeft();
        putBall();
        move();
        putBall();
        move();
        putBall();
        move();
        turnRight();
    }
}