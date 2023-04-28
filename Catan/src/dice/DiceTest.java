package dice;

import junit.framework.TestCase;

public class DiceTest extends TestCase 
{  
	/**
	 * Test if the sum of the dice throws falls in the 
	 * correct range (minimum value 2 and maximum value of 12).
	 */
	public void testDiceRoll()
	{
		int numTests = 10000000;
		int error = 0;
		
		for (int i = 0; i < numTests; i++)
		{
			Dice dice = new Dice();
			dice.setSum();
			if (dice.getSum() < 2 || dice.getSum() > 12)
				error += 1;
		}
		
		// Expected output of error is zero.
		assertEquals(error, 0);
	}

}
