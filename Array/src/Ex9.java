
public class Ex9 {
	
	public static void main(String[] args) {
		//연속부분수열
		
		int n = 8;
		int k = 6;
		int [] arr = {1,2,1,3,1,1,1,2};
		
	
		int[] brr = new int[3];
		//합이 6이되는 경우 
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			int answer = 0;
			for(int j=i; j<arr.length; j++) {
				answer+=arr[j];
				if(answer==6) {
					result++;
					//반복문 탈출
					
					break;
				}
			}
		}
		System.out.println(result);
		//다른풀이 
		int sum = 0 ;
		int lt = 0;
		int res = 0;
		for(int rt=0; rt<n; rt++) {
			
			sum+=arr[rt];//오른쪽으로 한칸씩 가면서 sum에 누적
			
			if(sum == k) {
				res++;
			}
			
			while(sum>=k) {
				sum-=arr[lt++];
				if(sum==k) {

				}
			}
		}
		
	
	}

}
