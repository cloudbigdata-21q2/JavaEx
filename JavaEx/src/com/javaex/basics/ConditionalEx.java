package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
		ifElseEx2();
	}
	
	private static void ifElseEx2() {
		//	정수 입력
		//	양수일 때
		//		짝수, 홀수
		//	음수일 때 -> 음수
		//	0이면 0
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		
		if (num > 0) {
			//	양수
			if (num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			//	음수 or 0
			if (num == 0) {
				System.out.println("0입니다.");
			} else {	//	음수 
				System.out.println("음수입니다.");
			}
		}
		
		scanner.close();
	}
	
	private static void ifElseEx() {
		//	정수를 입력 받아서
		//	양수, 음수, 0을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		
		/*
		if (num > 0) {	//	조건 1
			System.out.println("양수입니다.");
		} else if (num < 0) {	//	조건 2
			System.out.println("음수입니다.");
		} else {
			//	위 조건이 하나도 맞지 않을 때
			System.out.println("0입니다.");
		}
		*/
		
		//	중첩 if 
		if (num == 0) {
			System.out.println("0입니다.");
		} else {	//	0이 아닌 값
			if (num > 0) {
				//	양수
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		scanner.close();
	}

}
