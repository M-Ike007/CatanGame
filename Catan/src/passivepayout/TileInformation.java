package passivepayout;

import java.util.HashMap;
import java.util.ArrayList;
import hand.*;

public class TileInformation {
	private HashMap<Integer, Integer> rNums = new HashMap<Integer, Integer>();
	private HashMap<Integer, String> resourceTile = new HashMap<Integer, String>();
	private HashMap<Integer, String> results = new HashMap<Integer, String>();
	private HashMap<Integer, String> housesPlayers = new HashMap<Integer, String>();
	private ArrayList<String> payout_result = new ArrayList<String>();
	private String resources;
	private Hand hand;
	
	
	
	public void setTileNumber() {
		rNums.put(1, 6);
		rNums.put(2, 3);
		rNums.put(3, 8);
		rNums.put(4, 2);
		rNums.put(5, 4);
		rNums.put(6, 5);
		rNums.put(7, 10);
		rNums.put(8, 5);
		rNums.put(9, 9);
		rNums.put(10, 6);
		rNums.put(11, 9);
		rNums.put(12, 10);
		rNums.put(13, 11);
		rNums.put(14, 3);
		rNums.put(15, 12);
		rNums.put(16, 8);
		rNums.put(17, 4);
		rNums.put(18, 11);
		
	}
	
	public void setHouseOnTile() {
		housesPlayers.put(1, "2-5-6-14-15-18");
		housesPlayers.put(2, "7-9-10-11-12-13");
	}
	
	public void SetResourceOfTile() {
		resourceTile.put(1, "wood");
		resourceTile.put(2, "wool");
		resourceTile.put(3, "wool");
		resourceTile.put(4, "wheat");
		resourceTile.put(5, "ore");
		resourceTile.put(6, "wheat");
		resourceTile.put(7, "wood");
		resourceTile.put(8, "wood");
		resourceTile.put(9, "brick");
		resourceTile.put(10, "ore");
		resourceTile.put(11, "wheat");
		resourceTile.put(12, "what");
		resourceTile.put(13, "ore");
		resourceTile.put(14, "wood");
		resourceTile.put(15, "wool");
		resourceTile.put(16, "brick");
		resourceTile.put(17, "wool");
		resourceTile.put(18, "brick");
	}
	
	public void SetPassivePayoutInformation() {
		for (int i=1; i <= rNums.size(); i++) {
			results.put(i, Integer.toString(rNums.get(i)) + '-' + resourceTile.get(i));
		}
	}
	
	public void SetTilesInformation(int number_dice, Hand hand) {
		for (int i=1; i <= housesPlayers.size(); i++) {
			String player1houses = housesPlayers.get(i);
			String[] splitString = player1houses.split("-");
			resources = "";
			for (int j=0; j < splitString.length; j++) {
				String resourceAndNumber = results.get(Integer.parseInt(splitString[j]));
				String[] splitString2 = resourceAndNumber.split("-");
				if (number_dice == Integer.parseInt(splitString2[0])) {
					resources += "-"+splitString2[1];
					hand.setCard("resource",splitString2[1] , 1);
				}
					
			}
			payout_result.add("Player"+i+ " gets "+resources);
		}
		System.out.println(payout_result);
		this.hand = hand;
	}
	
	public Hand getTilesInformation() {
		return hand;

	}

}
