package devcards;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

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
}