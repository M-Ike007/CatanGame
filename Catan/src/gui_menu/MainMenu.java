package gui_menu;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class MainMenu {
	private JFrame f = new JFrame("Catan -- main menu");
	private JButton bStart = new JButton("Start game");
	
	private JButton bScore = new JButton("Game score");
	
	private JButton bOptions = new JButton("options");
	
	public MainMenu() {
	
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		f.getContentPane().add(bStart, BorderLayout.CENTER);
		bStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new StartGame();
			}
		});
		
		f.getContentPane().add(bScore, BorderLayout.EAST);
		bScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new GameScore();
			}
		});
		
		f.getContentPane().add(bOptions, BorderLayout.WEST);
		
		bOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Options();
			}
		});
		f.setSize(500,200);
		f.setVisible(true);
	}
	
	/** Main class of the main menu
	 * @param args Are command line arguments passed to the class; now these do not do anything yet.
	 */
	public static void main(String[] args) {
		new MainMenu();
	}
}