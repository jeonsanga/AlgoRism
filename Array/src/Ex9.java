
public class Ex9 {
	
	public static void main(String[] args) {
		//���Ӻκм���
		
		int n = 8;
		int k = 6;
		int [] arr = {1,2,1,3,1,1,1,2};
		
	
		int[] brr = new int[3];
		//���� 6�̵Ǵ� ��� 
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			int answer = 0;
			for(int j=i; j<arr.length; j++) {
				answer+=arr[j];
				if(answer==6) {
					result++;
					//�ݺ��� Ż��
					
					break;
				}
			}
		}
		System.out.println(result);
		//�ٸ�Ǯ�� 
		int sum = 0 ;
		int lt = 0;
		int res = 0;
		for(int rt=0; rt<n; rt++) {
			
			sum+=arr[rt];//���������� ��ĭ�� ���鼭 sum�� ����
			
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
