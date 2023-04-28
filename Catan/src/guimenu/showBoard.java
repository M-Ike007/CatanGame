package guimenu;
import javax.swing.JFrame;
import javax.swing.JLabel;

import gui_board.*;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class showBoard {
	private JFrame f = new JFrame("Catan - Board");
	private JLabel lNotYetImplemented = new JLabel("Not yet implemented");
	private JButton bGoBack = new JButton("Back");
	private Table TableTest = new Table();
	
	
	public showBoard() {
		f.getContentPane().add(lNotYetImplemented, BorderLayout.EAST);
		f.getContentPane().add(bGoBack, BorderLayout.WEST);
		
		f.getContentPane().add(TableTest, BorderLayout.NORTH);
		
		new Board();  
		
		bGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new MainMenu();
			}
		});
	    
	}
}
