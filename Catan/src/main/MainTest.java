package main;

import game.*;
import hand.*;
import player.*;

import java.util.*;
import junit.framework.TestCase;

public class MainTest extends TestCase {
	/**
	 * This tests initHands().
	 */
	public void testInitHands() {
		int testsize = Main.getSize();
		assertEquals(4, testsize);
	
	/**
	 * This class to test getHand().
	 * @return this.activeplayer The current active player.
	 */	
	}
	public void testgetHand() {
		Main main = new Main();
		Main.initHands();
		Hand testhand = main.getHand(1);
		assertEquals(testhand, main.getHand(1));
	}
	/**
	 * This class to setStatus() and getStatus().
	 */	
	public void testSetGetStatus() {
		Main main = new Main();
		main.setStatus(GameStatus.FIRSTPHASE);
		assertEquals(main.getStatus(), GameStatus.FIRSTPHASE);
	}
	
	
	/**
	 * This class to test getOrder() for the default case.
	 */	
	public void testOrderDefault() {
		Main main = new Main();
		main.setStatus(GameStatus.FIRSTPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		List<Integer> dummy2 = Arrays.asList(4,3,2,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> dsc = main.getOrder();
		Collection<Integer> colval = dsc.values();
		List<Integer> listval = new ArrayList<Integer>(colval);
		assertEquals(listval,dummy2);
				
	}
	

	
	/**
	 * This class to test getOrder() for PHASETWO, so ascending order.
	 */	
	public void testOrderAsc() {
		Main main = new Main();
		main.setStatus(GameStatus.SECONDPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		List<Integer> dummy2 = Arrays.asList(1,2,3,4);
		main.dummythrow(dummy1);
		Map<Player, Integer> asc = main.getOrder();
		Collection<Integer> colval = asc.values();
		List<Integer> listval = new ArrayList<Integer>(colval);
		assertEquals(listval,dummy2);
				
	}
	
	/**
	 * This class to test getOrder() for END to confirm empty map.
	 */
	public void testOrderEnd() {
		Main main = new Main();
		main.setStatus(GameStatus.END);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> end = main.getOrder();
		assertTrue(end.isEmpty());
	
	}
	
	/**
	 * This class to test setFirstPlayer() and getPlayer().
	 */
	public void testFirstPlayergetPlayer() {
		Main main = new Main();
		main.setStatus(GameStatus.FIRSTPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> dsc = main.getOrder();
		main.setFirstPlayer(dsc);
		Player firstplayer = main.getActivePlayer();
		assertEquals(firstplayer,Main.players.get(2));
	}
	
	/**
	 * This class to test setNextPlayer() for the default status.
	 */
	public void testNextDsc() {
		Main main = new Main();
		main.setStatus(GameStatus.FIRSTPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> dsc = main.getOrder();
		main.setFirstPlayer(dsc);
		main.setNextPlayer();
		Player nextplayer = main.getActivePlayer();
		assertEquals(nextplayer,Main.players.get(0));
		main.setNextPlayer();
		Player nextplayer2 = main.getActivePlayer();
		assertEquals(nextplayer2,Main.players.get(1));
	}
	
	/**
	 * This class to test setNextPlayer() in ascending turn order status.
	 */
	public void testNextPlayerAsc() {
		Main main = new Main();
		main.setStatus(GameStatus.SECONDPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> asc = main.getOrder();
		main.setFirstPlayer(asc);
		main.setNextPlayer();
		Player nextplayer = main.getActivePlayer();
		assertEquals(nextplayer,Main.players.get(1));
		main.setNextPlayer();
		main.setNextPlayer();
		main.setNextPlayer();
		Player nextplayer5 = main.getActivePlayer();
		assertEquals(nextplayer5,Main.players.get(3));
	}
}