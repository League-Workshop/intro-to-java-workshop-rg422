package day3;

import javax.swing.JOptionPane;

public class blastoff {
	public static void main(String[] args) {
	for (int i = 5; i > 0; i--) {
		JOptionPane.showMessageDialog(null, i);
		}
	JOptionPane.showMessageDialog(null, "Blast Off");
	for (int i = 99; i >= 55; i = i - 2) {
		JOptionPane.showMessageDialog(null, i);
		}
	}
}