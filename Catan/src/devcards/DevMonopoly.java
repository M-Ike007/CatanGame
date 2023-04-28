package devcards;
import hand.Hand;

public class DevMonopoly extends DevCard{
	DevMonopoly card = new DevMonopoly();
	
	public void increaseMonopoly(Hand myHand) {
		card.increaseHand(myHand, "monopoly");
	}
}