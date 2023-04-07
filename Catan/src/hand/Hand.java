package hand;
import java.util.*;

/**
 * @author TEK, SB.
 * This class is a hand of cards, that can be used by other classes
 * to manage the players hand. 
 * @see Player.
 */
public class Hand {
	private Map<String, Integer> resource_cards = new HashMap<String, Integer>();
	private Map<String, Integer> development_cards = new HashMap<String, Integer>();
	
	/** Hand constructor
	 * All card classes and types are initialised at 0.
	 */
	public Hand() { 
		this.resource_cards.put("wool", 0);
		this.resource_cards.put("iron", 0);
		this.resource_cards.put("weed", 0);
		this.resource_cards.put("ore", 0);
		this.resource_cards.put("wood", 0);
		
		this.development_cards.put("Knight",0);
		this.development_cards.put("Monopoly",0);
		this.development_cards.put("VPC", 0);
	}
	
	/** Sets the cards in a hand
	 * @param card_class Class to be set, for instance development or resource.
	 * @param card Name of the card, for example, wood or Knight.
	 * @param amount Amount of cards to be added (+ int) or removed (- int).
	 */
	public void setCard(String card_class, String card, int amount) {
		switch(card_class) {
		case "resource":
			this.resource_cards.put(card, 
			this.resource_cards.get(card) + amount);
			
			break;
		case "development":
			this.development_cards.put(card, 
			this.development_cards.get(card) + amount);
			
			break;
		}
	}
	

	
	
	/** Checking how many cards of a specific type and name are present.
	 * @param card_class whether the card to be check is a development card, or
	 *  a resource card.
	 * @param card Name of the card. For instance wool, or Knight.
	 * @return int of the number of cards in the hand of the specified card.
	 */
	public int getCard(String card_class, String card) {
		switch(card_class) {
		case "resource":
			return this.resource_cards.get(card);
		case "development":
			return  this.development_cards.get(card);
		}
		throw new IllegalArgumentException("The supplied card type does not exist.");
	}
}