package devcards;

import junit.framework.TestCase;

public class TheTestDev extends TestCase{
	
	public void testMonopoly() {
		DevCard devTest = new DevCard();
		String desired = "monopoly";
		String result = devTest.drawDevCard();
		assertEquals(result, desired);				
	}
}