package devcards;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;
import hand.Hand;
import devcards.*;

public class TheTestDev extends TestCase{
	
	public void testDrawCard() {
		DevCard testDevCard = new DevCard();
		List options = new ArrayList();
		options.add("knight");
		options.add("vcp");
		options.add("monopoly");
		options.add("twoRoads");
		options.add("invention");
		String result = testDevCard.drawDevCard();
		if(options.contains(result))		
			assertEquals(1, 1);		
		else
			assertEquals(1,2);
	}
	
	public void testIncreaseHand() {
		Hand testHand = new Hand();
		testHand.setCard("development",  "knight",  3);
		DevCard testDevCard2 = new DevCard();
		String result = testDevCard2.drawDevCard();
		testDevCard2.increaseHand(testHand, result);
		
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
		int sum = knight + twoRoads + invention + monopoly + vcp;
		System.out.println(sum);
		assertEquals(sum, 4);
		
		
		
	}
	
}