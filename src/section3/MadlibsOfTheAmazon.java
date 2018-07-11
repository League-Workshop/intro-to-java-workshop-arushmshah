package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog ("Enter an adjective in caps");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog ("Enter a type of liquid in caps");
		// Get the user to enter a body part
		String bodyPart = JOptionPane.showInputDialog ("Enter a body part in caps");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog ("Enter a verb in caps");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog ("Enter a place in caps");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adj + " during the day, so cross the river at night. Piranhas are attracted to fresh " + liquid + " and will most likely take a bite out of your " + bodyPart + " if you " + verb + ". Whatever you do, if you have an open wound, try to get back to " + place + ". Good luck.");
		
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

