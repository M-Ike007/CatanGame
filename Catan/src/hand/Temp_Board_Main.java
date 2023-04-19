package hand;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Temp_Board_Main {
	// this generates the board in a JFrame
    public static void main(String[] args) {  
    TempBoardForShowHand m=new TempBoardForShowHand(); 
    
    Hand mees = new Hand();
    
    JFrame f=new JFrame();  
    //JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    f.add(m); // adds the board to the JFrame 
    
    
    
    ShowHandTextfield textfield = new ShowHandTextfield(mees, "resource", "brick", 320,590, 65,30);
    JTextField brick = textfield.Create_textfield();
    brick.setOpaque(true);
    f.add(brick);
    //f.add(HandActivePlayer(t1, t2, t3, t4, t5, t6, t7, t8 , t9 , t10));
    f.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setResizable(false);
    f.setLayout(null);
    f.setVisible(true); 
    }
}
