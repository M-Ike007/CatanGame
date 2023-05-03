package test;

import java.util.ArrayList;
import java.util.List;
import devcards.*;
import devcards.DevCard;
import junit.framework.TestCase;

public class DistributionTest extends TestCase {
	
	/**Test whether the cards of the distribution are of the expected name
	 * 
	 */
	public void testgetCard() {
		Distribution dist = new Distribution();
		dist.setResult();
		dist.getCard();
		String result = dist.getCard();
		List<String> options = new ArrayList<String>();
		options.add("knight");
		options.add("vcp");
		options.add("monopoly");
		options.add("twoRoads");
		options.add("invention");
		if(options.contains(result))		
			assertEquals(1, 1);		
		else
			assertEquals(1,2);
	}
}
