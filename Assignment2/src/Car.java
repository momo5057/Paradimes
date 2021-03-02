
public class Car 
{
	private String descript;
	private int xCor = 0;
	private int yCor = 0;
	private GasTank gas;
	private Engine eng;
	
	public Car(String des, int maxF, Engine e)
	{
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
		         + "/" + gas.getCapacity() + ", location: (" + xCor + "," + yCor + ")";
	}
	public int getX()
	{
		return xCor;
	}
	public int getY()
	{
		return yCor;
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
	public double drive(int distance, double xRation, double yRation) //FINISH ME
	{
		if(distance > (getMPG() * getFuelLevel()))
		{
			distance = (int)getMPG() * (int)getFuelLevel();
			System.out.printf("Ran out of gas after driving %d miles.%n", distance);
		}
		double z = Math.sqrt((xRation * xRation)+(yRation * yRation));
		z = distance / z;
		xCor += (int)z * xRation;
		yCor += (int)z * yRation;
		
		gas.setLevel(getFuelLevel()-((double)distance/getMPG()));
		return distance;
	}
	
}
