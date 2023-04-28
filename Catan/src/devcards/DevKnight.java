package devcards;
import hand.Hand;

public class DevKnight extends DevCard{
	DevKnight card = new DevKnight();
	
	public void increaseInvention(Hand myHand) {
		card.increaseHand(myHand, "knight");
	}
}