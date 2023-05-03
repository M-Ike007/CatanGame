package devcards;

import hand.Hand;

public class DevVicPoint extends DevCard {
	DevVicPoint card = new DevVicPoint();

	public void increaseInvention(Hand myHand) {
		card.increaseHand(myHand, "vcp");
	}
}