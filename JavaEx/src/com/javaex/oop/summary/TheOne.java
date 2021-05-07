package com.javaex.oop.summary;

//	인터페이스는 여러개 구현 가능
public class TheOne extends Human implements KungfuSkill, Flyable {
	public TheOne(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void fly() {
		System.out.printf("%s: I belive I can fly!%n", 
				name);
	}

	@Override
	public void kungfu() {
		System.out.printf("%s: I know kungfu!%n", name);
	}

}
