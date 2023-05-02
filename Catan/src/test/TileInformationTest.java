package test;

import java.util.ArrayList;
import hand.*;

import junit.framework.TestCase;
import passivepayout.TileInformation;

public class TileInformationTest extends TestCase {
	
	public void testSetTilesInformation() {
		Hand testHand = new Hand();
		
		TileInformation information = new TileInformation();
		information.setTileNumber();
		information.SetResourceOfTile();
		information.setHouseOnTile();
		information.SetPassivePayoutInformation();
		
		information.SetTilesInformation(11, testHand);
		testHand = information.getTilesInformation();
		
		
		assertEquals(testHand.getCard("resource", "brick"), 1);
		assertEquals(testHand.getCard("resource", "ore"), 1);

	}

}
