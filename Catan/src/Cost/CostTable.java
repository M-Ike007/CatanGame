package Cost;

import java.util.HashMap;


public class CostTable {
	
	public static void main(String[] args){
		//create HashMap objects
		
				HashMap<String,Integer>roads=new HashMap<String,Integer>();
				HashMap<String,Integer>villages=new HashMap<String,Integer>();
				HashMap<String,Integer>cities=new HashMap<String,Integer>();
				HashMap<String,Integer>development=new HashMap<String,Integer>();
			
				//add keys and values (resources objects and their # of resources)
				
				roads.put("wood",1);
				roads.put("brick", 1);
				for (String i : roads.keySet()) {
					System.out.println("roads: " + i + ":\t#" + roads.get(i));
				}
				
				villages.put("wood", 1);
				villages.put("brick", 1);
				villages.put("sheep", 1);
				villages.put("wheat", 1);
				for (String i : villages.keySet()) {
					System.out.println("villages: " + i + ":\t#" + villages.get(i));
				}
				
				
				cities.put("wheat", 2);
				cities.put("ore",3);
				for (String i : cities.keySet()) {
					System.out.println("cities: " + i + ":\t#" + cities.get(i));
				}
				
				development.put("sheep", 1);
				development.put("wheat", 1);
				development.put("ore", 1);
				for (String i : development.keySet()) {
					System.out.println("development: " + i + ":\t#" + development.get(i));
				}


		}
	
	
}
