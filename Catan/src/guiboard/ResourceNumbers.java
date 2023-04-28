package guiboard;

import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.util.HashMap;


// When adding this to the board make sure the code for the numbers is ABOVE the code for the tile images.
// This ensures the numbers get layered above the images (otherwise you can't see them).

// Positions Pos22, Pos44, Pos52, Pos53 are broken for some reason (on my laptop at least).
// Pos22 should say 6 but says Desert
// Pos44 should say Desert but is empty
// Pos52 should say 10
// Pos53 should say 11

public class ResourceNumbers {

	private JFrame f= new JFrame("ResourceRumbers");
	
	
	public ResourceNumbers() {
		
		//HashMap with resource numbers per location
		HashMap<String, Integer> rNums = new HashMap<String, Integer>();

		// Add keys and values (Position, ResourceNumber) 
		//The numbers in the key represent rows and columns: Pos45 = row 4 and column 5
		rNums.put("Pos22", 6);
		rNums.put("Pos23", 3);
		rNums.put("Pos24", 8);
		rNums.put("Pos32", 2);
		rNums.put("Pos33", 4);
		rNums.put("Pos34", 5);
		rNums.put("Pos35", 10);
		rNums.put("Pos42", 5);
		rNums.put("Pos43", 9);
		rNums.put("Pos45", 6);
		rNums.put("Pos46", 9);
		rNums.put("Pos52", 10);
		rNums.put("Pos53", 11);
		rNums.put("Pos54", 3);
		rNums.put("Pos55", 12);
		rNums.put("Pos62", 8);
		rNums.put("Pos63", 4);
		rNums.put("Pos64", 11);
		
        // 2nd row
        JLabel Pos22 = new JLabel();
        Pos22.setBounds(500, 100, 100, 100);
        Pos22.setSize(100, 100);
        Pos22.setHorizontalAlignment(JLabel.CENTER);
        Pos22.setText(Integer.toString(rNums.get("Pos22")));
        f.add(Pos22);
        
      	JLabel Pos23 = new JLabel();
        Pos23.setBounds(600, 100, 100, 100);
        Pos23.setSize(100, 100);
        Pos23.setHorizontalAlignment(JLabel.CENTER);
        Pos23.setText(Integer.toString(rNums.get("Pos23")));
        f.add(Pos23);
        
        JLabel Pos24 = new JLabel();
        Pos24.setBounds(700, 100, 100, 100);
        Pos24.setSize(100, 100);
        Pos24.setHorizontalAlignment(JLabel.CENTER);
        Pos24.setText(Integer.toString(rNums.get("Pos24")));
        f.add(Pos24);
       
        // 3th row
        JLabel Pos32 = new JLabel();
        Pos32.setBounds(450, 175, 100, 100);
        Pos32.setSize(100, 100);
        Pos32.setHorizontalAlignment(JLabel.CENTER);
        Pos32.setText(Integer.toString(rNums.get("Pos32")));
        f.add(Pos32);
        
        JLabel Pos33 = new JLabel();
        Pos33.setBounds(550, 175, 100, 100);
        Pos33.setSize(100, 100);
        Pos33.setHorizontalAlignment(JLabel.CENTER);
        Pos33.setText(Integer.toString(rNums.get("Pos33")));
        f.add(Pos33);
        
        JLabel Pos34 = new JLabel();
        Pos34.setBounds(650, 175, 100, 100);
        Pos34.setSize(100, 100);
        Pos34.setHorizontalAlignment(JLabel.CENTER);
        Pos34.setText(Integer.toString(rNums.get("Pos34")));
        f.add(Pos34);
        
        JLabel Pos35 = new JLabel();
        Pos35.setBounds(750, 175, 100, 100);
        Pos35.setSize(100, 100);
        Pos35.setHorizontalAlignment(JLabel.CENTER);
        Pos35.setText(Integer.toString(rNums.get("Pos35")));
        f.add(Pos35);
               
        // 4th row
        JLabel Pos42 = new JLabel();
        Pos42.setBounds(400, 250, 100, 100);
        Pos42.setSize(100, 100);
        Pos42.setHorizontalAlignment(JLabel.CENTER);
        Pos42.setText(Integer.toString(rNums.get("Pos42")));
        f.add(Pos42);
        
        JLabel Pos43 = new JLabel();
        Pos43.setBounds(500, 250, 100, 100);
        Pos43.setSize(100, 100);
        Pos43.setHorizontalAlignment(JLabel.CENTER);
        Pos43.setText(Integer.toString(rNums.get("Pos43")));
        f.add(Pos43);
        
//        JLabel Pos44 = new JLabel();
//        //Row4Col4.setIcon(desert);
//        Pos44.setBounds(600, 250, 100, 100);
//        Pos44.setSize(100, 100);
//        Pos22.setHorizontalAlignment(JLabel.CENTER);
//        Pos22.setText("desert");
//        f.add(Pos44);
        
        JLabel Pos45 = new JLabel();
        Pos45.setBounds(700, 250, 100, 100);
        Pos45.setSize(100, 100);
        Pos45.setHorizontalAlignment(JLabel.CENTER);
        Pos45.setText(Integer.toString(rNums.get("Pos45")));
        f.add(Pos45);
        
        JLabel Pos46 = new JLabel();
        Pos46.setBounds(800, 250, 100, 100);
        Pos46.setSize(100, 100);
        Pos46.setHorizontalAlignment(JLabel.CENTER);
        Pos46.setText(Integer.toString(rNums.get("Pos46")));
        f.add(Pos46);
                 
        // 5th row
        JLabel Pos52 = new JLabel();
        Pos52.setBounds(450, 325, 100, 100);
        Pos52.setSize(100, 100);
        Pos52.setHorizontalAlignment(JLabel.CENTER);
        Pos52.setText(Integer.toString(rNums.get("Pos52")));
        f.add(Pos52);
        
        JLabel Pos53 = new JLabel();
        Pos53.setBounds(550, 325, 100, 100);
        Pos53.setSize(100, 100);
        Pos53.setHorizontalAlignment(JLabel.CENTER);
        Pos53.setText(Integer.toString(rNums.get("Pos53")));
        f.add(Pos53);
        
        JLabel Pos54 = new JLabel();
        Pos54.setBounds(650, 325, 100, 100);
        Pos54.setSize(100, 100);
        Pos54.setHorizontalAlignment(JLabel.CENTER);
        Pos54.setText(Integer.toString(rNums.get("Pos54")));
        f.add(Pos54);
        
        JLabel Pos55 = new JLabel();
        Pos55.setBounds(750, 325, 100, 100);
        Pos55.setSize(100, 100);
        Pos55.setHorizontalAlignment(JLabel.CENTER);
        Pos55.setText(Integer.toString(rNums.get("Pos55")));
        f.add(Pos55);

        //6th row
        JLabel Pos62 = new JLabel();
        Pos62.setBounds(500, 400, 100, 100);
        Pos62.setSize(100, 100);
        Pos62.setHorizontalAlignment(JLabel.CENTER);
        Pos62.setText(Integer.toString(rNums.get("Pos62")));
        f.add(Pos62);
        
        JLabel Pos63 = new JLabel();
        Pos63.setBounds(600, 400, 100, 100);
        Pos63.setSize(100, 100);
        Pos63.setHorizontalAlignment(JLabel.CENTER);
        Pos63.setText(Integer.toString(rNums.get("Pos63")));
        f.add(Pos63);
        
        JLabel Pos64 = new JLabel();
        Pos64.setBounds(700, 400, 100, 100);
        Pos64.setSize(100, 100);
        Pos64.setHorizontalAlignment(JLabel.CENTER);
        Pos64.setText(Integer.toString(rNums.get("Pos64")));
        f.add(Pos64);
        
        JLabel Pos0 = new JLabel();
        Pos0.setBounds(500, 100, 100, 100);
        Pos0.setSize(100, 100);
        Pos0.setHorizontalAlignment(JLabel.CENTER);
        Pos0.setText("");
        f.add(Pos0);
		
  	
		// Settings of the JFrame
        f.setVisible(true);
        f.setResizable(false);
	    f.setSize(1920,1080);  
		
	}
	public static void main(String[] args) {
		new ResourceNumbers();

	}

}
