//only throw dice button works for now (the result of the roll is in the console)

package turn_Phase_Buttons;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import dice.Dice;
import banktrade.BankTrade;
import javax.swing.JLabel;

public class Initial_Dev_Buttons extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel turn_Phase_Panel;
	private Dice diceRoll = new Dice();
	private String outputString = new String("");
	private JLabel lblDiceResult = new JLabel(outputString);


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
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 240);
		turn_Phase_Panel = new JPanel();
		turn_Phase_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(turn_Phase_Panel);
		turn_Phase_Panel.setLayout(null);
		
		JButton btnDevCard = new JButton("Development card");
		btnDevCard.setBounds(20, 130, 150, 23);
		turn_Phase_Panel.add(btnDevCard);
		
		JButton btnThrowDice = new JButton("Throw dice");
		btnThrowDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleDiceroll();
				}
		});
		btnThrowDice.setBounds(20, 10, 150, 23);
		turn_Phase_Panel.add(btnThrowDice);
		
		JButton btnTradeBank = new JButton("Trade with bank");
		btnTradeBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			handleTrade();
			}
		});
		btnTradeBank.setBounds(20, 50, 150, 23);
		turn_Phase_Panel.add(btnTradeBank);
		
		JButton btnBuild = new JButton("Build");
		btnBuild.setBounds(20, 170, 150, 23);
		turn_Phase_Panel.add(btnBuild);
		
		JButton btnTradePlayer = new JButton("Trade with player");
		btnTradePlayer.setBounds(20, 90, 150, 23);
		turn_Phase_Panel.add(btnTradePlayer);
		
		JLabel lblDiceTitle = new JLabel("Dice result");
		lblDiceTitle.setBounds(200, 10, 62, 23);
		turn_Phase_Panel.add(lblDiceTitle);
		
		lblDiceResult.setBounds(200, 35, 49, 14);
		turn_Phase_Panel.add(lblDiceResult);
	}


	/**
	 * Print the result.
	 */
	protected void handleDiceroll () {
			diceRoll.setSum();
			int output = diceRoll.getSum();
			String outputString = Integer.toString(output);
			JLabel lblDiceResult = new JLabel(outputString);
			lblDiceResult.setBounds(200, 35, 49, 14);
			turn_Phase_Panel.add(lblDiceResult);
			turn_Phase_Panel.repaint();
			
			System.out.println("dice output is " + output);
			}
	
	
	protected void handleTrade() {	
		BankTrade.main(null);
			
	}
}



