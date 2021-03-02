import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
class Model
{
	private int i = 1;
    private ArrayList<Sprite> sprite = new ArrayList<Sprite>();
    
    Model() throws IOException 
    {
    	
    	sprite.add(new Bank());
    }

    public void update(Graphics g) 
    {
    	for(int i = 0; i < sprite.size(); i++)
    	{
    		sprite.get(i).updateImage(g);	
    	}
    		
    }
    public void add(int x, int y)
    {
    	sprite.add(new Bank());
    	
    	if(i == 0)
    	{
    		sprite.add(new CopCar(x, y));
    		i++;
    	}
    	else
    	{
    		sprite.add(new RobberCar(x, y, 5000, "red-car.jpg"));
    		i--;
    	}
    }
    public void updateScene(int width, int height)
    {
    	for(int i = 1; i < sprite.size(); i++)
    	{
    		sprite.get(i).updateScene(width, height);	
    		if(sprite.get(i) instanceof CopCar)
    		{
    			for(int a = 1; a < sprite.size(); a++)
    			{
    				if(sprite.get(a) instanceof RobberCar && sprite.get(a).overlaps(sprite.get(i)) && sprite.get(a).isCaptured()==false)
    				{
    					sprite.get(a).captured();
    				}
    			}

    		}
    	}
    	Iterator<Sprite> itr = sprite.iterator();
    	while(itr.hasNext())
    	{
    		if(itr.next().hasEscaped())
    		{
    			itr.remove();
    			System.out.println("I'm free!");
    		}
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    	



