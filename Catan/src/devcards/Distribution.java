package devcards;

import java.util.HashMap;
import java.util.Random;

/**
 * Use a distribution of cards.
 * 
 *
 */
public class Distribution {
	private Random generator = new Random();
	private int result;
	private HashMap<Integer, String> distribution = new HashMap<Integer, String>();

	/**
	 * Make a distribution of cards.
	 * 
	 */
	public Distribution() {
		distribution.put(1, "knight");
		distribution.put(2, "knight");
		distribution.put(3, "knight");
		distribution.put(4, "knight");
		distribution.put(5, "knight");
		distribution.put(6, "knight");
		distribution.put(7, "knight");
		distribution.put(8, "knight");
		distribution.put(9, "knight");
		distribution.put(10, "knight");
		distribution.put(11, "knight");
		distribution.put(12, "knight");
		distribution.put(13, "knight");
		distribution.put(14, "knight");
		distribution.put(15, "vcp");
		distribution.put(16, "vcp");
		distribution.put(17, "vcp");
		distribution.put(18, "vcp");
		distribution.put(19, "vcp");
		distribution.put(20, "twoRoads");
		distribution.put(21, "twoRoads");
		distribution.put(22, "invention");
		distribution.put(23, "invention");
		distribution.put(24, "monopoly");
		distribution.put(25, "monopoly");
	}

	/**
	 * Prepare the distribution of a deck.
	 * 
	 * This must be used before drawing a card.
	 */
	public void setResult() {
		this.result = generator.nextInt(1, 26);
	}

	/**
	 * Drawing a card from a card distribution.
	 * 
	 * @return String of the card that is drawn.
	 */
	public String getCard() {
		String drawnCard = distribution.get(result);
		return drawnCard;
	}
}
