package hand;

import javax.swing.JFrame;

public class Temp_Board_Main {
	// this generates the board in a JFrame
    public static void main(String[] args) {  
    TempBoardForShowHand m=new TempBoardForShowHand();  
    JFrame f=new JFrame();  
    f.add(m); // adds the board to the JFrame 
    f.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setResizable(false);
    f.setVisible(true); 
    }
}
