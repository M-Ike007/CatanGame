package test;

import hand.Hand;
import junit.framework.TestCase;

public class HandTest extends TestCase {
	private final int DESIRED = 10;

	public void testInitialisation() {
		Hand testHand = new Hand();
		int desired = 0;
		int resultRes = testHand.getCard("resource", "wool");
		assertEquals(resultRes, desired);
	}

	public void testGetSetValue() {
		Hand testHand = new Hand();
		// Test for resource cards
		testHand.setCard("resource", "wool", DESIRED);
		int resultRes = testHand.getCard("resource", "wool");
		assertEquals(resultRes, DESIRED);

		// Test for knight cards
		testHand.setCard("development", "knight", DESIRED);
		int resultDev = testHand.getCard("development", "knight");
		assertEquals(resultDev, DESIRED);
	}

	public void testRemoveCard() {
		Hand testHand = new Hand();

		// Test for wool
		testHand.setCard("resource", "wool", DESIRED);
		testHand.setCard("resource", "wool", -1);
		int resultWool = testHand.getCard("resource", "wool");
		assertEquals(resultWool, DESIRED - 1);

		// Test for knight
		testHand.setCard("development", "knight", DESIRED);
		testHand.setCard("development", "knight", -1);
		int resultKnight = testHand.getCard("development", "knight");
		assertEquals(resultKnight, DESIRED - 1);
	}

	public void testAddCard() {
		Hand testHand = new Hand();

		// Test wool
		testHand.setCard("resource", "wool", DESIRED);
		testHand.setCard("resource", "wool", 1);
		int resultWool = testHand.getCard("resource", "wool");
		assertEquals(resultWool, DESIRED + 1);

		// Test knight
		testHand.setCard("development", "knight", DESIRED);
		testHand.setCard("development", "knight", 1);
		int resultKnight = testHand.getCard("development", "knight");
		assertEquals(resultKnight, DESIRED + 1);
	}
}