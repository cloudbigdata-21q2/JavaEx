package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		whileInfinity();
		doWhileEx();
	}
	
	private static void doWhileEx() {
		//	while 문의 반복 조건을 뒤에서 확인
		//	최소 1회는 실행해야 하는 경우 do ~ while 문 사용
		//	사용자에게 숫자 입력 받아 모두 합산하는 코드
		//	사용자가 0을 입력하면 반복 종료
		int total = 0;
		int value = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {	//	일단 실행 후 뒤에서 체크
			System.out.print("숫자를 입력하세요: [0이면 종료]:");
			value = scanner.nextInt();
			total += value;
		} while (value != 0);	//	0이 아니면 반복
		
		System.out.println("합계:" + total);
		scanner.close();
	}
	
	private static void whileInfinity() {
		//	while 문은 반복 조건을 개발자가 세팅해야
		//	-> 무한 루프에 빠질 위험
		//	경우에 따라 의도적으로 무한루프를 만들기도 한다
		//	반복 조건이 항상 true여야 한다
		while(true) {
			System.out.println("Ctrl + C to quit");
		}
	}
	
	private static void whileGugu() {
		//	while 문을 이용한 구구표 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		int i = 1;	//	루프 제어 변수
		
		while(i <= 9) {	
			System.out.println(dan + "*" + i + "=" + (dan * i));
			//	제어변수 증가\
			i++;
		} 
		scanner.close();
	}
	
	private static void whileEx() {
		//	1부터 10까지 반복하면서 합산 후 결과 출력
		//	제어 변수 
		int num = 1;
		int total = 0;	//	합산 변수
		
		//	루프
		while(num <= 10) {
//			total = total + num;
			total += num;	
			//	while문은 무한 루프에 빠지기 쉬우므로
			//	제어변수를 적절히 변경해 줘야 한다
			num++;
		}
		
		System.out.println("합산값:" + total);
		
	}

}
