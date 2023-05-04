package test;

import hand.*;
import junit.framework.TestCase;
import player.Player;
import player.PlayerColour;

public class PlayerTest extends TestCase {
	public void testGetHand() {
		Hand hand = new Hand();
		Player player = new Player(hand, PlayerColour.BLUE, "Erik van Erkenburg", 1);
		Hand result = player.getHand();
		assertEquals(hand, result);
	}

	public void testGetName() {
		Hand hand = new Hand();
		String name = "Piet van PieterBurg";
		Player player = new Player(hand, PlayerColour.BLUE, name, 1);
		String result = player.getName();
		assertEquals(name, result);
	}

	public void testGetColour() {
		Hand hand = new Hand();
		Player player = new Player(hand, PlayerColour.RED, "Erik van Erkenburg", 1);
		assertEquals(PlayerColour.RED, player.getColour());

	}
}
