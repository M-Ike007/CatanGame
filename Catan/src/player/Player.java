package player;

import hand.*;

public class Player {
	private Hand hand;
	private PlayerColour colour;
	private String name;

	/**
	 * Constructs player
	 * 
	 * @param hand         is a Hand object
	 * @param colAssigned is the PlayerColour enum RED or BLUE
	 * @param name         is the entered name of the player
	 */
	public Player(Hand hand, PlayerColour colAssigned, String name) {

		this.hand = hand;
		this.colour = colAssigned;
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