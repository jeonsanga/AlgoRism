package algoRism;

import java.util.ArrayList;
import java.util.Collections;

public class ex3 {
	
	
	//공통원소구하기
	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		
		int[] a = {1,3,9,5,2};
		int[] b = {3,2,5,7,8};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<5; i++) {
			for(int j=0; j<5; j++) {
				if(a[i]==b[j]) {
					list.add(b[j]);
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
