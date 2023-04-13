package JFramePractce;

import javax.swing.*;  

public class JFrameExample {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public JFrameExample() {
		
		//panel = new JPanel();  
    
        //label = new JLabel("JFrame By Example");  
		button =new JButton();
		button.setBounds(100, 100, 100, 100);
		
		frame=new JFrame ("Welcome Catan Game");
		
		button.setText("Start");
		button.setText("Setting");
		frame.add(button);
		frame.add(button);
		
		//panel.add(label);
		//panel.add(button);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	

	public static void main(String[] args) {
		new JFrameExample();

	}

}
