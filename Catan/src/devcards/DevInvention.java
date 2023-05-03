package devcards;

import hand.Hand;

public class DevInvention extends DevCard {

	public void increaseInvention(DevCard card, Hand hand) {
		card.increaseHand(hand, "invention");
	}

	/** The enabled version of the invent class.
	 * 
	 * @param hand The to be given extra resources based on the invention rules. 
	 */
	@Override
	public void invent(Hand hand) {
		can_invent = true;
		if (can_invent) {
			hand.setCard("resource", draw_random_resource(), 1);
			hand.setCard("resource", draw_random_resource(), 1);
			hand.setCard("development", "invention", -1);
		}
	}
}