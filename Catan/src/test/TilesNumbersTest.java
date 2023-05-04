package test;

import junit.framework.TestCase;
import guiboard.TilesNumbers;
import java.util.HashMap;

public class TilesNumbersTest extends TestCase {
	public void testSetTileNumbers() {
		TilesNumbers tilesNumbers = new TilesNumbers();
		tilesNumbers.setTileNumbers();

		HashMap<String, Integer> expectedTileNumbers = new HashMap<String, Integer>();
		expectedTileNumbers.put("Pos22", 6);
		expectedTileNumbers.put("Pos23", 3);
		expectedTileNumbers.put("Pos24", 8);
		expectedTileNumbers.put("Pos32", 2);
		expectedTileNumbers.put("Pos33", 4);
		expectedTileNumbers.put("Pos34", 5);
		expectedTileNumbers.put("Pos35", 10);
		expectedTileNumbers.put("Pos42", 5);
		expectedTileNumbers.put("Pos43", 9);
		expectedTileNumbers.put("Pos45", 6);
		expectedTileNumbers.put("Pos46", 9);
		expectedTileNumbers.put("Pos52", 10);
		expectedTileNumbers.put("Pos53", 11);
		expectedTileNumbers.put("Pos54", 3);
		expectedTileNumbers.put("Pos55", 12);
		expectedTileNumbers.put("Pos62", 8);
		expectedTileNumbers.put("Pos63", 4);
		expectedTileNumbers.put("Pos64", 11);

		assertEquals(expectedTileNumbers, tilesNumbers.getTileNumbers());
	}
}
