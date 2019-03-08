package practise_set_1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		MapExample obj = new MapExample();
		obj.run();
	}
	
	private void run(){
		Map<String, Integer> map = getMap();
		printMap(map);
	}
	
	private void printMap(Map<String, Integer> map){
		for(String value : map.keySet()){
			System.out.println("Key: " + value + " - Value: " + map.get(value));
		}
	}
	
	private Map<String, Integer> getMap(){
		Map<String, Integer> map = new HashMap<>();
		map.put("map data 1", 123);
		map.put("map data 2", 456);
		map.put("map data 3", 789);
		map.put("map data 4", 101);
		map.put("map data 5", 102);
		map.put("map data 1", 111);
		map.put("map data 3", 122);
		return map;
	}
}
