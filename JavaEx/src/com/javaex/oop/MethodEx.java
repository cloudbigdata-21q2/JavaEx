package com.javaex.oop;

//	메서드 관련 예제 정리
public class MethodEx {
	public static void main(String[] args) {
		printMessage();
		System.out.println("SQUARE:" + square(2));
		System.out.println("4 + 5 = " + getSum(4, 5));
		
		printDivide(7, 3);
		printDivide(7, 0);
		
		System.out.println(getSumArr(new double[] {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10	
		}));
		
		System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		printSum("합계:", 1, 2, 3, 4, 5, 6, 7, 8, 9);
	}
	
	//	고정 인수, 가변 인수 같이 쓸 수 있다 
	//	제약 : 고정 인수를 먼저 선언, 뒤에 가변인수 선언
	private static void printSum(String message,	//	고정 인수
			double ...values) {
		System.out.println(message + ", " + getSum(values));
	}
	
	//	가변 인수 : ... -> 배열로 변환되어 전달 
	private static double getSum(double ...values) {
		/*
		double total = 0;
		
		for (double value: values) {
			total += value;
		}
		
		return total;
		*/
		return getSumArr(values);
	}
	//	매개변수로 배열을 전달
	private static double getSumArr(double[] values) {
		//	전달받은 배열의 요소값을 합산 반환
		double total = 0;
		
		for (double value: values) {
			total += value;
		}
		
		return total;
	}
	
	//	return 문을 만나면 메서드 실행을 중단하고 호출한 쪽으로 돌아간다
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);		
	}
	
	//	매개 변수의 갯수는 필요한 만큼
	private static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
	//	입력이 있고, 반환이 있는 메서드
	private static double square(double num) {
		//	매개변수는 메서드를 벗어나면 효력이 없다
		//	반환 타입과 일치하는 데이터를 return 해야 한다
		return num * num;	
	}
	
	//	입력이 없고, 반환이 없는 메서드(void)
	private static void printMessage() {
		System.out.println("Message");
	}
}
