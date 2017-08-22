package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot robot = new Robot ();

	void go() {
		robot.penDown();
		// 4. Make the robot move as fast as possible
		robot.setSpeed(10);
		// 5. Set the pen width to 5
		robot.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			robot.setRandomPenColor();
			// 1. Call the drawSquare() method
		drawSquare();
			// 8. Turn the robot 90 degrees to the right
		robot.turn(90);
		}
		robot.move(100);
	}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
		robot.move(50);
		robot.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
