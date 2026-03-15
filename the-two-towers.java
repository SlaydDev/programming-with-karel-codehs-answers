public class TowerKarel extends Karel
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
        turnLeft();
        turnLeft();
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

    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}