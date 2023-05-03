package devcards;

import hand.Hand;

public class DevTwoRoads extends DevCard {
	DevTwoRoads card = new DevTwoRoads();

	public void increaseTwoRoads(Hand myHand) {
		card.increaseHand(myHand, "twoRoads");
	}
}