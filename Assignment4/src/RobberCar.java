import java.awt.Graphics;
import java.util.Random;
public class RobberCar extends Car
{
	Random random = new Random();
	private int xRatio = (random.nextInt(10)-5);
	private int yRatio = (random.nextInt(10)-5);
	public RobberCar(int x, int y)
	{	
		super("Robber Car", 20, new Engine("V8", 20, 200), x, y, "red-car.jpg");		
		fillUp();
	}		
	@Override
	public void update(Graphics g) {
		//locationX = locationX + xRatio;
		//locationY = locationY + yRatio;
		drive(40, xRatio, yRatio);
		super.update(g);	
	}
}