package test;

import hand.*;
import junit.framework.TestCase;
import passivepayout.TileInformation;

public class TileInformationTest extends TestCase {

	public void testSetTilesInformation() {
		Hand testHand1 = new Hand();
		Hand testHand2 = new Hand();

		TileInformation information = new TileInformation();
		information.setTileNumber();
		information.setResourceOfTile();
		information.setHouseOnTile();
		information.setPassivePayoutInformation();

		information.setTilesInformation(11, testHand1, 1);
		testHand1 = information.getTilesInformation();
		assertEquals(testHand1.getCard("resource", "brick"), 1);
		assertEquals(testHand1.getCard("resource", "ore"), 0);

		information.setTilesInformation(11, testHand2, 2);
		testHand2 = information.getTilesInformation();
		assertEquals(testHand2.getCard("resource", "brick"), 0);
		assertEquals(testHand2.getCard("resource", "ore"), 1);
	}
}
