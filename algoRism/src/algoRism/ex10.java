package algoRism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ex10 {
	
	public static void main(String[] args)throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String required = br.readLine();
	        String subjects = br.readLine();

	        System.out.println(solution(required, subjects));

	        br.close();
	}

	private static String solution(String required, String subjects) {
		Queue<Character> queue = new LinkedList<Character>();
		
		//�ʼ����� ����ֱ�
		for(char c : required.toCharArray()) {
			queue.offer(c);
		}
		
		//ť�� ���� ������� �����Ͱ� ���� ������ ������ 
		for(char c : subjects.toCharArray()) {
			if(queue.contains(c)) {
				
				//poll : �����͸� �ϳ��� ����
				if(queue.poll()!=c) {
					return "no";
				}
			}
		}
		
		if(queue.isEmpty()) {
			return "yes";
		}else {
			  return "NO";
		}
	}

}
