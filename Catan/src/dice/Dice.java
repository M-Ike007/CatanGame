package dice;

import java.util.Random;

public class Dice 
{
	private int die1;
	private int die2;
	private int sum;

	public void setSum()
	{
		Random random = new Random();
		die1 = random.nextInt(1,7);
		die2 = random.nextInt(1,7);
		this.sum = die1 + die2;
	}
	
	public int getSum()
	{
		return sum;
	}
}
