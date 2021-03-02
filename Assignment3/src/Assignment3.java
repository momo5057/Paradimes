
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Assignment3 
{
	public static void main(String[] args)
	{
		String CDescription=""; String EDescription="";
		int capacity = -1; int mpg = -1; int maxSpeed = -1;
		
		CDescription = JOptionPane.showInputDialog("Please enter the car's description");

		while(capacity <= 0)
		{
			try {			
				capacity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the fuel tank capacity"));
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Invalid data entered. Exiting");
				System.exit(0);	
			}		
		}

		EDescription = JOptionPane.showInputDialog("Please enter the engine's description");

		while(mpg <= 0)
		{
			try {
				mpg = Integer.parseInt(JOptionPane.showInputDialog("Please enter the miles per gallon"));
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Invalid data entered. Exiting");
				System.exit(0);	
			}	
		}
		while(maxSpeed <= 0)
		{
			try {
				maxSpeed = Integer.parseInt(JOptionPane.showInputDialog("Please enter the max speed"));
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Invalid data entered. Exiting");
				System.exit(0);	
			}	
		}
		Engine engine1 = new Engine(EDescription, mpg, maxSpeed);
		Car car1 = new Car(CDescription, capacity, engine1);
		
		JOptionPane.showMessageDialog(null, car1.getDescription());
		
		int legs = -1;
		while(legs < 0)
			legs = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of legs on the trip"));
		
		int distance = -1;
		int xCor=0;
		int yCor=0;
		car1.fillUp();
		int xList[];
		xList = new int[legs+1];
		int yList[];
		yList = new int[legs+1];
		xList[0]=0;
		yList[0]=0;
		
		for(int i = 1; i <= legs; i++)
		{
			while(distance <= 0)
				distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the distance for leg " + i));
			xCor = Integer.parseInt(JOptionPane.showInputDialog("Please enter the x ratio for leg " + i));
			yCor = Integer.parseInt(JOptionPane.showInputDialog("Please enter the y ratio for leg " + i));
			car1.drive(distance, xCor,  yCor);
			distance = -1;
			xList[i] = car1.getX();
			yList[i] = car1.getY();
		}


		DrivePanel panel = new DrivePanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setX(xList);
		panel.setY(yList);
		panel.setLegs(legs);
		
		application.add(panel);

		application.setSize(600, 600);
		application.setLocationRelativeTo(null);
		application.setVisible(true);
		

	}
}
