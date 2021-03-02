import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

class Sprite
{
	private String jpgName;
	protected int locationX;
	protected int locationY;
	private Image image;

	public Sprite(String jpgName, int x, int y)
	{
		setImage(jpgName);
		locationX = x;
		locationY = y;
	}
	
	public int getX() {	return locationX; }
	public int getY() {	return locationY; }
	public void setX(int x) { locationX = x; }
	public void setY(int y) { locationY = y; }
	
	public void setImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException ioe) {
            System.out.println("Unable to load image file.");
        }
	}
	public Image getImage() { return image; }	
	public void updateImage(Graphics g) {
		g.drawImage(getImage(), getX(), getY(), 60, 60, null);
	}
	public void updateState()
	{
		
	}
	public void updateScene(int height, int width)
	{
		
	}
	public boolean overlaps(Sprite s)
	{
		//Top left Corner
		if(s.getX() >= locationX  && s.getX() <= (locationX+60) && s.getY() >= locationY && s.getY() <= (locationY+60))
			return true;
		else if(s.getX()+60 >= locationX  && s.getX() <= (locationX+60) && s.getY() >= locationY && s.getY() <= (locationY+60))
			return true;
		else if(s.getX() >= locationX  && s.getX()+60 <= (locationX+60) && s.getY() >= locationY && s.getY() <= (locationY+60))
			return true;
		else if(s.getX() >= locationX  && s.getX() <= (locationX+60) && s.getY()+60 >= locationY && s.getY() <= (locationY+60))
			return true;
		else if(s.getX()+60 >= locationX  && s.getX() <= (locationX+60) && s.getY() >= locationY && s.getY()+60 <= (locationY+60))
			return true;
		
		else
			return false;
	}
	public void captured()
	{
		
	}
	public boolean isCaptured()
	{
		return false;
	}
	public boolean hasEscaped()
	{
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}