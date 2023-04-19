package turn_Phase_Buttons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import dice.Dice;

public class Initial_Dev_Buttons extends JFrame {

	private JPanel turn_Phase_Panel;
	private Dice diceRoll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Initial_Dev_Buttons frame = new Initial_Dev_Buttons();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Initial_Dev_Buttons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);
		turn_Phase_Panel = new JPanel();
		turn_Phase_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(turn_Phase_Panel);
		turn_Phase_Panel.setLayout(null);
		
		JButton btnDevCard = new JButton("Development card");
		btnDevCard.setBounds(20, 90, 150, 23);
		turn_Phase_Panel.add(btnDevCard);
		
		JButton btnThrowDice = new JButton("Throw dice");
		btnThrowDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleDiceroll();
				}
		});
		btnThrowDice.setBounds(20, 10, 150, 23);
		turn_Phase_Panel.add(btnThrowDice);
		
		JButton btnTrade = new JButton("Trade");
		btnTrade.setBounds(20, 50, 150, 23);
		turn_Phase_Panel.add(btnTrade);
		
		JButton btnBuild = new JButton("Build");
		btnBuild.setBounds(20, 130, 150, 23);
		turn_Phase_Panel.add(btnBuild);
	}



	protected void handleDiceroll () {
		if (diceRoll != null) {
			diceRoll.getSum();
		}
	}

}

