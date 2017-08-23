package day3;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		String whos = JOptionPane.showInputDialog("Knock Knock");
		if (whos.equals("who's there?")) {
			String youwho = JOptionPane.showInputDialog("you");
			
			if (youwho.equals("you who")) {
				JOptionPane.showMessageDialog(null, "you who");
				int a = JOptionPane.showConfirmDialog(null, "did you get it?");
				if (a == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Ok good");
				}
					else {
						JOptionPane.showMessageDialog(null, "you arent funny");
				}
			}
		}
	}
}
