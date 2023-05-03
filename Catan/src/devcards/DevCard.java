package devcards;

import java.util.HashMap;
import java.util.Random;
import hand.Hand;

public class DevCard {
	private int result = 0;
	protected boolean can_invent = false;
	private int resource_result = 0;
<<<<<<< HEAD
	private Distribution dist = new Distribution();
=======

>>>>>>> 7bf62ac1dfbf1c36833feea20b77c0be3cd17dbd
	/**
	 * HashMap emulates the distribution of cards in the game. right now there is
	 * infinite card so it is possible to draw more cards than are normally
	 * available (like 3 monopoly cards).
	 * 
	 * @Return random Development Card from the HashMap
	 */
<<<<<<< HEAD
	public String drawDevCard() {	
		this.dist.setResult();
		return this.dist.getCard();
=======
	public String drawDevCard() {
		Random generator = new Random();
		HashMap<Integer, String> distribution = new HashMap<Integer, String>();
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
		result = generator.nextInt(1, 26);
		String drawnCard = distribution.get(result);
		return drawnCard;
>>>>>>> 7bf62ac1dfbf1c36833feea20b77c0be3cd17dbd
	}

	/**
	 * increases development card in hand
	 * 
	 * @param myHand is the hand of the player.
	 * @param card   is the type development card.
	 */
	public void increaseHand(Hand myHand, String card) {
		myHand.setCard("development", card, 1);
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
		resource_result = res_gen.nextInt(1, 6);
		String drawn_resource = resource.get(resource_result);
		return drawn_resource;
	}
}
