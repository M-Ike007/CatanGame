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
		Hashtable<String, Integer> actual = costTest.getStructureCost(Structures.VILLAGE);
		assertEquals(actual.get("wood"), actual.get("wood"));
		assertEquals(actual.get("brick"), actual.get("brick"));
		assertEquals(actual.get("wool"), actual.get("wool"));
		assertEquals(actual.get("weat"), actual.get("weat"));
	}
}
