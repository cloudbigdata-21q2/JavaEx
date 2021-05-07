package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		System.out.println("p = " + p);
		
		//	복제 테스트
		Point p2 = p.getClone();
		System.out.println("p2 = " + p2);
		
		//	두 객체의 값이 같은지 
		System.out.println("p.equals(p2) ? " + p.equals(p2));
	}

}
