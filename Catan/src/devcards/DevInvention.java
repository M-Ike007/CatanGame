package devcards;
import hand.Hand;

public class DevInvention extends DevCard{
	
	public void increaseInvention(DevCard card, Hand myHand) {
		card.increaseHand(myHand, "invention");
	}
	@Override
	public void invent(Hand myHand) {
		can_invent = true;
		System.out.println("i am working");
		if (can_invent) {
			System.out.println("hi");
			myHand.setCard("resource", draw_random_resource(), 1);
			myHand.setCard("resource", draw_random_resource(), 1);
			myHand.setCard("development", "invention", -1);
		}
	}
	public static void main(String[] args) {
		Hand hello = new Hand();
		DevInvention hoi = new DevInvention();
		hoi.invent(hello);
		
		System.out.println("wool:" + hello.getCard("resource", "wool"));
		System.out.println("wood:" + hello.getCard("resource", "wood"));
		System.out.println("ore:" + hello.getCard("resource", "ore"));
		System.out.println("wheat:" + hello.getCard("resource", "wheat"));
		System.out.println("brick:" + hello.getCard("resource", "brick"));
		
	}
}