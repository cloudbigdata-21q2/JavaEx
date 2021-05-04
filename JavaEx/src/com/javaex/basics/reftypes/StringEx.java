package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		stringFormatEx();
	}
	
	private static void stringFormatEx() {
		//	형식화된 문자열
		//	%s(문자열), %d(정수), %f(실수), %n(개행), %%(%)
		//	__개의 __ 중에서 __개를 먹었다 -> 문자열 생성
		String food = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + food + "중에서 "
				+ eat + "개를 먹었다");
		//	-> 포맷화된 출력
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다%n", 
				total, food, eat);
		
		//	%d, %f 등의 포맷 문자에는 부가 정보를 담을 수 있다
		float rate = 1.234f;
		//	현재 이자율은 __%입니다
		System.out.printf("현재 이자율은 %f%%입니다.%n", rate);
		//	부가 정보로 소숫점 자릿수 지정
		System.out.printf("현재 이자율은 %.2f%%입니다.%n", rate);
		
		//	포맷 형식은 String.format 메서드를 이용, 문자열 생성시 활용 가능
		String fmt = "%d개의 %s 중에서 %d개를 먹었다%n";
		String result = String.format(fmt, 5, "바나나", 2);
		System.out.println(result);
	}
	
	private static void stringBasic() {
		//	문자열 선언
		String str;	//	선언
		str = "Java";	//	할당	-> Literal (코드에 직접 입력한 값)
		String str2 = "Java";	//	선언 + 할당 -> Literal
		String str3 = new String("Java");	//	새 객체 
		
		//	참조 변수는 객체의 주소를 가지고 있다
		//	참조 변수의 ==, !=은 주소를 비교하는 것
		//	Literal vs Literal
		System.out.println("str == str2 ? " + (str == str2));	//	주소가 같다
		//	Literal vs new String
		System.out.println("str == str3 ? " + (str == str3));
		
		//	참조 변수의 값이 같은지를 비교 -> equals
		System.out.println("str과 str2가 내용이 같은가?" + str.equals(str2));
		System.out.println("str과 str3가 내용이 같은가?" + str.equals(str3));
	}

}
