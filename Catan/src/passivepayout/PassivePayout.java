package passivepayout;

import java.util.ArrayList;

import dice.*;

public class PassivePayout {
	private int dice_number;
	private TileInformation information = new TileInformation();
	
	public int GetDiceThrow() {
		Dice dice = new Dice();
		dice.setSum();
		dice_number = dice.getSum();
		
		return dice_number;
	}
	
	public void SetPayout(int dice_number) {
		information.setTileNumber();
		information.SetResourceOfTile();
		information.setHouseOnTile();
		information.SetPassivePayoutInformation();
		information.SetTilesInformation(dice_number);
//		System.out.println(dice_number);
	}
	
	public void GetPayout() {
		ArrayList<String> payout_result = information.getTilesInformation();
	}

}
