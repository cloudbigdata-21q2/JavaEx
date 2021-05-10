package com.javaex.api.generic.v2;

//	V2.
//	Generic 이용, 설계시에는 데이터 타입을 결정하지 않고
//		인스턴스화 할 때 외부에서 데이터 타입을 지정
//	타입 문자는 T일 필요는 없고
//	많이 사용하는 파라미터 문자
//	T : Type - 데이터 타입
//	R : Return Type - 반환 타입
//	K : Key
//	V : Value
//		-> 어겨도 상관 없으나, 가급적이면 관례 지키도록 합시다
public class Box<T> {
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}


}
