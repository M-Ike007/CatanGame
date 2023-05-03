package cards;

import hand.Hand;

public class DevInvention extends DevCard {

	public void transactDevelopmentCardPurchaseInvention(DevCard card, Hand hand) {
		card.transactDevelopmentCardPurchase(hand, "invention");
	}

	/** The enabled version of the invent class.
	 * 
	 * @param hand The to be given extra resources based on the invention rules. 
	 */
	@Override
	public void setInventReward(Hand hand) {
		can_invent = true;
		if (can_invent) {
			hand.setCard("resource", getResourceDraw(), 1);
			hand.setCard("resource", getResourceDraw(), 1);
			hand.setCard("development", "invention", -1);
		}
	}
}