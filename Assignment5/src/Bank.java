import java.awt.Graphics;

public class Bank extends Sprite
{
	public Bank()
	{
		super("bank.png", 300, 300);
	}
	public void updateImage(Graphics g) {
		super.updateImage(g);
	}
    public void updateScene(int width, int height)
    {
    	super.updateState();
    }
}
