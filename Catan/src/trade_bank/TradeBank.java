package trade_bank;

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
	
	public static void main(String[] args) {
		TradeBank frame = new TradeBank();
		//frame.setVisible(true);
	}
	
	Hand hand = new Hand();
	Player player = new Player(hand);
	public void initializer() {
	hand.setCard("resource", "wool", 6);
	System.out.println(hand.getCard("resource", "wool"));
	
	}
	
	public TradeBank() {  
		JFrame frame=new JFrame("Trade");  
	    JTextField tf;
	    tf = new JTextField("Do you want to trade?");
	    JButton b1 =new JButton("Yes");  
	    JButton b2 =new JButton("No");  
	    b1.setBounds(50,200,300,30);
	    b2.setBounds(350,200,300,30);
	    tf.setEditable(false);
	    tf.setBounds(50,100,600,30);
	    b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tf.setText("What do you want to give four resources of?");	
				// five buttons of resources
				JButton  wool =new JButton("wool"); 
				JButton  ore =new JButton("ore");  
				JButton  brick =new JButton("brick");  
				JButton  wood =new JButton("wood");
				JButton  wheat =new JButton("wheat");
				// old buttons invisible
				b1.setVisible(false); 
				b2.setVisible(false); 
				// set place and size of buttons
				wool.setBounds(50,200,80,20);
				ore.setBounds(150,200,80,20);
				brick.setBounds(250,200,80,20);
				wood.setBounds(350,200,80,20);
				wheat.setBounds(450,200,80,20);
				// add to JFrame
				frame.add(wool);
				frame.add(ore);
				frame.add(brick);
				frame.add(wood);
				frame.add(wheat);
			// add actions to buttons
			wool.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// remove four wool from hand
					Banktax("resource", "wool", -4);
					System.out.println(hand.getCard("resource", "wool"));
					// create button to ask what the player wants to receive
						
					// actionlistener for giving that resource to the player
					
						
					}
					
				});
				
			}
	    	
	    });  
				
	    frame.add(tf);
	    frame.add(b1);
	    frame.add(b2);
	    frame.setSize(700,400);  
	    frame.setLayout(null);
	    frame.setVisible(true);
	    
	}  
	
	public void Banktax(String resource, String card, int amount) {
		hand.setCard(resource, card, amount);
		
	
	}
	   
}  	

