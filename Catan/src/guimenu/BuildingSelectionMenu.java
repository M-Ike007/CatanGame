package guimenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * This class builds the selection menu for building.
 * It lists the required resources for building.
 *
 */
public class BuildingSelectionMenu extends JFrame {
	
	/**
	 * This field creates the JPanel 
	 *
	 */
	private JPanel contentPane;

	/**
	 * This method starts the class.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildingSelectionMenu frame = new BuildingSelectionMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * This methods creates the menu frame
	 */
	public BuildingSelectionMenu() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 447, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVillage = new JButton("Village");
		btnVillage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnVillage.setBounds(20, 20, 150, 23);
		contentPane.add(btnVillage);
		
		JButton btnCity = new JButton("City");
		btnCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnCity.setBounds(20, 60, 150, 23);
		contentPane.add(btnCity);
		
		JButton btnRoad = new JButton("Road");
		btnRoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnRoad.setBounds(20, 100, 150, 23);
		contentPane.add(btnRoad);
		
		JLabel lblNewLabel = new JLabel("wood: 1 brick: 1 wheat: 1 wool: 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(190, 20, 250, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("wheat: 2 ore: 3");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(190, 60, 250, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("wood: 1 brick: 1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(190, 100, 250, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReturn.setBounds(317, 100, 89, 23);
		contentPane.add(btnReturn);
	}
}
