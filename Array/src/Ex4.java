import java.util.ArrayList;

public class Ex4 {
	//¼Ò¼ö
	public static void main(String[] args) {
		
	int n = 20;
	for(int i=0; i<n; i++) {
		if(PrimeNumber(i)==true) {
			System.out.println(i);
		}
	}
	
	}

	public static boolean PrimeNumber(int number) {
		if(number<2) {
			return false;
		}
		
		for(int i=2; i<number; i++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
}
