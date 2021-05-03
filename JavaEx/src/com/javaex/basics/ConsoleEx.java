package com.javaex.basics;

import java.util.Scanner;	//	java.util 패키지의 Scanner 클래스를 로드해라
//	필요한 클래스 들어있는 패키지를 정확하게 지칭해야 한다

public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutputEx();
		consoleInputEx();
	}
	
	private static void consoleInputEx() {
		//	팁1. Ctrl + Shift + O
		//	팁2. 자동 완성 기능 활용 : Ctrl + Space
		Scanner scanner = new Scanner(System.in);	//	표준 입력으로부터 데이터 입력
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		
		String name = scanner.next();
		
		System.out.print("나이:");
		
		int age = scanner.nextInt();
		
		System.out.println("당신의 이름은 " + name + "이고 " + age + "살입니다.");
		
		//	쓰고 나면 닫아주자!
		scanner.close();
	}
	
	private static void consoleOutputEx() {
		//	콘솔 출력
		//	System.out -> 표준 출력
		//	System.err -> 표준 에러
		
		//	print 메서드 -> 출력 후 개행 안함
		//	println 메서드 -> 출력 후 개행 함
		//	printf 메서드 -> 형식화된 출력 -> TODO: 뒤쪽 String 항목에서 정리
		System.out.print("Hello "); 
		System.out.println("Java");
		
		//	이스케이프 문자: 특수한 의미를 가진 문자
		System.out.println("Hello\nJava");	//	\n -> 강제 개행
		System.out.println("Hello\tJava");	//	\t -> 탭문자
		
		System.out.println("Hello, \"Java\"");	//	\" -> "
		//	\ 자체를 표기하고자 할 때
		String dir = "C:\\Windows\\System";	//	\\ -> \
		System.out.println(dir);
		
		System.err.println("표준 에러 출력!");
	}

}
