import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

class Model
{
	private int i = 1;
    private ArrayList<Car> sprite = new ArrayList<Car>();
    
    Model() throws IOException 
    {
    	
    	sprite.add(new CopCar(0, 0));
    }

    public void update(Graphics g) 
    {
    	for(int i = 0; i < sprite.size(); i++)
    	{
    		sprite.get(i).update(g);	
    	}
    		
    }
    public void add(int x, int y)
    {

    	if(i == 0)
    	{
    		sprite.add(new CopCar(x, y));
    		i++;
    	}
    	else
    	{
    		sprite.add(new RobberCar(x, y));
    		i--;
    	}
    }
    public void fillUp()
    {
    	for(int i = 0; i < sprite.size(); i++)
    	{
    		sprite.get(i).fillUp();	
    	}
    }
    
}
    	



