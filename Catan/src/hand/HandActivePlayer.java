package hand;

import java.awt.*;

import javax.swing.*;
import game.Main;

/** Class to plot the numbers of a players hand.
 * @author Sibbe, Mees
 * This class takes a frame during its construction to add the text fields
 * to a frame.
 * 
 *```java
 *    JFrame f = new JFrame();
 *    JFrame handPlot = new HandActivePlayer(mees, f).plotHand();
 *    System.out.println(handPlot);
 *    handPlot.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
 *    handPlot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *    handPlot.setResizable(true);
 *    handPlot.setLayout(null);
 *    handPlot.setVisible(true);
 *```
 */
public class HandActivePlayer  {
	private JPanel p;// = new JFrame();
	public HandActivePlayer(Hand currentHand, JPanel p) {
		
	    //JFrame f= new JFrame("TextField Example");  
	    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;  
	    // resource cards
	    t1=new JTextField(Integer.toString(currentHand.getCard("resource",
	    		"brick")));  
	    t1.setBounds(320,590, 65,30);
	    t1.setEditable(false);
	    t1.setHorizontalAlignment(JTextField.CENTER);
	    t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t1.setBackground(new java.awt.Color(251, 232, 154));
	    t1.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t1);
	    
	    t2=new JTextField(Integer.toString(currentHand.getCard("resource",
	    		"wood")));
	    t2.setBounds(390,590, 65,30);
	    t2.setEditable(false);
	    t2.setHorizontalAlignment(JTextField.CENTER);
	    t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t2.setBackground(new java.awt.Color(251, 232, 154));
	    t2.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t2);
	    
	    t3=new JTextField(Integer.toString(currentHand.getCard("resource", 
	    		"ore")));  
	    t3.setBounds(460,590, 65,30);
	    t3.setEditable(false);
	    t3.setHorizontalAlignment(JTextField.CENTER);
	    t3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t3.setBackground(new java.awt.Color(251, 232, 154));
	    t3.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t3);
	    	    
	    t4=new JTextField(Integer.toString(currentHand.getCard("resource", 
	    		"wool")));  
	    t4.setBounds(530,590, 65,30);
	    t4.setEditable(false);
	    t4.setHorizontalAlignment(JTextField.CENTER);
	    t4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t4.setBackground(new java.awt.Color(251, 232, 154));
	    t4.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t4);
	    
	    t5=new JTextField(Integer.toString(currentHand.getCard("resource",
	    		"wheat")));  
	    t5.setBounds(600,590, 65,30);
	    t5.setEditable(false);
	    t5.setHorizontalAlignment(JTextField.CENTER);
	    t5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t5.setBackground(new java.awt.Color(251, 232, 154));
	    t5.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t5);
	    p.add(t5);
	    
	    // development cards
	    t6=new JTextField(Integer.toString(currentHand.getCard("development",
	    		"knight")));  
	    t6.setBounds(670,590, 65,30);
	    t6.setEditable(false);
	    t6.setHorizontalAlignment(JTextField.CENTER);
	    t6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t6.setBackground(new java.awt.Color(251, 232, 154));
	    t6.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t6);   
	    
	    t7=new JTextField(Integer.toString(currentHand.getCard("development", 
	    		"invention")));  
	    t7.setBounds(740,590, 65,30);
	    t7.setEditable(false);
	    t7.setHorizontalAlignment(JTextField.CENTER);
	    t7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t7.setBackground(new java.awt.Color(251, 232, 154));
	    t7.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t7);
	    
	    t8=new JTextField(Integer.toString(currentHand.getCard("development",
	    		"monopoly")));  
	    t8.setBounds(810,590, 65,30);
	    t8.setEditable(false);
	    t8.setHorizontalAlignment(JTextField.CENTER);
	    t8.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t8.setBackground(new java.awt.Color(251, 232, 154));
	    t8.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t8);
	    	    
	    t9=new JTextField(Integer.toString(currentHand.getCard("development", 
	    		"twoRoads")));  
	    t9.setBounds(880,590, 65,30);
	    t9.setEditable(false);
	    t9.setHorizontalAlignment(JTextField.CENTER);
	    t9.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t9.setBackground(new java.awt.Color(251, 232, 154));
	    t9.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t9);
	    
	    t10=new JTextField(Integer.toString(currentHand.getCard("development", 
	    		"vcp")));  
	    t10.setBounds(950,590, 65,30);
	    t10.setEditable(false);
	    t10.setHorizontalAlignment(JTextField.CENTER);
	    t10.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t10.setBackground(new java.awt.Color(251, 232, 154));
	    t10.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    p.add(t10);  
	    this.p = p; 
	    
	}
	 public JPanel plotHand() {
		 return this.p;
	 }
	
}


//rescource cards
   // f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(t5);    
	// development cards
   // f.add(t6); f.add(t7); f.add(t8); f.add(t9); f.add(t10);
   
   
//   TempBoardForShowHand m=new TempBoardForShowHand();   
//   f.add(m); // adds the board to the JFrame
//   f.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
//   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   f.setResizable(false);
//   f.setVisible(true); 
//