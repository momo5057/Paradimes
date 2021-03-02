import java.awt.Graphics;
import java.util.Random;

public class CopCar extends Car
{
	Random random = new Random();
	private static int xRatio;
	private static int yRatio;
	public CopCar(int x, int y)
	{
		super("Cop Car", 30, new Engine("V8", 30, 100), x, y, "cop-car.jpg");	
		xRatio = (random.nextInt(10)-5);
		yRatio = (random.nextInt(10)-5);
		fillUp();
	}
	public void update(Graphics g) {
		//locationX = locationX + xRatio;
		//locationY = locationY + yRatio;
		drive(20, xRatio, yRatio);
		super.update(g);	
	}
}

