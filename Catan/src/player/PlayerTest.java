package player;
import hand.*;
import dice.*;

import java.util.Random;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	public void testGetHand() {
		Hand hand = new Hand();
		Player player = new Player(hand, PlayerColour.BLUE, "Erik van Erkenburg");
		Hand result = player.getHand();
		assertEquals(hand,result);
	}
	
	public void testGetName() {
		Hand hand = new Hand();
		String name = "Piet van PieterBurg";
		Player player = new Player(hand, PlayerColour.YELLOW, name);
		String result = player.getName();
		assertEquals(name, result);
	}
	
	public void testGetColour() {
		Hand hand = new Hand();
		Player player = new Player(hand, PlayerColour.RED, "Erik van Erkenburg");
		assertEquals(PlayerColour.RED,player.getColour());

	}
}
