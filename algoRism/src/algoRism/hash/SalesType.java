package algoRism.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SalesType {
	
	//매출의 종류
	
	public static void main(String[] args) {
		SalesType main = new SalesType();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		for (int x : main.solution(n, k, array)) {
			System.out.print(x + " ");
		}
	}

	private ArrayList<Integer> solution(int n, int k, int[] array) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int lt = 0;
		for(int i=0; i<k-1;i++) {
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
		}
		
		for(int j=k-1; j<n; j++) {
			map.put(array[j], map.getOrDefault(array[j], 0)+1);
			answer.add(map.size());
			//lt랑똑같은것이잇으면 빼준다
			map.put(array[lt], map.get(array[lt])-1);
			if(map.get(array[lt])==0)map.remove(array[lt]); 
			lt++;
		}
		return null;
	}
		
	
		
		
		
	}


