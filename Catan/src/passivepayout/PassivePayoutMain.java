package passivepayout;
import hand.*;

public class PassivePayoutMain {

	public static void main(String[] args) {
		
		Hand testHand = new Hand();
		PassivePayout test = new PassivePayout();
		test.SetPayout(11,testHand);
		testHand = test.GetPayout();
		System.out.println(testHand.getCard("resource", "brick"));
		System.out.println(testHand.getCard("resource", "ore"));
	}
}
