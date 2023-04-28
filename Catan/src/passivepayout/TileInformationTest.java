package passivepayout;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TileInformationTest extends TestCase {
	private ArrayList<String> payout_test = new ArrayList<String>();
	
	public void testSetTilesInformation() {
		TileInformation information = new TileInformation();
		information.setTileNumber();
		information.SetResourceOfTile();
		information.SetHouseOnTile();
		information.SetPassivePayoutInformation();
		
		information.SetTilesInformation(11);
		ArrayList<String> payout_result = information.getTilesInformation();
		
		payout_test.add("Player1 gets -brick");
		payout_test.add("Player2 gets -ore");
		
		assertEquals(payout_result, payout_test);
	}

}
