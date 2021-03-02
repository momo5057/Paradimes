import java.awt.Graphics;
import java.util.Random;
public class RobberCar extends Car
{
	Random random = new Random();
	private int xRatio = (random.nextInt(10)-5);
	private int yRatio = (random.nextInt(10)-5);
	private boolean cap = false;
	int move = 40;
	private static int capCount=0;
	private boolean escaped;
	private static int escapeCount = 0;
	public RobberCar(int x, int y, int gas, String image)
	{	
		super("Robber Car", gas, new Engine("V8", 20, 200), 300, 300, image);		
		fillUp();
	}		
	public void updateState()
	{
		drive(move, xRatio, yRatio);
	}
	public void updateImage(Graphics g)
	{
		super.updateImage(g);
	}
    public void updateScene(int width, int height)
    {
    	if((locationX < 0 || locationX > width || locationY < 0 || locationY > height) && escaped == false)
    	{
    		escapeCount++;
    		escaped = true;
    		//move = 0;
    	}
    	updateState();
    }
    public void captured()
    {
		setImage("jail.jpg");
    	cap = true;
    	move = 0;
    	capCount++;
    	super.captured();    	
    }
    @Override
    public boolean isCaptured()
    {
    	return cap;
    }
    @Override
    public boolean hasEscaped()
    {
    	return escaped;
    }
}