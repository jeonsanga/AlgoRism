import java.util.ArrayList;

public class Ex6 {
	
	//점수계산
	public static void main(String[] args) {
		int [] arr = {1,0,1,1,1,0,0,1,1,0};
		
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				sum++;
				list.add(sum);
			}else if(arr[i]==0) {
				sum = 0;
				list.add(sum);
			}
		}
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			result +=list.get(i);
		}
		
		System.out.println(result);
	}

	private static int list(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
