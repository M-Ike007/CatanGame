package test;

import dice.Dice;
import junit.framework.TestCase;

public class DiceTest extends TestCase {
	private static final int NUM_TESTS = 10000000;
	private int error = 0;

	public void testDiceRoll() {
		for (int i = 0; i < NUM_TESTS; i++) {
			Dice dice = new Dice();
			dice.setSum();
			if (dice.getSum() < 2 || dice.getSum() > 12)
				error += 1;
		}

		// Expected output of error is zero.
		assertEquals(error, 0);
	}

}
