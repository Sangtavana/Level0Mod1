package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {
		Random randy = new Random();
		int x = randy.nextInt(101) + 1;
		String answer = JOptionPane
				.showInputDialog("I am thinking of a number between 1 - 100. Enter the lucky number.");
		int ansAsInt = Integer.parseInt(answer);

		for (int i = 0; i < 10; i++) {

			if (ansAsInt > x) {
				answer = JOptionPane.showInputDialog(null, "Sorry this number is incorrect! Please guess lower!");
				ansAsInt = Integer.parseInt(answer);
			}

			if (ansAsInt < x) {
				answer = JOptionPane.showInputDialog(null, "Sorry this is incorrect! Please guess higher!");
				ansAsInt = Integer.parseInt(answer);
			}

		}

	}
}
