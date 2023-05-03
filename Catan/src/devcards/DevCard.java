package devcards;

import java.util.HashMap;
import java.util.Random;
import hand.Hand;

public class DevCard {
	private int result = 0;	
	protected boolean can_invent = false;
	private int resource_result = 0;
	private Distribution dist = new Distribution();
	/**
	 * HashMap emulates the distribution of cards in the game.
	 * right now there is infinite card so it is possible to draw more cards than are normally available (like 3 monopoly cards).
	 * @Return random Development Card from the HashMap
	 */
	public String drawDevCard() {	
		this.dist.setResult();
		return this.dist.getCard();
	}
	/**
	 * increases development card in hand
	 * @param myHand is the hand of the player.
	 * @param card is the type development card.
	 */
	public void increaseHand(Hand myHand, String card) {		
		myHand.setCard("development",card, 1);
		myHand.setCard("resource", "wool", -1);
		myHand.setCard("resource", "wheat", -1);
		myHand.setCard("resource", "ore", -1);
		
	}
	public void invent(Hand myHand) {
		if (can_invent) {
			System.out.println("hi");
			myHand.setCard("resource", draw_random_resource(), 1);
			myHand.setCard("resource", draw_random_resource(), 1);
			myHand.setCard("development", "invention", -1);
		}
	}
	public String draw_random_resource() {
		HashMap<Integer, String> resource = new HashMap<Integer, String>();
		
		resource.put(1, "wool");
		resource.put(2, "ore");
		resource.put(3, "wood");
		resource.put(4, "brick");
		resource.put(5, "wheat");
		Random res_gen = new Random();
		resource_result = res_gen.nextInt(1,6);
		String drawn_resource = resource.get(resource_result);	
	return drawn_resource;
	}
}



