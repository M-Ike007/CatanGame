package cost_card;

import junit.framework.TestCase;
import java.util.*;

public class CostTableTest extends TestCase {
	
	/** Testing the creation of the class.
	*/
	public void testCreation() {
		CostTable costTest = new CostTable();
		assertNotNull(costTest);
	}
	
	/** Testing the values of the village.
	 */
	public void testgetStructureCost() {
		Hashtable<String, Integer> expected_village = new Hashtable<String, Integer>();
		expected_village.put("wood", 1);
		expected_village.put("brick", 1);
		expected_village.put("wool", 1);
		expected_village.put("wheat", 1);
		CostTable costTest = new CostTable();
		Hashtable<String, Integer> actual_village = costTest.getStructureCost(Structures.HOUSE);
		assertEquals(expected_village.get("wood"), actual_village.get("wood"));
		System.out.println(expected_village.get("wood"));
		System.out.println(actual_village.get("brick"));
		assertEquals(expected_village.get("brick"), actual_village.get("brick"));
		assertEquals(expected_village.get("brick"), actual_village.get("brick"));
		assertEquals(expected_village.get("wool"), actual_village.get("wool"));
		assertEquals(expected_village.get("weat"), actual_village.get("weat"));
	}
}
