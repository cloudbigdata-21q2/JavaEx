package com.javaex.basics;

//	기본 타입 예제
public class Types {

	public static void main(String[] args) {
//		integerTypes();
//		floatTypes();
//		booleanEx();
//		charEx();
		constantEx();
	}
	
	//	상수 예제
	//	이유 1. 변경되면 안되는 값을 보호할 때
	//	이유 2. 코드 가독성이 높아진다
	private static void constantEx() {
		float PI = 3.14159F;
		final int SPEED_LIMIT = 100;	//	상수 생성 -> final
		
		System.out.println("PI:" + PI);
		System.out.println("SPEED_LIMIT:" + SPEED_LIMIT);
		
		int speed = 105;
		
		//	과속 단속
		boolean overspeed = speed > SPEED_LIMIT;
		
		System.out.println("과속 ? " + overspeed);
		
//		SPEED_LIMIT = 80;	//	내부에서 고의로든 실수로든 변경되면 안되는 값 -> 상수
		
		overspeed = speed > SPEED_LIMIT;
		
		System.out.println("과속 ? " + overspeed);
	}
	
	//	char형 자료 예제
	//		-> 내부에 문자에 해당하는 부호 없는 정수 코드 저장(2byte)
	private static void charEx() {
		char ch1 = 'A';	//	-> 내부에는 정수형 코드 저장
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
		
		//	문자열은 쌍따옴표로(")
		String str = "Java";
		System.out.println(str);
	}
	
	//	논리형 자료 예제
	private static void booleanEx() {
		boolean b1 = true;	//	참
		boolean b2 = false;	//	거짓
		
		System.out.println("b1 -> " + b1);
		System.out.println("b2 -> " + b2);
		
		//	비교 연산, 논리 연산의 결과를 담을 수 있는 자료형
		int var1 = 7;
		int var2 = 5;
		
		boolean result = var1 > var2;	//	var1이 var2보다 큰가?
		
		System.out.println("7 > 5 ? " + result);
	}
	
	//	실수형 자료 예제
	private static void floatTypes() {
		float floatVar = 3.12345F;	//	F or f -> float 형임을 알려줌
		double doubleVar = 3.12345;
		
		System.out.println("floatVar:" + floatVar);
		System.out.println("doubleVar:" + doubleVar);
		
		//	지수 표기법 m * 10의 n승 
		int intVar = 3000000;
		floatVar = 3E6F;	//	3.0 * 10 ^ 6
		doubleVar = 3E-6;	//	3.0 * 10 ^ -6
		
		//	주의: float, double -> 정밀도를 포기, 표현 범위를 넓힌 자료형 -> 오차 
		System.out.println(0.1 * 3);
	}
	
	//	정수형 자료 예제
	private static void integerTypes() {
		//	byte(1) < short(2) < int(4) < long(8)
		//	선언
		int intVar1;
		int intVar2;
		//	초기화
		intVar1 = 2021;
		// intVar2 = 12345678901234; -> Error: 범위 초과
		
		System.out.println(intVar1);
		long longVar1;
		long longVar2;
		
		//	정수형 데이터의 기본은 int
		longVar1 = 2021;
		longVar2 = 12345678901234L; // 뒤에 L or l -> long 형임을 알림
		
		System.out.println("longVar1:" + longVar1);
		System.out.println("longVar2:" + longVar2);
		
		//	2진수, 8진수, 16진수 형태로 입력 가능
		int bin = 0b1101;	//	0b -> 2진수
		int oct = 072;		//	0	-> 8진수
		int hex = 0xFF;		//	0x	-> 16진수
		
		System.out.println("0b1101 -> " + bin);
		System.out.println("072 -> " + oct);
		System.out.println("0xFF -> " + hex);
	}
}









