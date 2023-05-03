package game;

/**
 * Enum to track game status.
 * 
 * There are the following fields this enum keeps track of: FIRSTPHASE: The
 * players are granted their turn clockwise, and they must play one village.
 * SECONDPHASE: Players are granted their turn counterclockwise. They must place
 * a second village and a street. This means that the last player in the
 * FIRSTPHASE, is the first player in the SECONDPHASE. The players should obtain
 * their first resources. THIRDPHASE: Players are granted their turn counter
 * clockwise, until the end of the game is reached, this is the END state.
 * 
 * @author TEK, SB
 */
public enum GameStatus {
	FIRSTPHASE, SECONDPHASE, THIRDPHASE, END,
}
