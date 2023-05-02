package passivepayout;

import hand.*;

public class PassivePayout {
	private TileInformation information = new TileInformation();
	private Hand payout_result;
	
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
