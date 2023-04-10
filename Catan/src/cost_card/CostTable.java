package cost_card;

import java.util.*;

public class CostTable {
	// Creating a Hashtable which stores structures as key and contains a hashtable as value to store resource needs.
	public static Hashtable<String, Hashtable<String, Integer>> costTable = new Hashtable<String, Hashtable<String, Integer>>();
	
	// Creating static empty hashtables for each structure
	public static void main(String[] args) {
		Hashtable<String, Integer> road_cost = new Hashtable<String, Integer>();
		Hashtable<String, Integer> village_cost = new Hashtable<String, Integer>();
		Hashtable<String, Integer> city_cost = new Hashtable<String, Integer>();
		Hashtable<String, Integer> development_card_cost = new Hashtable<String, Integer>();
		
		// Putting resource needs in each dictionary
		road_cost.put("wood", 1);
		road_cost.put("brick", 1);
		
		village_cost.put("wood", 1);
		village_cost.put("brick", 1);
		village_cost.put("sheep", 1);
		village_cost.put("wheat", 1);
		
		city_cost.put("wheat", 2);
		city_cost.put("ore", 3);
		
		development_card_cost.put("sheep", 1);
		development_card_cost.put("wheat", 1);
		development_card_cost.put("ore", 1);
		
		costTable.put("Road:", road_cost);
		costTable.put("Village:", village_cost);
		costTable.put("City:", city_cost);
		costTable.put("Development Card:", development_card_cost);
		
		GetCosts();
		
	// Method to retrieve structure costs
		
	}
	public static void GetCosts()	{
		// Loop through costTable (road_cost, village_cost, city_cost, development_card_host)
		// In this loop, loop through each structure and s.out.println resource + ": " + cost
		//
		// Expected return: 1 + n lines containing the structure name and n resources need respectively
		// Road Cost:
		// Wood: 1
		// Brick: 1
		
		costTable.forEach((structure, costs) -> {
			System.out.println(structure);
			costs.forEach((resource, amount) -> {
				System.out.println(resource + ": " + amount);
			});
		});
	}
}