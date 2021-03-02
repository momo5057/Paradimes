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
	public void fillUp()
	{
		
	}
	public void update(Graphics g) {
        // Move the sprite
		//locationX = locationX + 1;
		//locationY = locationY + 1;
		g.drawImage(getImage(), getX(), getY(), 60, 60, null);
	}
}