package passivepayout;

import java.util.HashMap;

/** A class to store resource tile information
 * 
 *
 */
public class ResourceTileLocations {
	private HashMap<String, String> resourceTile = new HashMap<String, String>();
	
	/** Creating the resource cards.
	 * 
	 */
	public ResourceTileLocations() {
		resourceTile.put("Pos22", "wood");
		resourceTile.put("Pos23", "wool");
		resourceTile.put("Pos24", "wool");
		resourceTile.put("Pos32", "wheat");
		resourceTile.put("Pos33", "ore");
		resourceTile.put("Pos34", "wheat");
		resourceTile.put("Pos35", "wood");
		resourceTile.put("Pos42", "wood");
		resourceTile.put("Pos43", "brick");
		resourceTile.put("Pos45", "ore");
		resourceTile.put("Pos46", "wheat");
		resourceTile.put("Pos52", "wheat");
		resourceTile.put("Pos53", "ore");
		resourceTile.put("Pos54", "wood");
		resourceTile.put("Pos55", "wool");
		resourceTile.put("Pos62", "brick");
		resourceTile.put("Pos63", "wool");
		resourceTile.put("Pos64", "brick");
	}
	
	/** Get the resource type for a tile position.
	 * @param query
	 * @return A string of a resource type.
	 */
	public String getResourceLocation(String query) {
		return resourceTile.get(query);
	}
}
