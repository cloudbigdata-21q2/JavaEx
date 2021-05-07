package com.javaex.oop.shape.v2;

//	추상 클래스
//		스스로 객체화 불가
//		자식에게 물려주기 위한 설계도로만 존재
//		반드시 한 개이상의 추상 메서드를 가져야 한다
//		특정 기능의 구현을 강제하는 측면
public abstract class Shape {
	//	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	메서드는 추상 메서드 or 일반 메서드를 가질 수 있다
	//	추상 메서드가 한 개 이상 있어야
//	public abstract void draw();	//	Drawable 인터페이스로 위임
	public abstract double area();	
}
