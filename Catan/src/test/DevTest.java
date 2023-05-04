package test;

import junit.framework.TestCase;
import cards.DevCard;
import hand.Hand;

public class DevTest extends TestCase {

	public void testTransactDevelopmentCardPurchase() {
		Hand testHand = new Hand();
		testHand.setCard("development", "knight", 3);
		testHand.setCard("resource", "wheat", 1);
		testHand.setCard("resource", "ore", 1);
		testHand.setCard("resource", "wool", 1);

		DevCard testDevCard2 = new DevCard();
		String result = testDevCard2.getDevCard();
		testDevCard2.transactDevelopmentCardPurchase(testHand, result);

		int knight = testHand.getCard("development", "knight");
		int twoRoads = testHand.getCard("development", "twoRoads");
		int invention = testHand.getCard("development", "invention");
		int monopoly = testHand.getCard("development", "monopoly");
		int vcp = testHand.getCard("development", "vcp");
		int wheat = testHand.getCard("resource", "wheat");
		int ore = testHand.getCard("resource", "wheat");
		int wood = testHand.getCard("resource", "wheat");
		int brick = testHand.getCard("resource", "wheat");
		int wool = testHand.getCard("resource", "wheat");

		int sum = knight + twoRoads + invention + monopoly + vcp + wheat + ore + wood + brick + wool;

		assertEquals(sum, 6);
	}
}
