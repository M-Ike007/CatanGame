package guimenu;

import javax.swing.JFrame;
import java.awt.BorderLayout;

/**

The GameScore class displays the player scores table and allows users to go back to the main menu.
*/

public class GameScore {
	
	/**
	 * The JFrame window of the game score.
	 */
	
	private JFrame f = new JFrame("Catan - Scores");
	
	
	/**
	 * The Table displaying the game score.
	 */
	
	private Table TableTest = new Table();
	
	/**
	 * This method calls the Table displaying the game score.
	 */
	
	public GameScore() {
		f.getContentPane().add(TableTest, BorderLayout.NORTH);
	}
}
