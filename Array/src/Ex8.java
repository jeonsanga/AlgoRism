import java.util.ArrayList;
import java.util.Arrays;

public class Ex8 {
	
	public static void main(String[] args) {
		int[] arr = {12,15,11,20,25,10,20,19,13,15};
		
		int n = 3;
		
		int[] brr = new int[3];
		int sum = 0;
		int answer = 0;
		for(int i=0; i<brr.length; i++) {
			brr[i]=arr[i];
			sum+=arr[i];
		}
		answer = sum;
		
		
		for(int i=n; i<arr.length; i++) {
			sum+=(arr[i]-arr[i-n]);
			answer=	Math.max(answer, sum);
		}
		
		System.out.println(answer);
		
	}

}
