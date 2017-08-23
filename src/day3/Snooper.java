package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please Enter your name");
		String age = JOptionPane.showInputDialog("please enter your age");
		String passoword = JOptionPane.showInputDialog("please enter your most used password");
		JOptionPane.showMessageDialog(null, "hello " + name + " your age is " + age + " and your most used password is " + passoword);
		JOptionPane.showConfirmDialog(null, "Did i get it right");
	} 
}
