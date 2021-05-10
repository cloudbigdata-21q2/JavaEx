package com.javaex.api.arraysclass;

//	사용자 정의 객체의 비교를 위해서는 Comparable 인터페이스 구현
public class Member implements Comparable {
	String name;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		//	결과가 0이면 두 객체는 순서가 같다
		//		-1이면(음수) 앞의 객체가 먼저
		//		1이면(양수) 앞의 객체가 나중 
		if (o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}
	
	
}
