package devcards;

import hand.Hand;

public class DevInvention extends DevCard {

	public void increaseInvention(DevCard card, Hand myHand) {
		card.increaseHand(myHand, "invention");
	}

	@Override
	public void invent(Hand myHand) {
		can_invent = true;
		if (can_invent) {
			myHand.setCard("resource", draw_random_resource(), 1);
			myHand.setCard("resource", draw_random_resource(), 1);
			myHand.setCard("development", "invention", -1);
		}
	}
}