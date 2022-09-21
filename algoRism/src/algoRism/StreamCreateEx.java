package algoRism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreateEx {
	
	public static void main(String[] args) {
		//�÷��ǿ��� ��Ʈ������
		ArrayList<Integer> list = new ArrayList<>();
		int ran = (int) Math.random();
		
		for(int i=0; i<5; i++) {
			list.add((int)(Math.random()*100));
		}
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
		
		//�迭���� ��Ʈ������
		//�׳� �Ϲݹ迭 �϶��� Arrays�� ����Ѵ� 
		String[] arr = new String[] {"��","��","��","�ϳ�"};
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.forEach(e->System.out.print(e+" "));
		
		//���� �Ű��������� ��Ʈ������
		Stream<Double> stream3 = Stream.of(4.2,2.5,3.1,1.9);
		stream3.forEach(System.out::println);
		
	}
	
	

}
