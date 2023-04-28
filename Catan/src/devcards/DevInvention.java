package devcards;
import hand.Hand;

public class DevInvention extends DevCard{
	
	public void increaseInvention(DevCard card, Hand myHand) {
		card.increaseHand(myHand, "invention");
	}
}