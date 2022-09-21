package algoRism.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class classPresiden {
	
	//학급회장
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력:");
		String str = scanner.next();
		
		HashMap<Character,Integer> map = new HashMap<>();
		

		for(char x:str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		 Collection<Character> keys = map.keySet();       
		 System.out.println(keys);  // [Apple, Banana, Orange]
		 
		 
		 Collection<Integer> values = map.values();      
		 System.out.println(values);  // [Apple, Banana, Orange]
	}
	
}
