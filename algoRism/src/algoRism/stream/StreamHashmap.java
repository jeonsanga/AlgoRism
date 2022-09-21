package algoRism.stream;

import java.util.HashMap;
import java.util.Map;

public class StreamHashmap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 5);
		map.put("Z", 2);
		map.put("C", 11);
		map.put("G", 4);
		map.put("E", 9);
		//Map.entrySet()  키-값쌍 스트림 얻기
		map.entrySet().stream()
		  .sorted(Map.Entry.comparingByKey())
		  .forEach(entry -> System.out.printf("Key : %s, value : %d%n", entry.getKey(), entry.getValue()));



		
	}

}
