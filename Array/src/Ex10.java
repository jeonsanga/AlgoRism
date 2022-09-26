
public class Ex10 {
	//연속된 자연수의 합
	public static void main(String[] args) {
		
		int k = 15;
		int result = 0;
		int sum = 0;
		int lt = 0;
		int[] nums = new int[k/2+1];
		for(int i=0; i<nums.length; i++)nums[i]=i+1;
		for(int rt=0; rt<nums.length; rt++) {
			sum+=nums[rt];
			if(sum == k) {
				result++;
			}
			
			while(sum>=k) {
				sum-=nums[lt++];
				if(sum == k) {
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}

}
