package player;
import hand.*;
import dice.*;

public class Player{
	public Dice dice = new Dice();
	private final Hand hand;
	
	public Player(Hand hand){
		
		this.hand = hand;
	}
	public Hand getHand() {
		return hand;
	}
	
	public int throwDice() {
		dice.setSum();
		int throwdice = dice.getSum();
		return throwdice;
	}
	
}


