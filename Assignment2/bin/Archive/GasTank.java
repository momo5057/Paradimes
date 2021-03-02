
import java.text.DecimalFormat;
public class GasTank 
{
	private int capacity;
	private double level;
	private static DecimalFormat df = new DecimalFormat(".##");
	
	public GasTank(int cap)
	{
		if(cap > 0)
			capacity = cap;
		else
			capacity = 0;
		level = 0;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public double getLevel()
	{		
		return Double.valueOf(df.format(level));
	}
	public void setLevel(double levelIn)
	{
		if(levelIn < 0)
			level = 0;
		else if (levelIn > capacity)
			level = capacity;
		else
			level = levelIn;
	}
}