package day5;
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("Give a Number");
		String num2 = JOptionPane.showInputDialog("Give another Number");
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The Quesion", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation == 0) {
			add(number1,number2);
		}
		else if (operation == 1) {
			subtract(number1,number2);
		}
		else if (operation == 2) {
			multiply(number1,number2);
		}
		else {
			divide(number1,number2);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int number1,int number2) {
		int ans = number1 + number2;
				JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + ans);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int number1,int number2) {
		int ans = number1 - number2;
				JOptionPane.showMessageDialog(null, number1 + " - " + number2 + " = " + ans);
	}
	static void divide(double number1,double number2) {
		double ans = number1 / number2;
				JOptionPane.showMessageDialog(null, number1 + " / " + number2 + " = " + ans);
	}
	static void multiply(int number1,int number2) {
		int ans = number1 * number2;
				JOptionPane.showMessageDialog(null, number1 + " * " + number2 + " = " + ans);
	}


}