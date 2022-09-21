package algoRism.towpointer.slidngwindow;

public class ex1 {
	
	
	//연속된부분수열
	public static void main(String[] args) {
		
		int[] arr = {1,2,1,3,1,1,1,2};
		int k = 6;
		
		int count = 0;
		int lt = 0;
		int sum = 0;
		for(int rt = 0; rt<arr.length; rt++) {
			sum +=arr[rt];
			if(sum == k) count++;
			while(sum>=k) {
				sum-=arr[lt++];
				if(sum == k)count++;
			}
		}
		
	}

}
