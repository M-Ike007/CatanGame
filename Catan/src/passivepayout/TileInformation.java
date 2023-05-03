package passivepayout;

import java.util.HashMap;
import java.util.Map.Entry;

import hand.*;
import guiboard.TilesNumbers;

public class TileInformation {
	private TilesNumbers tilesNumbers = new TilesNumbers();
	private HashMap<String, Integer> rNums;
	private HashMap<String, String> resourceTile = new HashMap<String, String>();
	private HashMap<String, String> results = new HashMap<String, String>();
	private HashMap<Integer, String> housesPlayers = new HashMap<Integer, String>();
	private Hand hand;

	public void setTileNumber() {
		tilesNumbers.setTileNumbers();
		rNums = tilesNumbers.getTileNumbers();
	}
	
	public void setHouseOnTile() {
		housesPlayers.put(1, "Pos22-Pos33-Pos34-Pos54-Pos55-Pos64");
		housesPlayers.put(2, "Pos35-Pos42-Pos43-Pos45-Pos52-Pos53");
	}
	
	public void setResourceOfTile() {
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
	
	public void setPassivePayoutInformation() {
		for (Entry<String, Integer> set : rNums.entrySet()) {
			results.put(set.getKey(), Integer.toString(rNums.get(set.getKey())) + '-' + resourceTile.get(set.getKey()));
		}
	}
	
	public void setTilesInformation(int number_dice, Hand hand, int playerNumber) {
		String player1houses = housesPlayers.get(playerNumber);
		String[] splitString = player1houses.split("-");
		for (int j=0; j < splitString.length; j++) {
			String resourceAndNumber = results.get(splitString[j]);
			String[] splitString2 = resourceAndNumber.split("-");
			if (number_dice == Integer.parseInt(splitString2[0])) {
				hand.setCard("resource",splitString2[1] , 1);
			}			
		}
		this.hand = hand;
	}
	
	public Hand getTilesInformation() {
		return hand;
	}

}
