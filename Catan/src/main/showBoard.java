package main;
import board.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JInternalFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class showBoard {
	private JFrame f = new JFrame("Catan - Board");
	private JInternalFrame internalf = new JInternalFrame();
	private JLabel lNotYetImplemented = new JLabel("Not yet implemented");
	private JButton bGoBack = new JButton("Back");
	private Table TableTest = new Table();
	
	
	public showBoard() {
		f.getContentPane().add(lNotYetImplemented, BorderLayout.EAST);
		f.getContentPane().add(bGoBack, BorderLayout.WEST);
		
		f.getContentPane().add(TableTest, BorderLayout.NORTH);
		
		Board m=new Board();  
		internalf.add(m); // adds the board to the JFrame
		internalf.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
		internalf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		internalf.setResizable(false);
		internalf.setVisible(true); 
		
		bGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new MainMenu();
			}
		});
	    
	}
}
