package game;

import junit.framework.TestCase;
import player.Player;

import java.util.ArrayList;
import java.util.Arrays;

import hand.Hand;
public class TemporaryMainTest extends TestCase {
	
	public void testSetGetTurn() {
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		Player player1 = new Player(hand2);
		Player player2 = new Player(hand1);
		ArrayList<Player> players = new ArrayList<>(
                Arrays.asList(player1, player2));
	
		TemporaryMain main = new TemporaryMain(players);
		main.setActiveplayer(player2);
		main.setTurn();
		Player act = main.getTurn();
		assertTrue(act == player1);
	}

}
