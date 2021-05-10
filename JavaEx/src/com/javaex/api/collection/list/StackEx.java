package com.javaex.api.collection.list;

import java.util.Stack;

//	Stack 자료형: 입력과 출력이 한쪽 방향에서만 이루어진다
//		중간에 삽입, 삭제 불가
public class StackEx {

	public static void main(String[] args) {
		//	Stack 선언
		Stack<Integer> stack = new Stack<>();
		
		//	10개 데이터를 입력
		for (int i = 1; i <= 10; i++) {
			//	스텍에 데이터 입력 : push
			stack.push(i);
			System.out.println("PUSH:" + stack);
		}
		
		//	가장 위의 데이터 확인 : peek -> 삭제하지 않음
		System.out.println("PEEK:" + stack.peek());
		System.out.println("Stack:" + stack);
		
		//	데이터의 인출 : pop -> 값을 삭제
		System.out.println("POP:" + stack.pop());
		System.out.println("Stack:" + stack);
		
		//	주의: 비어있는 stack에서 pop -> EmptyStackException
		while(!stack.empty()) {	//	스택이 비어있지 않으면 실행
			System.out.println("POP:" + stack.pop());
			System.out.println("Stack:" + stack);
		}
		
	}

}
