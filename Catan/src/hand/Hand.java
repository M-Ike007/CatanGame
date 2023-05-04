package hand;

import java.util.*;

/**
 * This class is a hand of cards. These cards can be used by other classes to
 * manage the players hand.
 * 
 * @see Player.
 */
public class Hand {
	private Map<String, Integer> resourceCards = new HashMap<String, Integer>();
	private Map<String, Integer> developmentCards = new HashMap<String, Integer>();

	/**
	 * Hand constructor. All card classes and types are initialized at 0.
	 */
	public Hand() {
		this.resourceCards.put("wool", 0);
		this.resourceCards.put("brick", 0);
		this.resourceCards.put("wheat", 0);
		this.resourceCards.put("ore", 0);
		this.resourceCards.put("wood", 0);

		this.developmentCards.put("knight", 0);
		this.developmentCards.put("monopoly", 0);
		this.developmentCards.put("invention", 0);
		this.developmentCards.put("twoRoads", 0);
		this.developmentCards.put("vcp", 2);
	}

	/**
	 * Sets the cards in a hand.
	 * 
	 * @param card_class Class to be set, for instance development or resource.
	 * @param card       Name of the card, for example, wood or Knight.
	 * @param amount     Amount of cards to be added (+ int) or removed (- int).
	 */
	public void setCard(String card_class, String card, int amount) {
		switch (card_class) {
		case "resource":
			this.resourceCards.put(card, this.resourceCards.get(card) + amount);

			break;
		case "development":
			this.developmentCards.put(card, this.developmentCards.get(card) + amount);

			break;
		}
	}

	/**
	 * Checking how many cards of a specific type and name are present.
	 * 
	 * @param card_class Whether the card to be check is a development card, or a
	 *                   resource card.
	 * @param card       Name of the card. For instance wool, or Knight.
	 * @return int of the number of cards in the hand of the specified card.
	 */
	public int getCard(String card_class, String card) {
		switch (card_class) {
		case "resource":
			return this.resourceCards.get(card);
		case "development":
			return this.developmentCards.get(card);
		}
		throw new IllegalArgumentException("The supplied card type does not exist.");
	}
}