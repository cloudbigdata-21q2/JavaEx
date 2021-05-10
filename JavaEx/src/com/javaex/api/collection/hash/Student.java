package com.javaex.api.collection.hash;

//	객체 동등성의 비교
//	1. 객체의 hashCode()의 반환값을 비교
//	2. 객체의 equals() 메서드로 값의 동일성을 비교
//	1, 2 조건을 모두 통과하면 두 객체는 동등한 객체로 판별
public class Student {
	String name;
	int id;	//	학번
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		// 객체 식별을 위한 하나의 정수값
		return id; 	//	학생은 학번으로 식별할 수 있다
	}

	@Override
	public boolean equals(Object obj) {
		// 두 Student 객체의 필드값을 비교
		if (obj instanceof Student) {
			Student other = (Student)obj;
			return name == other.name && id == other.id;
		}
		return super.equals(obj);
	}
	
	
}
