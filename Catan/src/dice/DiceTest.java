package dice;

import junit.framework.TestCase;

public class DiceTest extends TestCase 
{  
	public void testCreation()
	{
		int numTests = 10000000;
		int error = 0;
		
		// A for loop to check for a number of dice rolls (numTests) if the sum falls in
		// the correct range (minimum value 2 and maximum value of 12)
		for (int i = 0; i < numTests; i++)
		{
			Dice dice = new Dice();
			dice.setSum();
			if (dice.getSum() < 2 || dice.getSum() > 12)
				error += 1;
		}
		
		assertEquals(error, 0);
	}

}
