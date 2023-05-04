package test;
import passivepayout.ResourceTileLocations;
import junit.framework.TestCase;

public class ResourceTileLocationsTest extends TestCase {
	public void testResourceLocation() {
		ResourceTileLocations locs = new ResourceTileLocations();
		String result = locs.getResourceLocation("Pos32");
		assertEquals(result, "wheat");
	}
}
