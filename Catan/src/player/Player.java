package player;
import hand.*;
import dice.*;

public class Player{
	public Dice dice = new Dice();
	public final Hand hand;
	private PlayerColour colour;
	public Player(Hand hand, PlayerColour col_assigned){
		
		this.hand = hand;
		this.colour = col_assigned;
	}
	/**A getter for hand
	 * @return Hand
	 */
	public Hand getHand() {
		return hand;
	}
	
	/** A getter for colour
	 * @return PlayerColour
	 */
	public PlayerColour getColour() {
		return colour;
	}
	
	public int throwDice() {
		dice.setSum();
		int throwdice = dice.getSum();
		return throwdice;
	}
	
}


