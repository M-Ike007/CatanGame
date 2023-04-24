package turn_player_action;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import dice.Dice;
import trade_player.*;
import gui_menu.BuildingSelectionMenu;
import javax.swing.JLabel;

public class Turn_Action_Menu extends JFrame {

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
					Turn_Action_Menu frame = new Turn_Action_Menu();
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
	public Turn_Action_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 280);
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
		
		btnTradeBank.setBounds(20, 50, 150, 23);
		turn_Phase_Panel.add(btnTradeBank);
		
		JButton btnBuild = new JButton("Build");
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				built_elements();
				
			}
		});
		btnBuild.setBounds(20, 170, 150, 23);
		turn_Phase_Panel.add(btnBuild);
		
		JButton btnTradePlayer = new JButton("Trade with player");
		btnTradePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlePlayerTrade();
			}
			
		});
		btnTradePlayer.setBounds(20, 90, 150, 23);
		turn_Phase_Panel.add(btnTradePlayer);
		
		JLabel lblDiceTitle = new JLabel("Dice result");
		lblDiceTitle.setBounds(190, 10, 70, 23);
		turn_Phase_Panel.add(lblDiceTitle);
		
		lblDiceResult.setBounds(190, 35, 49, 14);
		turn_Phase_Panel.add(lblDiceResult);
		
		JButton btnEndTurn = new JButton("End turn");
		btnEndTurn.setBounds(20, 210, 150, 23);
		turn_Phase_Panel.add(btnEndTurn);
	}


	/**
	 * Print the result.
	 */
	protected void handleDiceroll () {
		diceRoll.setSum();
		int output = diceRoll.getSum();
		String outputString = Integer.toString(output);
		lblDiceResult.setText(outputString);			
	}
	
     protected void built_elements() {
    	 BuildingSelectionMenu.main(null);
     }
		
	
	
	protected void handlePlayerTrade() {	
		TradePlayer.main(null);
			
	}
}



