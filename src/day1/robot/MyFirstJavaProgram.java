package day1.robot;

import java.awt.Color;
import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		//Create a new robot
		Robot dummy = new Robot();
		//Set Speed
		dummy.setSpeed(10);
		//Set Pen Color
		dummy.setPenColor(Color.BLUE);
		//Put Pen down
		dummy.penDown();
		//Set Robot starting point
		dummy.setX(200);
		//Begin Loop
		//i < ? to and the 360 / ? replace ? to change the shape
		for (int i = 0; i < 4; i++) {
			dummy.move(50);
			dummy.turn(360 / 4);

		}
		//Pen up
		dummy.penUp();
		//Move out of the way
		dummy.move(100);
		
		//Create a new robot
		Robot smarty = new Robot();
		smarty.moveTo(200, 100);
		smarty.turn(180);
		smarty.penUp();
		smarty.moveTo(200, 75);
	}
}
