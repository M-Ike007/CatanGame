package gui_board;

import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;


public class ResourceNumbers {

	private JFrame f= new JFrame("ResourceRumbers");
	
	
	public ResourceNumbers() {
 // Adding the tiles.
     
        // 2nd row
        JLabel Pos22 = new JLabel();
        Pos22.setBounds(500, 100, 100, 100);
        Pos22.setSize(100, 100);
        Pos22.setHorizontalAlignment(JLabel.CENTER);
        Pos22.setText("2");
        f.add(Pos22);
        
      	JLabel Pos23 = new JLabel();
        Pos23.setBounds(600, 100, 100, 100);
        Pos23.setSize(100, 100);
        Pos23.setHorizontalAlignment(JLabel.CENTER);
        Pos23.setText("3");
        f.add(Pos23);
        
        JLabel Pos24 = new JLabel();
        Pos24.setBounds(700, 100, 100, 100);
        Pos24.setSize(100, 100);
        Pos24.setHorizontalAlignment(JLabel.CENTER);
        Pos24.setText("3");
        f.add(Pos24);
       
        // 3th row
        JLabel Pos32 = new JLabel();
        Pos32.setBounds(450, 175, 100, 100);
        Pos32.setSize(100, 100);
        Pos32.setHorizontalAlignment(JLabel.CENTER);
        Pos32.setText("4");
        f.add(Pos32);
        
        JLabel Pos33 = new JLabel();
        Pos33.setBounds(550, 175, 100, 100);
        Pos33.setSize(100, 100);
        Pos33.setHorizontalAlignment(JLabel.CENTER);
        Pos33.setText("4");
        f.add(Pos33);
        
        JLabel Pos34 = new JLabel();
        Pos34.setBounds(650, 175, 100, 100);
        Pos34.setSize(100, 100);
        Pos34.setHorizontalAlignment(JLabel.CENTER);
        Pos34.setText("5");
        f.add(Pos34);
        
        JLabel Pos35 = new JLabel();
        Pos35.setBounds(750, 175, 100, 100);
        Pos35.setSize(100, 100);
        Pos35.setHorizontalAlignment(JLabel.CENTER);
        Pos35.setText("5");
        f.add(Pos35);
               
        // 4th row
        JLabel Pos42 = new JLabel();
        Pos42.setBounds(400, 250, 100, 100);
        Pos42.setSize(100, 100);
        Pos42.setHorizontalAlignment(JLabel.CENTER);
        Pos42.setText("6");
        f.add(Pos42);
        
        JLabel Pos43 = new JLabel();
        Pos43.setBounds(500, 250, 100, 100);
        Pos43.setSize(100, 100);
        Pos43.setHorizontalAlignment(JLabel.CENTER);
        Pos43.setText("6");
        f.add(Pos43);
        
        JLabel Pos44 = new JLabel();
        //Row4Col4.setIcon(desert);
        Pos44.setBounds(600, 250, 100, 100);
        Pos44.setSize(100, 100);
        Pos22.setHorizontalAlignment(JLabel.CENTER);
        Pos22.setText("desert");
        f.add(Pos44);
        
        JLabel Pos45 = new JLabel();
        Pos45.setBounds(700, 250, 100, 100);
        Pos45.setSize(100, 100);
        Pos45.setHorizontalAlignment(JLabel.CENTER);
        Pos45.setText("8");
        f.add(Pos45);
        
        JLabel Pos46 = new JLabel();
        Pos46.setBounds(800, 250, 100, 100);
        Pos46.setSize(100, 100);
        Pos46.setHorizontalAlignment(JLabel.CENTER);
        Pos46.setText("8");
        f.add(Pos46);
                 
        // 5th row
        JLabel Pos52 = new JLabel();
        Pos52.setBounds(450, 325, 100, 100);
        Pos52.setSize(100, 100);
        Pos52.setHorizontalAlignment(JLabel.CENTER);
        Pos52.setText("9");
        f.add(Pos52);
        
        JLabel Pos53 = new JLabel();
        Pos53.setBounds(550, 325, 100, 100);
        Pos53.setSize(100, 100);
        Pos52.setHorizontalAlignment(JLabel.CENTER);
        Pos52.setText("9");
        f.add(Pos53);
        
        JLabel Pos54 = new JLabel();
        Pos54.setBounds(650, 325, 100, 100);
        Pos54.setSize(100, 100);
        Pos54.setHorizontalAlignment(JLabel.CENTER);
        Pos54.setText("10");
        f.add(Pos54);
        
        JLabel Pos55 = new JLabel();
        Pos55.setBounds(750, 325, 100, 100);
        Pos55.setSize(100, 100);
        Pos55.setHorizontalAlignment(JLabel.CENTER);
        Pos55.setText("10");
        f.add(Pos55);

        //6th row
        JLabel Pos62 = new JLabel();
        Pos62.setBounds(500, 400, 100, 100);
        Pos62.setSize(100, 100);
        Pos62.setHorizontalAlignment(JLabel.CENTER);
        Pos62.setText("11");
        f.add(Pos62);
        
        JLabel Pos63 = new JLabel();
        Pos63.setBounds(600, 400, 100, 100);
        Pos63.setSize(100, 100);
        Pos63.setHorizontalAlignment(JLabel.CENTER);
        Pos63.setText("11");
        f.add(Pos63);
        
        JLabel Pos64 = new JLabel();
        Pos64.setBounds(700, 400, 100, 100);
        Pos64.setSize(100, 100);
        Pos64.setHorizontalAlignment(JLabel.CENTER);
        Pos64.setText("12");
        f.add(Pos64);
  	
		// Settings of the JFrame
        f.setVisible(true);
        f.setResizable(false);
	    f.setSize(1920,1080);  
		
	}
	public static void main(String[] args) {
		new ResourceNumbers();

	}

}
