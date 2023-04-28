package trade_player;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import hand.Hand;
import player.Player;

/**
 * 
 * @author TEK, JVL
 * 
 *         In this class a GUI allows the active player to trade with the bank.
 * 
 *         The active player can add and remove cards from their hand by
 *         clicking the corresponding buttons. When the button "ok" is clicked,
 *         the cards are added and removed from their hand. For future coding
 *         the Manager class should first check whether the trade is allowed.
 */
public class TradePlayer {

	static JFrame frame;
	static JButton buttonpl;
	static JButton buttonmn;
	static JButton ok;
	static Integer wool;

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame = new JFrame("Trade with player");
				Map<String, Integer> data = new LinkedHashMap<>();

				Hand hand = new Hand();
				Player player = new Player(hand);

				JLabel label = new JLabel();
				JLabel label2 = new JLabel();
				JLabel label3 = new JLabel();
				JLabel label4 = new JLabel();
				JLabel label5 = new JLabel();
				JLabel ok = new JLabel();

				frame.setLayout(new FlowLayout());
				Map<String, Integer> wool = buttonTrade(frame, "wool", label, data);
				Map<String, Integer> wheat = buttonTrade(frame, "wheat", label2, data);
				Map<String, Integer> wood = buttonTrade(frame, "wood", label3, data);
				Map<String, Integer> ore = buttonTrade(frame, "ore", label4, data);
				Map<String, Integer> brick = buttonTrade(frame, "brick", label5, data);

				data.putAll(wool);
				data.putAll(wheat);
				data.putAll(wood);
				data.putAll(ore);
				data.putAll(brick);

				tradeCards(frame, ok, player, wool);

				frame.setVisible(true);
				frame.setSize(700, 200);
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			}
		});

	}

	public static Map<String, Integer> buttonTrade(final JFrame frame1, String card, final JLabel label,
			Map<String, Integer> data) {

		final Integer[] score = { 0 };
		frame1.getContentPane().setLayout(new FlowLayout());

		buttonpl = new JButton("+");
		buttonmn = new JButton("-");

		JPanel panel = new JPanel();
		frame1.add(panel);

		buttonpl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score[0] += 1;
				label.setText(card + ": " + score[0]);
				frame1.pack();
				data.put(card, score[0]);
			}
		});

		buttonmn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score[0] -= 1;
//	        	if (score[0] < 0) {
//	        		score[0] = 0;
//	        	}
				label.setText(card + ": " + score[0]);
				frame1.pack();
				data.put(card, score[0]);
			}
		});

		frame1.add(label);
		frame1.add(buttonpl);
		frame1.add(buttonmn);
		label.setPreferredSize(new Dimension(70, 50));
		buttonpl.setPreferredSize(new Dimension(50, 30));
		buttonmn.setPreferredSize(new Dimension(50, 30));
		frame1.pack();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		return data;

	}

	public static void tradeCards(final JFrame frame1, final JLabel label, Player player, Map<String, Integer> amount) {

		frame1.getContentPane().setLayout(new FlowLayout());

		JPanel panel = new JPanel();
		ok = new JButton("ok");
		frame1.add(panel);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("ok");
				for (Map.Entry<String, Integer> set : amount.entrySet()) {
					System.out.println(set.getKey());
					player.getHand().setCard("resource", set.getKey(), set.getValue());
					int test = player.getHand().getCard("resource", set.getKey());
					System.out.println(set.getKey() + ": " + test);
					frame1.pack();
				}
			}
		});
		frame1.add(label);
		frame1.add(ok);
		label.setPreferredSize(new Dimension(70, 50));
		ok.setPreferredSize(new Dimension(50, 30));
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}