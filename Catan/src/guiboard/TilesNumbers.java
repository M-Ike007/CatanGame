package guiboard;

import java.util.HashMap;

/**
 * Create hashmap for the tile numbers.
 */
public class TilesNumbers {
	private HashMap<String, Integer> rNums = new HashMap<String, Integer>();

	/**
	 * set tile numbers.
	 */
	public void setTileNumbers() {
		rNums.put("Pos22", 6);
		rNums.put("Pos23", 3);
		rNums.put("Pos24", 8);
		rNums.put("Pos32", 2);
		rNums.put("Pos33", 4);
		rNums.put("Pos34", 5);
		rNums.put("Pos35", 10);
		rNums.put("Pos42", 5);
		rNums.put("Pos43", 9);
		rNums.put("Pos45", 6);
		rNums.put("Pos46", 9);
		rNums.put("Pos52", 10);
		rNums.put("Pos53", 11);
		rNums.put("Pos54", 3);
		rNums.put("Pos55", 12);
		rNums.put("Pos62", 8);
		rNums.put("Pos63", 4);
		rNums.put("Pos64", 11);
	}

	/**
	 * get tile numbers.
	 * 
	 * @return rNums Hashmap of tile numbers.
	 */
	public HashMap<String, Integer> getTileNumbers() {
		return rNums;
	}
}