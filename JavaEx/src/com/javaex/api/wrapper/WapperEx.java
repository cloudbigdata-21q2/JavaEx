package com.javaex.api.wrapper;

public class WapperEx {

	public static void main(String[] args) {
		// 기본 생성 -> 더이상 사용 안함(Deprecated)
		Integer i = new Integer(10);
		Character c = new Character('c');
		
		//	valueOf 메서드롤 생성(이 방법을 쓰자)
		Float f = Float.valueOf(3.14159f);
		//	문자열로 된 데이터를 변환
		Integer i1 = Integer.valueOf("2021");
		Double d1 = Double.valueOf("3.14159");
		//	주의: 매개 변수 문자열의 형태가 기본 타입의 형태를 맞춰 줘야 한다
		
		//	자동 박싱
		Integer i2 = 2021;	//	Integer i2 = Integer.valueOf(2021);
		
		//	parse계열 메서드
		System.out.println(Integer.parseInt("-123"));	//	문자열 -> 정수 변환
		System.out.println(Integer.parseInt("FF", 16));	//	16진수 문자열 -> 정수 변환
		System.out.println(Integer.toBinaryString(2021));	//	2진수 문자열 변환
		System.out.println(Integer.toHexString(255));	//	정수 -> 16진수 문자열

		//	형변환
		System.out.println(i2.doubleValue());	//	정수 -> double 형으로 변환
		
		Integer i3 = Integer.valueOf(2021);
		Integer i4 = Integer.valueOf(2021);
		
		System.out.println("i3 == i4 ? " + (i3 == i4));	//	(주의)객체의 주소 비교 -> false
		//	언박싱 비교
		System.out.println("값의 비교(언박싱):" + (i3.intValue() == i4.intValue()));
		//	equals 비교
		System.out.println("값의 비교(equals):" + i3.equals(i4));
	}

}
