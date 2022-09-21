package algoRism.towpointer.slidngwindow;

public class ex2 {

	//연속된 자연수의합
	
	public static void main(String[] args) {
		
		int k = 15;
		int count = 0;
		int lt = 0;
		int sum = 0;
		int rt = 0;
		while(lt<=k/2+1) {
			if(sum>k) {
				sum-=lt++;
				 if(sum == k) count++;
			}else {
				sum+=rt++;
				 if(sum == k) count++;
			}
		}
		
		System.out.println(count);
	}
}
