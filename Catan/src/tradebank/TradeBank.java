package tradebank;

import java.awt.event.*;  
import javax.swing.*;
import java.awt.*;

import hand.*;
import player.*;
   
/**
 * The trade button the active player will see when it is their turn.
 * 
 * This class opens a window that asks the player whether they want to trade with the bank and if so, what.
 */

public class TradeBank extends JFrame {

	private Hand myHand;
	private int counter = 0;
	private JTextField tf;
	private JButton b1;
	private JButton b2;
	private JButton wool;
	private JButton ore;
	private JButton brick;
	private JButton wood;
	private JButton wheat;
	
	/**
	 * This method creates a frame and asks the active player if he will trade with the bank. 
	 * If the player wants to trade, the first choice is which resource he want to give to the bank.
	 * The second choice is which resource he want to receive. Then the player can trade again or
	 * leave the screen. 
	 * 
	 * @param myHand: The hand of the active player
	 */
	public TradeBank(Hand myHand) {
		// Making the frame
		JFrame frame=new JFrame("Trade");  
		
		// Making the textfield
	    tf = new JTextField("Do you want to trade?");
	    
	    // Making the buttons
	    b1 =new JButton("Yes");  
	    b1.setBounds(50,200,300,30);
	    b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		b1.setVisible(false);
	    		b2.setVisible(false);
	    		wool.setVisible(true);
	    		ore.setVisible(true);
	    		brick.setVisible(true);
	    		wood.setVisible(true);
	    		wheat.setVisible(true);
				}
	    });
	    b2 =new JButton("No");  
	    b2.setBounds(350,200,300,30);
	    b2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	    	}
	    });
	    // Button wool
	    wool =new JButton("wool");
	    wool.setBounds(50,200,80,20);
	    wool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerWool();
			}
			
		});
	    // Button ore
		ore =new JButton("ore");  
		ore.setBounds(150,200,80,20);
		ore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerOre(myHand);
			}
		});
		// Button brick
		brick =new JButton("brick"); 
		brick.setBounds(250,200,80,20);
		brick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerBrick(myHand);			
			}
		
		});
		// Button wood
		wood =new JButton("wood");
		wood.setBounds(350,200,80,20);
		wood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerWood(myHand);	
			}
		
		});
		// Button wheat
		wheat =new JButton("wheat");
		wheat.setBounds(450,200,80,20);
		wheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerWheat(myHand);			
			}
		});
	    
	    tf.setEditable(false);
	    tf.setBounds(50,100,600,30);
	    tf.setEditable(false);
	    tf.setBounds(50,100,600,30);
	 // add to JFrame
	    frame.add(tf);
	    frame.add(b1);
	    frame.add(b2);
	    frame.setSize(700,400);  
	    frame.setLayout(null);
	    frame.setVisible(true);
		frame.add(wool);
		wool.setVisible(false);
		frame.add(ore);
		ore.setVisible(false);
		frame.add(brick);
		brick.setVisible(false);
		frame.add(wood);
		wood.setVisible(false);
		frame.add(wheat);
		wheat.setVisible(false);
	}


	/**
	 * This method changes the amounts of cards in the active player hand. 
	 * @param myHand: the hand of the active player.
	 * @param resource: String "resource"
	 * @param card: the resource card for the trade.
	 * @param amount: the amount of resource that change in the active player hand.
	 */
	private void bankTax(Hand myHand, String resource, String card, int amount) {
		myHand.setCard(resource, card, amount);
	} 
	
	/**
	 * This method trades the wool resource with the bank. The first click on the button
	 * removes 4 wool resources of the active player hand. The second click on the button
	 * add 1 wool resource of the active player hand.
	 */
	private void actionListenerWool() {
		// counter add 1
		counter += 1;
		// remove four wool from hand
		if (counter == 1) {
			bankTax(myHand, "resource", "wool", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			bankTax(myHand, "resource", "wool", 1);
			wool.setVisible(false);
			ore.setVisible(false);
			brick.setVisible(false);
			wood.setVisible(false);
			wheat.setVisible(false);
			b1.setVisible(true);
			b2.setVisible(true);
			tf.setText("Do you want to trade?");
			counter = 0;
		}
	}
	
	/**
	 * This method trades the ore resource with the bank. The first click on the button
	 * removes 4 ore resources of the active player hand. The second click on the button
	 * add 1 ore resource of the active player hand.
	 */
	private void actionListenerOre(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four ore from hand
		if (counter == 1) {
			bankTax(myHand, "resource", "ore", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			bankTax(myHand, "resource", "ore", 1);
			wool.setVisible(false);
			ore.setVisible(false);
			brick.setVisible(false);
			wood.setVisible(false);
			wheat.setVisible(false);
			b1.setVisible(true);
			b2.setVisible(true);
			tf.setText("Do you want to trade?");
			counter = 0;
		}
	}
	
	/**
	 * This method trades the brick resource with the bank. The first click on the button
	 * removes 4 brick resources of the active player hand. The second click on the button
	 * add 1 brick resource of the active player hand.
	 */
	private void actionListenerBrick(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four brick from hand
		if (counter == 1) {
			bankTax(myHand, "resource", "brick", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			bankTax(myHand, "resource", "brick", 1);
			wool.setVisible(false);
			ore.setVisible(false);
			brick.setVisible(false);
			wood.setVisible(false);
			wheat.setVisible(false);
			b1.setVisible(true);
			b2.setVisible(true);
			tf.setText("Do you want to trade?");
			counter = 0;
		}
	}
	
	/**
	 * This method trades the wood resource with the bank. The first click on the button
	 * removes 4 wood resources of the active player hand. The second click on the button
	 * add 1 wood resource of the active player hand.
	 */
	private void actionListenerWood(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four wood from hand
		if (counter == 1) {
			bankTax(myHand, "resource", "wood", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			bankTax(myHand, "resource", "wood", 1);
			wool.setVisible(false);
			ore.setVisible(false);
			brick.setVisible(false);
			wood.setVisible(false);
			wheat.setVisible(false);
			b1.setVisible(true);
			b2.setVisible(true);
			tf.setText("Do you want to trade?");
			counter = 0;
		}
	}
	
	/**
	 * This method trades the wheat resource with the bank. The first click on the button
	 * removes 4 wheat resources of the active player hand. The second click on the button
	 * add 1 wheat resource of the active player hand.
	 */
	private void actionListenerWheat(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four wheat from hand
		if (counter == 1) {
			bankTax(myHand, "resource", "wheat", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			bankTax(myHand, "resource", "wheat", 1);
			wool.setVisible(false);
			ore.setVisible(false);
			brick.setVisible(false);
			wood.setVisible(false);
			wheat.setVisible(false);
			b1.setVisible(true);
			b2.setVisible(true);
			tf.setText("Do you want to trade?");
			counter = 0;
		}
	}
}  	
