package algoRism;

import java.util.ArrayList;

public class ex4 {
	
	public static void main(String[] args) {
		//�ִ����
		int[] arr = {12,15,11,20,25,10,20,19,13,15};
		int k = 3;
		
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		int result = 0;
		for(int i=0; i<3; i++) {
			list.add(arr[i]);
			sum +=arr[i];
		}
		
		result = sum;
		
		for(int i=k; i<arr.length;i++) {
			//�Ǿ� ������ ���� �������� ���Ѵ�
			sum+=(arr[i]-arr[i-k]);
			result = Math.max(result, sum);
		}
		System.out.println(result);
	}

}
