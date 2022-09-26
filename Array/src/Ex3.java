import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {
	//피보나치수열
	public static void main(String[] args) {
	
		int n = 10;
		
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		ArrayList<Integer> list = new ArrayList<>();
		//list index에 추가
		list.add(0,1);
		list.add(1,1);
		for(int i=2; i<n; i++) {
			arr[i]=arr[i-1]+arr[i-2];
			list.add(arr[i]);
		}
		
		for(Integer a : list) {
			System.out.print(a+" ");
		}
		
		
	}

}
