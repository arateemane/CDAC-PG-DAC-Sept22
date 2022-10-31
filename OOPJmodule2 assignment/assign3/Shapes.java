import javax.swing.*;
import java.awt.Graphics;

	public class Shapes extends JFrame
	{
		double diameter;
		
		public Shapes()
		{
			setSize(600,600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		public void getDiameter()
		{
			String input = JOptionPane.showInputDialog("What is the diameter of circle?");
			diameter = Double.parseDouble(input);
			
			Shapes gui = new Shapes();
			gui.setVisible(true);
		}
		
		public static void main(String[] args)
		{
			Shapes app = new Shapes();
			app.getDiameter();
		}
		
		public void paint(Graphics canvas)
		{
			canvas.drawOval(50,50,(int)diameter,(int)diameter);
		}
	}