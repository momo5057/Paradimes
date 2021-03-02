import java.awt.Graphics;
import java.io.IOException;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.Timer;
import javax.swing.SwingUtilities;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Controller implements MouseListener, KeyListener
{
    Model model;
    View view;

    Controller() throws IOException, Exception {
        model = new Model();
        view = new View(this);
        //new Timer(50, view).start();
    }

    public void update(Graphics g) {
        model.update(g);
    }

    public void mousePressed(MouseEvent e) {
    	view.repaint();
		if (SwingUtilities.isLeftMouseButton(e)) {
			model.add(e.getX(), e.getY());
		} else if (SwingUtilities.isRightMouseButton(e))  {
			model.updateScene(view.getWidth(), view.getHeight());
		}
    }
    
    public void keyPressed(KeyEvent e)  {   }
    public void keyReleased(KeyEvent e) {   }
    public void keyTyped(KeyEvent e)    {   
    	
    }
    
    public void mouseReleased(MouseEvent e) {    }
    public void mouseEntered(MouseEvent e)  {    }
    public void mouseExited(MouseEvent e)   {    }
    public void mouseClicked(MouseEvent e)  {    }
    

    public static void main(String[] args) throws Exception {
        //  Use the following line to determine which directory your program
        //  is being executed from, since that is where the image files will
        //  need to be.
        //System.out.println("cwd=" + System.getProperty("user.dir"));
        new Controller();
    }
}

