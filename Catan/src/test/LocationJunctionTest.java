package test;

import java.util.ArrayList;

import junit.framework.TestCase;
import location.LocationJunction;

public class LocationJunctionTest extends TestCase {
	public void testGetX() {
		LocationJunction loc = new LocationJunction();
		ArrayList<Integer> x = loc.getCorX(450);
		assertEquals(x.get(0), Integer.valueOf(445));
		assertEquals(x.get(1), Integer.valueOf(495));
		assertEquals(x.get(2), Integer.valueOf(545));
		assertEquals(x.get(3), Integer.valueOf(545));
		assertEquals(x.get(4), Integer.valueOf(495));
		assertEquals(x.get(5), Integer.valueOf(445));
		
	}
	public void testGetY() {
		LocationJunction loc = new LocationJunction();
		ArrayList<Integer> y = loc.getCorY(25);
		assertEquals(y.get(0), Integer.valueOf(45));
		assertEquals(y.get(1), Integer.valueOf(20));
		assertEquals(y.get(2), Integer.valueOf(45));
		assertEquals(y.get(3), Integer.valueOf(95));
		assertEquals(y.get(4), Integer.valueOf(120));
		assertEquals(y.get(5), Integer.valueOf(95));
		
	}
}
