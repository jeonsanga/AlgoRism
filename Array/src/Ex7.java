import java.util.ArrayList;

public class Ex7 {
	//������ϱ�
	public static void main(String[] args) {
		int [] arr = {87,89,92,100,76};
		
		//������ ������ �迭 ����
	
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			int max=1;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]>arr[i])max++;
			}

			list.add(max);
		}
		
		
		for(Integer a :list) {
			System.out.println(a);
		}
		
		
	}
}
