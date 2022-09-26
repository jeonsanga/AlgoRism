import java.util.ArrayList;

public class Ex1 {
	
	public static void main(String[] args) {
		
		
		int number = 6;
		int [] arr = {7,3,9,5,6,12};
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i=1; i<number; i++) {
			if(arr[i]>=number) {
				list.add(arr[i]);
			}
		}
		
		for(Integer a : list) {
			System.out.print(a+" ");
		}
		
	}

}
