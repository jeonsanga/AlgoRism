package algoRism;

import java.util.Scanner;
import java.util.Stack;

public class ex6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("문자입력:");
		String str = in.next();
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for(char ch : str.toCharArray()) {
        	if(ch == '(') {
        		stack.push(ch);
        	 }else if(ch == ')'){
                 stack.pop();
             }else{
                 if(stack.isEmpty()){
                     answer += ch;
                 }
             }
        }
        
        System.out.println(answer);
	}
}
