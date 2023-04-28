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
	
	public void SetPayout() {
		information.setTileNumber();
		information.SetResourceOfTile();
		information.SetHouseOnTile();
		information.SetPassivePayoutInformation();
		information.SetTilesInformation(11);
		System.out.println(dice_number);
	}
	
	public void GetPayout() {
		ArrayList<String> payout_result = information.getTilesInformation();
	}

}
