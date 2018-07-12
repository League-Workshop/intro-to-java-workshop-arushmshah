package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog("10+5");
		// 3. Use an if statement to check if their answer is correct
		if (input.equals("15")) {
			score = score + 1;
		}
		// 4. if the user's answer is correct

		// -- add one to their score
		JOptionPane.showMessageDialog(null, "Score:" + score);
		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		input = JOptionPane.showInputDialog("20+15");
		if (input.equals("35")) {
			score = score + 1;
		}
		JOptionPane.showMessageDialog(null, "Score:" + score);
		input = JOptionPane.showInputDialog("30+25");
		if (input.equals("55")) {
			score = score + 1;
		}
		JOptionPane.showMessageDialog(null, "Score:" + score);
		input = JOptionPane.showInputDialog("40+35");
		if (input.equals("75")) {
			score = score + 1;
		}
		JOptionPane.showMessageDialog(null, "Score:" + score);
			input = JOptionPane.showInputDialog("50+45");
			if (input.equals("95")) {
				score = score + 1;
			}
			JOptionPane.showMessageDialog(null, "Score:" + score);
		// 6. After all the questions have been asked, print the user's score

	}
}
