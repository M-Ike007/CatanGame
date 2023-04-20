package gui_menu;
import board.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.util.Hashtable;

/** The class that starts the game.
 * It gives the players back as a hashmap; with player names as keys, and colours as values: "blue", "green", "orange", "white".
 */
public class StartGame {
	private JFrame f = new JFrame("Catan - Start game");
	private JButton bGoBack = new JButton("Back");
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblSetupOptions = new JLabel("Setup options");
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblPlayer3 = new JLabel("player 3");
	private final JLabel lblPlayer1 = new JLabel("player 1");
	private final JLabel lblPlayer2 = new JLabel("player 2");
	private final JLabel lblPlayer4 = new JLabel("player 4");
	private final JLabel lblPlayer_header = new JLabel("Player");
	
	
	private final JLabel lblName = new JLabel("Name");
	private final JTextField txtPlayer3 = new JTextField();
	private final JTextField txtPlayer4 = new JTextField();
	private final JTextField txtPlayer2 = new JTextField();
	private final JTextField txtPlayer1 = new JTextField();
	
	public StartGame() {
		
		
		txtPlayer3.setText("name 3");
		txtPlayer3.setColumns(10);
		txtPlayer4.setText("name 4");
		txtPlayer4.setColumns(10);
		txtPlayer2.setText("name 2");
		txtPlayer2.setColumns(10);
		txtPlayer1.setText("name 1");
		txtPlayer1.setColumns(10);
		
		
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		f.getContentPane().add(bGoBack, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Instanciating the hash table
				Hashtable<String, String> player_info = new Hashtable<String, String>();
				player_info.put(txtPlayer1.getText(), "blue");
				player_info.put(txtPlayer2.getText(), "green");
				player_info.put(txtPlayer3.getText(), "orange");
				player_info.put(txtPlayer4.getText(), "white");
				f.dispose();
			    new Board();  
			    }
			}
		);
		panel.add(btnNewButton, BorderLayout.EAST);
		
		panel.add(panel_1, BorderLayout.NORTH);
		
		panel_1.add(lblSetupOptions);
		
		panel.add(panel_2, BorderLayout.CENTER);
		
		panel_2.add(lblPlayer_header, "cell 0 0");
		
		panel_2.add(lblName, "cell 2 0");
		
		panel_2.add(lblPlayer1, "cell 0 2");
		
		panel_2.add(txtPlayer1, "cell 2 2,growx");
		
		
		panel_2.add(txtPlayer1, "cell 2 2,growx");
		
		panel_2.add(lblPlayer2, "cell 0 4");
		
		
		panel_2.add(txtPlayer2, "cell 2 4,growx");
		
		panel_2.add(lblPlayer3, "cell 0 6");
		
		panel_2.add(txtPlayer3, "cell 2 6,growx");
		
		panel_2.add(lblPlayer4, "cell 0 8");
		
		
		panel_2.add(txtPlayer4, "cell 2 8,growx");
	
		
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
