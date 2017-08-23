package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
		String name = JOptionPane.showInputDialog("how are you doing");
		JOptionPane.showMessageDialog(null, "so you are " + name);
		System.out.println(name);
		}
	}
}