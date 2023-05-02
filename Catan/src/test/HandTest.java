package test;

import hand.Hand;
import junit.framework.TestCase;

public class HandTest extends TestCase {
	
	public void testInitialisation() {
		Hand testHand = new Hand();
		int desired = 0;
		int resultRes = testHand.getCard("resource", "wool");
		assertEquals(resultRes, desired);
	}
	
	public void testGetSetValue() {
		Hand testHand = new Hand();
		int desired = 10;
		// Test for resource cards
		testHand.setCard("resource", "wool", desired);
		int resultRes = testHand.getCard("resource", "wool");
		assertEquals(resultRes, desired);
		
		// Test for knight cards
		testHand.setCard("development", "knight", desired);
		int resultDev = testHand.getCard("development", "knight");
		assertEquals(resultDev, desired);
	}
	
	public void testRemoveCard() {
		Hand testHand = new Hand();
		int desired = 10;
		
		
		// Test for wool
		testHand.setCard("resource", "wool", desired);
		testHand.setCard("resource", "wool", - 1);
		int resultWool = testHand.getCard("resource", "wool");
		assertEquals(resultWool, desired - 1);
		
		// Test for knight
		testHand.setCard("development", "knight", desired);
		testHand.setCard("development", "knight", - 1);
		int resultKnight = testHand.getCard("development", "knight");
		assertEquals(resultKnight, desired - 1);
	}
	
	public void testAddCard() {
		Hand testHand = new Hand();
		int desired = 10;
		
		// Test wool
		testHand.setCard("resource", "wool", desired);
		testHand.setCard("resource", "wool", 1);
		int resultWool = testHand.getCard("resource", "wool");
		assertEquals(resultWool, desired +  1);
		
		// Test knight 
		testHand.setCard("development", "knight", desired);
		testHand.setCard("development", "knight", + 1);
		int resultKnight = testHand.getCard("development", "knight");
		assertEquals(resultKnight, desired + 1);		
	}
}