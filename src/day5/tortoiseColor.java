 // Copyright Wintriss Technical Schools 2013
package day5;
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class tortoiseColor {
	public static void main(String[] args) {
		Tortoise.show();
		for (int i = 0; i < 10; i++) {
		//3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("what color do you want");
		//4. use an if/else statement to set the pen color that the user requested
		if (color.equals("yellow")) {
			Tortoise.setPenColor(Color.YELLOW);
		}
		else if (color.equals("red")) {
			Tortoise.setPenColor(Color.RED);
		}
		else if (color.equals("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		}
		else {
			Tortoise.setPenColor(PenColors.getRandomColor());
		}
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.setSpeed(5);
		Tortoise.penDown();
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		}
	}
}
