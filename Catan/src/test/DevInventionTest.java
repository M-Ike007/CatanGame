package test;

import junit.framework.TestCase;
import cards.DevCard;
import cards.DevInvention;
import hand.Hand;

public class DevInventionTest extends TestCase {
	public void testIncreaseTest() {
		Hand testHand = new Hand();
		DevInvention inventionClass = new DevInvention();
		testHand.setCard("resource", "wheat", 1);
		testHand.setCard("resource", "ore", 1);
		testHand.setCard("resource", "wool", 1);

		DevCard testDevCard2 = new DevCard();
		testDevCard2.transactDevelopmentCardPurchase(testHand, "invention");

		inventionClass.setInventReward(testHand);

		int knight = testHand.getCard("development", "knight");
		int twoRoads = testHand.getCard("development", "twoRoads");
		int invention = testHand.getCard("development", "invention");
		int monopoly = testHand.getCard("development", "monopoly");
		int vcp = testHand.getCard("development", "vcp");
		int wheat = testHand.getCard("resource", "wheat");
		int ore = testHand.getCard("resource", "ore");
		int wood = testHand.getCard("resource", "wood");
		int brick = testHand.getCard("resource", "brick");
		int wool = testHand.getCard("resource", "wool");

		int sum = knight + twoRoads + invention + monopoly + vcp + wheat + ore + wood + brick + wool;

		assertEquals(sum, 4);
	}

}
