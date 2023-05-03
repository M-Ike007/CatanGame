package tradebank;

import java.awt.event.*;  
import javax.swing.*;
import java.awt.*;

import hand.*;
import player.*;
   
/**
 * @author TEK, SDH.
 * The trade button the active player will see when it is their turn.
 * 
 * This class opens a window that asks the players whether they want to trade and if so what.
 * Later future iterations should include how much of the given resources should be traded.
 * The idea is to include arrows above the resources indicating the number to be traded.
 * Then the active player can iterate over the non-active players to trade with.
 * The non-active players can either return no, yes, or change request. 
 * 
 */



public class TradeBank extends JFrame {
	
//	public static void main(String[] args) {
//		TradeBank frame = new TradeBank();
//		//frame.setVisible(true);
//	}

	public Hand myHand;
	private int counter = 0;
	private JTextField tf;
	private JButton b1;
	private JButton b2;
	private JButton wool;
	private JButton ore;
	private JButton brick;
	private JButton wood;
	private JButton wheat;
	
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
				// Methode voor het traden
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
	    wool =new JButton("wool");
	    wool.setBounds(50,200,80,20);
	    wool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerWool();
			}
			
		});
		ore =new JButton("ore");  
		ore.setBounds(150,200,80,20);
		ore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerOre(myHand);
			}
		});
		brick =new JButton("brick"); 
		brick.setBounds(250,200,80,20);
		brick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerBrick(myHand);			
			}
		
		});
		wood =new JButton("wood");
		wood.setBounds(350,200,80,20);
		wood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerWood(myHand);	
			}
		
		});
		wheat =new JButton("wheat");
		wheat.setBounds(450,200,80,20);
		wheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListenerWheat(myHand);			
			}
		});
	    
	    
	    tf.setEditable(false);
	    tf.setBounds(50,100,600,30);
	    b2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	    	}
	    });
	    
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


	public void Banktax(Hand myHand, String resource, String card, int amount) {
		myHand.setCard(resource, card, amount);
	} 
	
	public void actionListenerWool() {
		// counter add 1
		counter += 1;
		// remove four wool from hand
		if (counter == 1) {
			Banktax(myHand, "resource", "wool", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			Banktax(myHand, "resource", "wool", 1);
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
	
	public void actionListenerOre(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four ore from hand
		if (counter == 1) {
			Banktax(myHand, "resource", "ore", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			Banktax(myHand, "resource", "ore", 1);
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
	
	public void actionListenerBrick(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four brick from hand
		if (counter == 1) {
			Banktax(myHand, "resource", "brick", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			Banktax(myHand, "resource", "brick", 1);
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
	
	public void actionListenerWood(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four wood from hand
		if (counter == 1) {
			Banktax(myHand, "resource", "wood", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			Banktax(myHand, "resource", "wood", 1);
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
	
	public void actionListenerWheat(Hand myHand) {
		// counter add 1
		counter += 1;
		// remove four wheat from hand
		if (counter == 1) {
			Banktax(myHand, "resource", "wheat", -4);
			tf.setText("What do you want to receive one resource of");
		}
		if (counter == 2) {
			Banktax(myHand, "resource", "wheat", 1);
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
