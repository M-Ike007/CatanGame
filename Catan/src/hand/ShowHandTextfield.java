package hand;

import java.awt.Font;

import javax.swing.JTextField;

public class ShowHandTextfield {
	
	private Hand player_hand;
	private String card_class;
	private String card;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public ShowHandTextfield(Hand player_hand, String card_class, String card, int x, int y, int width, int height) {
		
		this.player_hand = player_hand;
		this.card_class = card_class;
		this.card = card;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	public JTextField Create_textfield (){
		
	    JTextField t1=new JTextField(Integer.toString(player_hand.getCard(card_class, card)));  
	    t1.setBounds(x,y, width,height);
	    t1.setEditable(false);
	    t1.setHorizontalAlignment(JTextField.CENTER);
	    t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	    t1.setBackground(new java.awt.Color(251, 232, 154));
	    t1.setFont(new Font("Gill Sans Nova Regular",Font.PLAIN, 18));
	    
	    return t1;
	}

}
