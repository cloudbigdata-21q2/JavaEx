package com.javaex.exception;

//	사용자 정의 예외
public class CustomArithmeticException extends ArithmeticException {
	//	상황 정보를 담을 필드
	private int num1;
	private int num2;
	
	//	생성자
	public CustomArithmeticException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	//	Getters
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}
