package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GameScore {
	private JFrame f = new JFrame("Catan - Scores");
	private JLabel lNotYetImplemented = new JLabel("Not yet implemented");
	private JButton bGoBack = new JButton("Back");
	private Table TableTest = new Table();
	
	
	public GameScore() {
		f.getContentPane().add(TableTest, BorderLayout.NORTH);
	}
}
