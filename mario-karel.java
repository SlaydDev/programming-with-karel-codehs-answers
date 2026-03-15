public class CoinKarel extends Karel
{
    public void run()
    {
        move();
        collectCoins();

        move();
        move();
        collectCoins();

        move();
        move();
        collectCoins();

        move();
        move();
        collectCoins();
    }

    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void collectCoins()
    {
        turnLeft();
        move();
        move();
        move();
        takeBall();
        takeBall();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
    }
}