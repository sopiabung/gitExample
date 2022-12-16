package ch14;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		//Stack구조 : LIFO
		String[] nation= {"한국","일본","중국","미국","영국"};
		Stack<String> s=new Stack<>();
		for(String str : nation) {
			s.push(str);//스택에 입력
		}
		System.out.println(s.pop());//stack에서 pop()으로 출력
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());//데이터가 더이상 없을때는 에러
		
		while(!s.isEmpty()) {//스택이 비어있지 않으면
			System.out.println(s.pop());
		}
		
	}

}
