package game;
import java.util.ArrayList;
import player.Player;



/**
 * The TemporaryMain is a temporary class that sets and gets the next activeplayer.
 * This class is called by the board and the MainGameLoop.
 */

public class TemporaryMain {
	public ArrayList<Player> players;
	public Player activeplayer;
	
/**
 * @param players ArrayList of players of the Player objects.
 *
 */
	public TemporaryMain(ArrayList<Player> players){ 
		this.players = players;
		
	}
	/**
	 * @param activeplayer current active player of the Player object.
	 * 
	 * This method sets the first activeplayer of the game.
	 * It is used only once.
	 *
	 */
	public void setActiveplayer(Player activeplayer) {
		this.activeplayer = activeplayer;
	}
	
	/**
	 * This method sets the next active player of the game.
	 * This method is used in Board btnEndTurn to acccess the current player
	 */
	public void setTurn() {
	
		if (activeplayer == players.get(0)) {
			this.activeplayer = players.get(1);
		}
		if (activeplayer == players.get(1)) {
			this.activeplayer = players.get(0);
		}
	}
	/**
	 * @return this.activeplayer return the current activeplayer.
	 *
	 *This method returns the activeplayer set in setTurn.
	 */
	public Player getTurn() {
		return this.activeplayer;
		
	}

}