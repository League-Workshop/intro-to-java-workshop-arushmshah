package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {

		System.out.println("Hello");
		String input = JOptionPane.showInputDialog("Name?");
		JOptionPane.showMessageDialog(null, "Hello, " + input);
	}
}
