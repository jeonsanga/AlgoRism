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
		
		//필수과목 집어넣기
		for(char c : required.toCharArray()) {
			queue.offer(c);
		}
		
		//큐는 먼저 집어넣은 데이터가 먼저 나오기 때문에 
		for(char c : subjects.toCharArray()) {
			if(queue.contains(c)) {
				
				//poll : 데이터를 하나씩 꺼냄
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
