package com.javaex.oop.summary;

//	상속(extends)은 오로지 1부모로부터
//	구현(implments)는 여러개의 인터페이스 가능
public class KungfuPanda extends Panda implements KungfuSkill {

	/*
	//	1. 생성자 선언 안하면 -> 기본 생성자 추가
	public KungfuPanda() {
		//	2. 특별히 명시하지 않으면 부모의 기본생성자를 호출
		super();
	}
	*/
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.printf("%s: 아뵤~!%n", name);
	}
}
