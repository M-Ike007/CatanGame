package cards;

import java.util.HashMap;
import java.util.Random;
import hand.Hand;

public class DevCard {
	protected boolean can_invent = false;
	private int resource_result = 0;
	private DistributionDevelopmentCards dist = new DistributionDevelopmentCards();

	/**
	 * HashMap emulates the distribution of cards in the game. right now there is
	 * infinite card so it is possible to draw more cards than are normally
	 * available (like 3 monopoly cards).
	 * 
	 * @Return random Development Card from the HashMap
	 */
	public String drawDevCard() {
		this.dist.setResult();
		return this.dist.getCard();
	}

	/**
	 * increases development card in hand
	 * 
	 * @param hand is the hand of the player.
	 * @param card   is the type development card.
	 */
	public void increaseHand(Hand hand, String card) {
		hand.setCard("development", card, 1);
		hand.setCard("resource", "wool", -1);
		hand.setCard("resource", "wheat", -1);
		hand.setCard("resource", "ore", -1);

	}

	/** Giving a hand a new resource based on the invent rule.
	 * 
	 * @param hand The hand that is given a new resource. 
	 */
	public void invent(Hand hand) {
		if (can_invent) {
			System.out.println("hi");
			hand.setCard("resource", draw_random_resource(), 1);
			hand.setCard("resource", draw_random_resource(), 1);
			hand.setCard("development", "invention", -1);
		}
	}

	/** Drawing a random resource.
	 * 
	 * @return String A random resource.
	 */
	public String draw_random_resource() {
		HashMap<Integer, String> resource = new HashMap<Integer, String>();

		resource.put(1, "wool");
		resource.put(2, "ore");
		resource.put(3, "wood");
		resource.put(4, "brick");
		resource.put(5, "wheat");
		Random res_gen = new Random();
		resource_result = res_gen.nextInt(1, 6);
		String drawn_resource = resource.get(resource_result);
		return drawn_resource;
	}
}
