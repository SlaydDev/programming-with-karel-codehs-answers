// Add comments to each of your methods
public class TwoTowersKarel extends Karel
{
	public void run()
	{
    	move();
        buildTower();
        comeDown();
        move();
        move();
        buildTower();
        move();
        turnRight();
	}
    
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    
    private void comeDown()
    {
        turnAround();
        move();
        move();
        turnLeft();
    }
    
    private void buildTower()
    {
        turnLeft();
        putBall();
        move();
        putBall();
        move();
        putBall();
    }
}