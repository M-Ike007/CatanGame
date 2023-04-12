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
		f.getContentPane().add(lNotYetImplemented, BorderLayout.EAST);
		f.getContentPane().add(bGoBack, BorderLayout.WEST);
		
		f.getContentPane().add(TableTest, BorderLayout.NORTH);
		
		bGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new MainMenu();
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
	}
}
