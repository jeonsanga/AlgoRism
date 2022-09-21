package algoRism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] a = {1,3,5};
		int[] b = {2,3,6,7,9};
		int n = 3;
		int m = 5;
		
		int p1 = 0;
		int p2 = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			list.add(a[i]);
		}
		
		for(int i=0; i<m; i++) {
			list.add(b[i]);
		}
		ArrayList<Integer> newList = (ArrayList<Integer>) list.stream().distinct().sorted().collect(Collectors.toList());
		Stream<Integer> stream = list.stream();
		stream.distinct().sorted().forEach(num->System.out.println(num));
		
		Collections.sort(list);
		
		System.out.println(newList);
		
	}



}
