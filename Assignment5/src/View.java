import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame implements ActionListener {

    private class MyPanel extends JPanel 
    {
        Controller controller;

        MyPanel(Controller c) {
            controller = c;
            addMouseListener(c);
        }
        //JFrame subclass View

        public void paintComponent(Graphics g) {
            controller.update(g);
            revalidate();
        }
    }
/*    private class view extends JFrame
    {
    	Controller controller;
        view(Controller c)
    	{
    		controller = c;
    		addKeyListener(c);
    	}
        public void paintComponent(Graphics g) {
            controller.update(g);
            revalidate();
        }
    	
    }*/


    public View(Controller c) throws Exception{
        setTitle("Assignment 4");
        setSize(1000, 700);
        getContentPane().add(new MyPanel(c));
        //getContentPane().add(new view(c));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        repaint();
    }
}
