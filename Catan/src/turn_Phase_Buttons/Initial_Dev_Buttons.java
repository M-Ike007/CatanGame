//only throw dice button works for now (the result of the roll is in the console)

package turn_Phase_Buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import dice.Dice;
import main.MainMenu;
import banktrade.BankTrade;

public class Initial_Dev_Buttons extends JFrame {

	private JPanel turn_Phase_Panel;
	private Dice diceRoll = new Dice();
	private BankTrade trading = new BankTrade();

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
		setBounds(100, 100, 200, 240);
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
		
		
	}


// pressing the buttons refers to these methods below
	
	protected void handleDiceroll () {
			diceRoll.setSum();
			int output = diceRoll.getSum();
			System.out.println("dice output is " + output);
	}
	
	
	protected void handleTrade() {
			
		trading.main(null);
			
	}
}



