import java.awt.Graphics;
import java.util.Random;

public class CopCar extends Car
{
	Random random = new Random();
	private static int xRatio;
	private static int yRatio;
	private int xMove = 1;
	private int yMove = 1;
	public CopCar(int x, int y)
	{
		super("Cop Car", 5000, new Engine("V8", 30, 100), x, y, "cop-car.jpg");	
		xRatio = (random.nextInt(10)-5);
		yRatio = (random.nextInt(10)-5);
		fillUp();	
	}
	public void updateState()
	{
		drive(20, (xRatio * xMove), (yRatio * yMove));
	}
	public void updateImage(Graphics g)
	{
		super.updateImage(g);
	}
    public void updateScene(int width, int height)
    {
   	
    	if(locationX <= 0)
    	{
    		xMove = xMove * (-1);
    	}
    	if(locationY <= 0)
    	{
    		yMove = yMove * (-1);
    	}
    	if(locationY >= height)
    	{
    		yMove = yMove * (-1);
    	}
    	if(locationX >= width)
    	{
    		xMove = xMove * (-1);
    	}		

    	updateState();
    	
    }
}














