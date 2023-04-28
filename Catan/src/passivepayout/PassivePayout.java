package passivepayout;

import dice.*;

public class PassivePayout {
	private int dice_number;
	
	public int GetDiceThrow() {
		Dice dice = new Dice();
		dice.setSum();
		dice_number = dice.getSum();
		
		return dice_number;
	}
	
	public void SetPayout() {
		System.out.println(dice_number);
	}
	
	private void GetPayout() {
		
	}

}
