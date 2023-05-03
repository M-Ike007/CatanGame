package player;

import hand.*;
import dice.*;

public class Player {
	public Dice dice = new Dice();
	private final Hand hand;
	private PlayerColour colour;
	private String name;

	/**
	 * Sets player information
	 * 
	 * @param hand         is a Hand object
	 * @param col_assigned is the PlayerColour enum RED or BLUE
	 * @param name         is the entered name of the player
	 */
	public Player(Hand hand, PlayerColour col_assigned, String name) {

		this.hand = hand;
		this.colour = col_assigned;
		this.name = name;
	}

	/**
	 * A getter for hand
	 * 
	 * @return Hand
	 */
	public Hand getHand() {
		return hand;
	}

	/**
	 * A getter for name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * A getter for colour
	 * 
	 * @return PlayerColour
	 */
	public PlayerColour getColour() {
		return colour;
	}

}