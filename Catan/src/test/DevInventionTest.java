package test;

import junit.framework.TestCase;
import cards.DevCard;
import cards.DevInvention;
import hand.Hand;

public class DevInventionTest extends TestCase {
	public void testIncreaseTest() {
		Hand testHand = new Hand();
		DevInvention hi = new DevInvention();
		testHand.setCard("resource", "wheat", 1);
		testHand.setCard("resource", "ore", 1);
		testHand.setCard("resource", "wool", 1);
		
		
		DevCard testDevCard2 = new DevCard();
		testDevCard2.increaseHand(testHand, "invention");
		
		hi.invent(testHand);
		
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
		int ore = testHand.getCard("resource", "ore");
		System.out.println(ore + "ore");
		int wood = testHand.getCard("resource", "wood");
		System.out.println(wood + "wood");
		int brick = testHand.getCard("resource", "brick");
		System.out.println(brick + "brick");
		int wool = testHand.getCard("resource", "wool");
		System.out.println(wool + "wool");
		
		int sum = knight + twoRoads + invention + monopoly + vcp + wheat + ore + wood + brick + wool;
		System.out.println(sum);
		
		assertEquals(sum, 4);
	}
	
	

}
