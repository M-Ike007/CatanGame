package guimenu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * This class creates the table for the player scores.
 *
 */
public class Table extends JPanel {

	/**
	 * This field creates a JButton bGoBack to go back to the main menu.
	 *
	 */

	private JButton bGoBack = new JButton("Back");

	/**
	 * Method to create the Table with the scores
	 *
	 */

	private static final long serialVersionUID = 1L;
	JFrame f;

	Table() {
		f = new JFrame("Catan -- Scores");

		f.getContentPane().add(bGoBack, BorderLayout.WEST);
		bGoBack.addActionListener(new ActionListener() {

			/**
			 * Invoked when the "Back" button is clicked. Disposes the current window and
			 * opens a new MainMenu window.
			 * 
			 * @param ae The action event.
			 */

			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new MainMenu();
			}
		});

		String data[][] = { { "Laurens", "1000000", "2" }, { "Getalem", "100", "30" } };
		String column[] = { "Player", "Win", "Total VP" };

		JTable jTable = new JTable(data, column);
		jTable.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jTable);
		f.getContentPane().add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	}
}