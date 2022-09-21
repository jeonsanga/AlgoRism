package algoRism;

import java.util.ArrayList;

public class ex5 {
	
	public static void main(String[] args) {
		//연속부분수열
		int n = 8;
		int m = 6;
		int[] arr = {1,2,1,3,1,1,1,2};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		int last = 0;
		int sum = 0;
		int front = 0;
		while(last<n) {
			if(sum>m) {
				sum-=arr[front++];
				if(sum == m) count++;
			}else if(sum<=m) {
				sum+=arr[last]++;
				if(sum==m)count++;
			}
		}
		System.out.println(count);
	}
	

}
