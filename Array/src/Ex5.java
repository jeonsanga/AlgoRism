import java.util.ArrayList;

public class Ex5 {
	//뒤집은 소수
	public static void main(String[] args) {
		int n = 9;
		int [] arr = {32,55,62,20,250,370,200,30,100};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			int tmp = arr[i];
			int result = 0;
			while(tmp>0) {
				int t = tmp%10;
				result=result*10+t;
				tmp=tmp/10;
			}
			
			if(isPrime(result))list.add(result);
		}
		
		for(Integer a : list) {
			System.out.println(a);
		}
	
		
		
	}
	
	public static boolean isPrime(int number) {
		
		if(number == 1)return false;
	
		for(int i=2; i<number; i++){
			if(number%i==0) return false;
		}
		return true;
	}
	


}
