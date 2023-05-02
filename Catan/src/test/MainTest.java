package test;
import player.*;
import hand.*;
import player.*;

import java.util.*;

import game.GameStatus;
import game.Main;
import junit.framework.TestCase;

public class MainTest extends TestCase {
	public Hashtable<String, PlayerColour> player_info  = new Hashtable<String, PlayerColour>();
	public MainTest() {
		player_info.put("1", PlayerColour.BLUE);
		player_info.put("2", PlayerColour.GREEN);
		player_info.put("3", PlayerColour.YELLOW);
		player_info.put("4", PlayerColour.RED);
	}


	/**
	 * This tests initHands().
	 */
	public void testInitHands() {
		Main main = new Main(player_info, true);
		int testsize = main.getSize();
		System.out.println("number of players in test is " + testsize);
		assertEquals(4, testsize);
	}
	
	/**
	 * This class to test getHand().
	 * @return this.activeplayer The current active player.
	 */	
	public void testgetHand() {
		Main main = new Main(player_info, true);
		Hand testhand = main.getHand(1);
		assertEquals(testhand, main.getHand(1));
	}
	/**
	 * This class to setStatus() and getStatus().
	 */	
	public void testSetGetStatus() {
		Main main = new Main(player_info, true);
		main.setStatus(GameStatus.FIRSTPHASE);
		assertEquals(main.getStatus(), GameStatus.FIRSTPHASE);
	}
	
	
	/**
	 * This class to test getOrder() for the default case.
	 */	
	public void testOrderDefault() {
		Main main = new Main(player_info, true);
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
		Main main = new Main(player_info, true);
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
		Main main = new Main(player_info, true);
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
		Main main = new Main(player_info, true);
		main.setStatus(GameStatus.FIRSTPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> dsc = main.getOrder();
		main.setFirstPlayer(dsc);
		Player firstplayer = main.getActivePlayer();
		assertEquals(firstplayer,main.players.get(2));
	}
	
	/**
	 * This class to test setNextPlayer() for the default status.
	 */
	public void testNextDsc() {
		Main main = new Main(player_info, true);
		main.setStatus(GameStatus.FIRSTPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> dsc = main.getOrder();
		main.setFirstPlayer(dsc);
		main.setNextPlayer();
		Player nextplayer = main.getActivePlayer();
		assertEquals(nextplayer,main.players.get(0));
		main.setNextPlayer();
		Player nextplayer2 = main.getActivePlayer();
		assertEquals(nextplayer2,main.players.get(1));
	}
	
	/**
	 * This class to test setNextPlayer() in ascending turn order status.
	 */
	public void testNextPlayerAsc() {
		Main main = new Main(player_info, true);
		main.setStatus(GameStatus.SECONDPHASE);
		List<Integer> dummy1 = Arrays.asList(3,2,4,1);
		main.dummythrow(dummy1);
		Map<Player, Integer> asc = main.getOrder();
		main.setFirstPlayer(asc);
		main.setNextPlayer();
		Player nextplayer = main.getActivePlayer();
		assertEquals(nextplayer,main.players.get(1));
		main.setNextPlayer();
		main.setNextPlayer();
		main.setNextPlayer();
		Player nextplayer5 = main.getActivePlayer();
		assertEquals(nextplayer5,main.players.get(3));
	}
}