package dice;

import java.util.Random;

/**
 * This class simulates two dice throws and sums the results.
 */
public class Dice {
	private int die1;
	private int die2;
	private int sum;

	/**
	 * sets the sum of the two dice throws.
	 */
	public void setSum() {
		Random random = new Random();
		die1 = random.nextInt(1, 7);
		die2 = random.nextInt(1, 7);
		this.sum = die1 + die2;
	}

	/**
	 * gets the sum of the two dice throws.
	 * 
	 * @return int: sum.
	 */
	public int getSum() {
		return sum;
	}
}
