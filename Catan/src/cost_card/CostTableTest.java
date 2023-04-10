package cost_card;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CostTableTest {
	
	@Test
	// Test to check if CostTable returns output
	public void testNull(){
		CostTable totaltable = new CostTable();
		assertNotNull(totaltable);
	}
}
