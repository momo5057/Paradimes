
import java.awt.Graphics;
public class Car extends Sprite
{
	private String descript;
	private GasTank gas;
	private Engine eng;

	public Car(String des, int maxF, Engine e, int x, int y, String jpgName)
	{
		super(jpgName, x, y);
		if(e==null)
		{
			descript = "Generic car";
			e = new Engine("", 0, 0);
		}
		else
			descript = des;
		eng = e;
		gas = new GasTank(maxF);
	}
	public String getDescription()
	{
		return descript + "(engine: " + eng.getDescription() + ", fuel: " + gas.getLevel()
		         + "/" + gas.getCapacity() + ", location: (" + locationX + "," + locationY + ")";
	}
	public double getFuelLevel()
	{
		return gas.getLevel();
	}
	public int getMPG()
	{
		return eng.getMPG();
	}
	public void fillUp()
	{
		gas.setLevel(gas.getCapacity());
	}
	public int getMaxSpeed()
	{
		return eng.getSpeed();
	}
	public double drive(int distance, double xRation, double yRation)
	{
		if(distance > (getMPG() * getFuelLevel()))
		{
			distance = (int)getMPG() * (int)getFuelLevel();
			//System.out.printf("Ran out of gas after driving %d miles.%n", distance);
		}
		double z = Math.sqrt((xRation * xRation)+(yRation * yRation));
		z = distance / z;
		locationX += ((int)z * (int)xRation);
		locationY += ((int)z * (int)yRation);
		gas.setLevel(getFuelLevel()-((double)distance/getMPG()));
		return distance;
	}
	
	public void updateImage(Graphics g) {
		super.updateImage(g);
	}
    public void updateScene(int width, int height)
    {
    	super.updateState();
    }
    public void captured()
    {
    	super.captured();
    }
	
}
