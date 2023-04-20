package gui_menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Options {
	private JFrame f = new JFrame("Catan - Options");
	private JLabel lNotYetImplemented = new JLabel("Not yet implemented");
	private JButton bGoBack = new JButton("Back");
	public Options() {
		f.getContentPane().add(lNotYetImplemented, BorderLayout.EAST);
		f.getContentPane().add(bGoBack, BorderLayout.WEST);
	
		
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
