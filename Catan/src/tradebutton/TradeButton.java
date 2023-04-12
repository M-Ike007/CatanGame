package tradebutton;

import java.awt.event.*;  
import javax.swing.*;
import java.awt.*;
   
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
public class TradeButton {

	public static void main(String[] args) {  
		JFrame f=new JFrame("Trade");  
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
				tf.setText("What do you want to trade?");	
				JButton  wool =new JButton("wool"); 
				JButton  ore =new JButton("ore");  
				JButton  brick =new JButton("brick");  
				JButton  wood =new JButton("wood");
				b1.setVisible(false); 
				b2.setVisible(false); 
				wool.setBounds(50,200,80,20);
				ore.setBounds(150,200,80,20);
				brick.setBounds(250,200,80,20);
				wood.setBounds(350,200,80,20);
				f.add(wool);
				f.add(ore);
				f.add(brick);
				f.add(wood);
				
			}
	    	
	    });  
	    f.add(tf);
	    f.add(b1);
	    f.add(b2);
	    f.setSize(700,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	}  
	
	   
}  	

