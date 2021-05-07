package com.javaex.api.objectclass.v4;

import java.util.Arrays;

//	v4. 깊은 복제
//	얕은 복제 : 필드 값만 복제 -> 참조 타입 필드는 주소가 복사
//		참조 타입의 필드는 같은 객체를 참조하게 된다
//	깊은 복제 : 내부에 있는 참조 필드도 복사 새로운 주소를 참조해야 한다
//		Object 객체의 clone 메서드를 Override
public class Scoreboard implements Cloneable {
	private int scores[];	//	참조 타입 필드
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//	1. 먼저 얕은 복제를 시도
		Scoreboard clone = (Scoreboard)super.clone();
		//	2. 내부의 참조 객체 복제, 새로 할당
		clone.scores = Arrays.copyOf(scores, scores.length);
		
		return clone;
	}


	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();	//	복제
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}	
}
