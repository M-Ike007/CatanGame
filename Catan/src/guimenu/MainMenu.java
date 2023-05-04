package guimenu;

import javax.swing.JFrame;

import guiboard.Board;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;


/**
 * This class is the MainMenu of the game. It iinitializes the entire game.
 *
 */
public class MainMenu {
	
	/**
	 * This creates the frame.
	 *
	 */
	private JFrame f = new JFrame("Catan -- main menu");
	
	/**
	 * This creates the start game button.
	 *
	 */
	private JButton bStart = new JButton("Start game");
	
	/**
	 * This creates the score button
	 *
	 */
	
	private JButton bScore = new JButton("Game score");
	/**
	 * This constructor of the MainMenu.
	 */
	
	public MainMenu() {
	
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		f.getContentPane().add(bStart, BorderLayout.CENTER);
		bStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Board();
			}
		});
		
		f.getContentPane().add(bScore, BorderLayout.EAST);
		bScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new GameScore();
			}
		});
		
	
		f.setSize(500,200);
		f.setVisible(true);
	}
	
	/** Main method
	 * @param args Are command line arguments passed to the class (not used).
	 */
	public static void main(String[] args) {
		new MainMenu();
	}
}