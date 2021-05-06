package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// 호출 순서 : static 블록 -> 생성자
		//			두 번째 부터는 static은 호출 안됨
		StaticEx s1 = new StaticEx();
		System.out.println("참조 카운트:" + StaticEx.refCount);	//	s1.refCount
		//	static 멤버는 객체 생성(new) 없이도 접근할 수 있다

		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트:" + StaticEx.refCount);
		
		//	참조 해제
		s1 = null;
		System.out.println("s1 해제!");
		System.out.println("참조 카운트:" + StaticEx.refCount);
		//	강제로 GC 호출
		//	주의: 자바가 객체를 관리하는 순서를 보여드리기 위한 코드
		//		강제로 Garbage Collector를 호출하지는 말자!
		System.gc(); //	참고 코드로만 활용!
		try {
			Thread.sleep(3000);	//	3초 대기
			System.out.println("참조 카운트:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}

}
