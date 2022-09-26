import java.util.ArrayList;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int number = 8;
		int [] arr = {130,135,148,140,145,150,150,153};
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		int result = 0;
		int count = 0;
		for(int i=1; i<arr.length; i++) {
			if(result<arr[i]) {
				result = arr[i];
				list.add(result);
				count++;
			}
		}
		
		for(Integer a : list) {
			System.out.print(a+" ");
		}
		
		System.out.println("count"+list.size());
		
		
	}

}
