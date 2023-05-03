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
		System.out.println(knight + "knight");
		int twoRoads = testHand.getCard("development", "twoRoads");
		System.out.println(twoRoads + "2road");
		int invention = testHand.getCard("development", "invention");
		System.out.println(invention + "invet");
		int monopoly = testHand.getCard("development", "monopoly");
		System.out.println(monopoly + "monop");
		int vcp = testHand.getCard("development", "vcp");
		System.out.println(vcp + "vcp");

		int wheat = testHand.getCard("resource", "wheat");
		System.out.println(wheat + "wheat");
		int ore = testHand.getCard("resource", "wheat");
		System.out.println(ore + "ore");
		int wood = testHand.getCard("resource", "wheat");
		System.out.println(wood + "wood");
		int brick = testHand.getCard("resource", "wheat");
		System.out.println(brick + "brick");
		int wool = testHand.getCard("resource", "wheat");
		System.out.println(wool + "wool");

		int sum = knight + twoRoads + invention + monopoly + vcp + wheat + ore + wood + brick + wool;
		System.out.println(sum);
		assertEquals(sum, 6);
	}
}
