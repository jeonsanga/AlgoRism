package algoRism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreateEx {
	
	public static void main(String[] args) {
		//컬렉션에서 스트림생성
		ArrayList<Integer> list = new ArrayList<>();
		int ran = (int) Math.random();
		
		for(int i=0; i<5; i++) {
			list.add((int)(Math.random()*100));
		}
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
		
		//배열에서 스트림생성
		//그냥 일반배열 일때는 Arrays를 사용한다 
		String[] arr = new String[] {"넷","둘","셋","하나"};
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.forEach(e->System.out.print(e+" "));
		
		//가변 매개변수에서 스트림생성
		Stream<Double> stream3 = Stream.of(4.2,2.5,3.1,1.9);
		stream3.forEach(System.out::println);
		
	}
	
	

}
