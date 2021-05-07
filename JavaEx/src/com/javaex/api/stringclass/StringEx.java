package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		usefulMethods();
	}
	
	private static void stringBasic() {
		String s1 = "Java";	//	리터럴
		String s2 = new String("Java");	//	새 객체 
		String s3 = "Java";	//	리터럴
		
		System.out.println("s1 == s2 ? " + (s1 == s2)); //	리터럴 vs new
		System.out.println("s1 == s3 ? " + (s1 == s3));	//	리터럴 vs 리터럴
		
		//	valueOf() 메서드 : 기본 타입을 -> 문자열로 리턴
		String s4 = String.valueOf(Math.PI);
		System.out.println("valueOf 메서드:" + s4);
	}
	
	private static void usefulMethods() {
		
	}

}
