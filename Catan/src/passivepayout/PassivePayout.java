package passivepayout;

import hand.*;

/**
 * Sets the passive payout of a player.
 */
public class PassivePayout {
	private TileInformation information = new TileInformation();
	private Hand payoutResult;
	
	/**
	 * Sets the payout of a player
	 * @param dice_number: int, number of dice throw
	 * @param hand: Hand, hand of a player 
	 * @param playerNumber: int, player number
	 */
	public void SetPayout(int dice_number, Hand hand, int playerNumber) {
		information.setTileNumber();
		information.setResourceOfTile();
		information.setHouseOnTile();
		information.setPassivePayoutInformation();
		information.setTilesInformation(dice_number, hand, playerNumber);
		payoutResult = information.getTilesInformation();
	}
	
	/**
	 * Gets the payout of a player
	 * @return Hand:, hand of the player
	 */
	public Hand getPayout() {
		return payoutResult;
	}
}
