package game;
import hand.Hand;

import player.*;
import dice.*;

import java.util.*;
import java.util.Map.Entry;

/**
 * The main function of the game.
 * 
 * In this class, the game is ran and the order of the players is decided. 
 * The players are initialised and given a hand. The Main also initialises a
 * single die. The phases as set out in the game package are implemented here.
 */
public class Main {
    // Initialising the class.
	public PlayerColour cols;
	public static ArrayList<Player> players = new ArrayList<Player>();
    // A map to store dice throw results.
	private Map<Player, Integer> throwmap = new LinkedHashMap<>();
    // A map to store the order of player play. 
	private Map<Player, Integer> tempmap = new LinkedHashMap<>();
	private GameStatus status;
	private Player activeplayer;
	
	
	static ArrayList<Player>  turnlist = new ArrayList<Player>();
	
	/**
     * Initialising players.
     * 
	 * This class initiates the players and allocates hands.
	 */
	public static void initHands() {
		
		players.add(new Player(new Hand(), PlayerColour.BLUE, "player1"));
		players.add(new Player(new Hand(), PlayerColour.RED, "player2"));
		players.add(new Player(new Hand(), PlayerColour.GREEN, "player3"));
		players.add(new Player(new Hand(), PlayerColour.YELLOW, "player4"));
		
	}	

	/**
     * Get the numbers of players initialised.
     * 
	 * This class gets the size of the players List to check the number of
     * players
	 */
	public static int getSize() {
		int size = players.size();
		return size;
	}
	
	/**
	 * This class obtains the hands of the players
	 * @return hand Is the hands of class Hand of all the players
	 */
	public Hand getHand(int playerNumber) {
		
		Hand hand = players.get(playerNumber).getHand();
		
		return hand;
				
	}
	/**
	 * This class sets the current status of the game.
     * 
     * This is used to change the game state, for example to go from the
     * Initialising to the main phase.
	 */
	public void setStatus(GameStatus status) {
		
		this.status= status;
	}
	
	/**
	 * This class sets the current status of the game
	 */
	public GameStatus getStatus() {
		
        return this.status;
    }
	
	
	/**
	 * Dummy throw. 
	 * A method to set dice roll result ahead of time.
	 * @param dummy A list with the length of the number of players
     * precipitating, each number is the list, is the result of the dice throw
     * given to that player.
	 * @return throwmap A map of players and corresponding dummy dice throw.
	 * The dummy throw is an int which is the index of said player.
	 */
	public void dummythrow(List <Integer> dummy) {
		
			Map<Player,Integer> throwmap = new LinkedHashMap<>();
			int length = players.size();
			
			for (Integer i =0; i < length; i++) {
				throwmap.put(players.get(i), dummy.get(i));
			}
			this.throwmap = throwmap;
	}
	
	/**
	 * This class gets the player turn order.
	 * @param throwmap The map obtained through setInitTurn. This map object
     * contains the identity of each player, and the result of each throw.
	 * 
	 * 
	 * @return throwmap An empty map to indicate that there is no player 
     * order when status == END.
	 * @return tempmap	A map of the player turns in ascending or descending
     * order of throw value.
	 */
	public Map<Player,Integer> getOrder(){
		
		List<Map.Entry<Player, Integer>> throwlist = new LinkedList<>(throwmap.entrySet());
		
		switch(this.status) {
		
		case SECONDPHASE:
			Collections.sort(throwlist,(map1, map2) -> map1.getValue().compareTo(map2.getValue()));
			
		    break;
		case END:
			throwmap.clear();
			break;
			
		default:
			Collections.sort(throwlist,(map1, map2) -> map2.getValue().compareTo(map1.getValue())
	                );
			break;
		}
		
		if (throwmap.isEmpty()){
			return throwmap;
		}
		else {
		Map<Player, Integer> tempmap = new LinkedHashMap<>();
		
		for (Map.Entry<Player, Integer> map : throwlist) {
			
	            tempmap.put(map.getKey(), map.getValue());
	        }
		this.tempmap = tempmap;
		return tempmap;
		}
		
	}
	
	/**
	 * This class sets activeplayer at the start of the game.
	 * @param initorder The map obtained through getOrder.
	 */
	public void setFirstPlayer(Map<Player,Integer> initorder) {
		
		 Player actplayer = initorder.keySet().iterator().next();
		 
		 this.activeplayer = actplayer;
		 
	}
	/**
	 * This class gets activeplayer at the start of the game.
	 * @return this.activeplayer The current active player.
	 */
	public Player getActivePlayer() {
		
		return this.activeplayer;
	}
	
	/**
	 * This class sets the next player.
	 * 
	 * Using this class the current player can be updated.
	 */
	public void setNextPlayer(){
		
		int index = new ArrayList<>(tempmap.keySet()).indexOf(this.activeplayer);
		System.out.println(index);
		
		Set<Entry<Player, Integer>> entrySet = tempmap.entrySet();
		Iterator<Entry<Player, Integer>> it = entrySet.iterator();
		System.out.println("old player"+this.activeplayer);
		for (int i = 0; i <= index; i++) {
			this.activeplayer = it.next().getKey();
			if (i == index) {
				it = it.hasNext() ? it : tempmap.entrySet().iterator();
				this.activeplayer = it.next().getKey();
				System.out.println("new player"+this.activeplayer);
			}
			else {
				continue;
			}
			
		}	
	} 
}
