import java.awt.*;
import javax.swing.*;


public class DrivePanel extends JPanel
{
	int[] xCor;
	int[] yCor;
	int legs;
	public void setX(int[] x)
	{
		xCor = x;
	}
	public void setLegs(int l)
	{
		legs = l;
	}
	public void setY(int[] y)
	{
		yCor = y;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int height = getHeight();
		
		for(int i = 0; i < legs; i++)
		{
		g.drawLine(xCor[i], height-yCor[i], xCor[i+1], height-yCor[i+1]);
		g.drawString(xCor[i+1]+ ", " + yCor[i+1], xCor[i+1], (height-yCor[i+1]));
		}
	}
}
