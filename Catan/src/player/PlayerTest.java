package player;
import hand.*;
import dice.*;

import java.util.Random;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	public void testGetHand() {
		Hand hand = new Hand();
		Player player = new Player(hand);
		Hand result = player.getHand();
		assertEquals(hand,result);
	}
	public void testInitTurn() {
		Random random = new Random();
		random.setSeed(0);
		Dice dice = new Dice();
		Hand hand = new Hand();
		Player player = new Player(hand);
		int thrw = player.throwDice();
		dice.setSum();
		int thrwdice = dice.getSum();
		assertEquals(thrw, thrwdice);
	}

}
