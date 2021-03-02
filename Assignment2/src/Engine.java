
public class Engine 
{
	private String engine;
	private int mpg;
	private int maxSpeed;
	
	public Engine(String eng, int gas, int speed)
	{
		if(eng.length()==0)
			engine = "Generic engine";
		else
			engine = eng;
		if(gas > 0)
			mpg = gas;
		else 
			mpg = 0;
		if(speed > 0)
			maxSpeed = speed;
		else
			maxSpeed = 0;
	}
	public String getDescription()
	{
		return engine + " (MPG: " + mpg + ", Max speed: " + maxSpeed + "))";
	}
	public int getMPG()
	{
		return mpg;
	}
	public int getSpeed()
	{
		return maxSpeed;
	}
}
