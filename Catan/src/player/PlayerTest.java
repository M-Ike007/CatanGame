package player;
import hand.*;
import dice.*;

import java.util.Random;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	public void testGetHand() {
		Hand hand = new Hand();
		Player player = new Player(hand, PlayerColour.BLUE);
		Hand result = player.getHand();
		assertEquals(hand,result);
	}
	
	public void testGetColour() {
		Hand hand = new Hand();
		Player player = new Player(hand, PlayerColour.RED);
		assertEquals(PlayerColour.RED,player.getColour());

	}
}
