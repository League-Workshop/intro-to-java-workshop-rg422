//Copyright Wintriss Technical Schools 2013
package day3;
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8 {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int rand = new Random().nextInt(4);
	// 3. Print out this variable
		// JOptionPane.showMessageDialog(null, rand);
	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("i grant you 5 questions");
		// 5. If the random number is 0
		if (rand == 0) {
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "YES");
		}
	// 6. If the random number is 1
		if (rand == 1) {
			// -- tell the user "no"
			JOptionPane.showMessageDialog(null, "NO");
		}
	// 7. If the random number is 2
		if (rand == 2) {
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Ask Google");
		}

	// 8. If the random number is 3
		if (rand == 3) {
			// -- tell the user "i dont know"
			JOptionPane.showMessageDialog(null, "I dont know");
				}
			}
		}
	}



