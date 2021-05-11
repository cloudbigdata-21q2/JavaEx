package com.javaex.api.collection.hash;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
//		hashSetBasic();
		hashSetCustom();
	}
	
	private static void hashSetCustom() {
		//	사용자 정의 클래스의 HashSet
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("홍길동", 10);
		Student s3 = new Student("홍길동", 20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		
		//	포함 여부 확인
		System.out.println("홍길동, 10 학생이 있는가? " + 
				hs.contains(new Student("홍길동", 10)));
		
		//	iterator
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
	}
	
	private static void hashSetBasic() {
		//	선언
		HashSet<String> hs = new HashSet<>();
		
		//	객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); //	중복 삽입 허용 안함
		//	순서가 중요하지 않다
		
		System.out.println(hs);
		System.out.println(hs.size() + "개의 요소를 갖고 있음");
		
		//	포함 여부 확인
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
		
		//	객체의 삭제
		hs.remove("C++");
		System.out.println(hs);
	}

}
