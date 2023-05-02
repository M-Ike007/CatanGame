package passivepayout;

import java.util.ArrayList;
import hand.*;

import dice.*;

public class PassivePayout {
	private int dice_number;
	private TileInformation information = new TileInformation();
	private Hand payout_result;
	
	public int GetDiceThrow() {
		Dice dice = new Dice();
		dice.setSum();
		dice_number = dice.getSum();
		
		return dice_number;
	}
	
	public void SetPayout(int dice_number, Hand hand, int playerNumber) {
		information.setTileNumber();
		information.setResourceOfTile();
		information.setHouseOnTile();
		information.setPassivePayoutInformation();
		information.setTilesInformation(dice_number, hand, playerNumber);
		payout_result = information.getTilesInformation();
	}
	
	public Hand GetPayout() {
		return payout_result;
	}

}
