package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
//		enumBasic();
		enumEx();
	}
	
	private static void enumEx() {
		//	ConditionalEx.switchEx3() -> enum 버전
		Week today = Week.TUESDAY;
		String act = "";
		
		//	MONDAY ~ THURSDAY : act <- 열공
		//	FRIDAY : act <- 불금
		//	SATURDAY : act <- 주말
		//	SUNDAY : act <- 휴식
		//	나머지 : act <- ?
		switch (today) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "열공";
			break;
		case FRIDAY:
			act = "불금";
			break;
		case SATURDAY:
			act = "주말";
			break;
		case SUNDAY:
			act = "휴식";
			break;
		default:
			act = "?";
		}
		
		System.out.printf("%s에는 %s%n", today.name(), act);
	}
	
	private static void enumBasic() {
		//	enum의 메서드들
		Week today = Week.TUESDAY;
		
		System.out.printf("Today is %s(%d)%n", 
				today.name(),	// 열거 상수의 문자열
				today.ordinal());	//	순번
		
		String dayStr = "FRIDAY";
		Week other = Week.valueOf(dayStr);	//	문자열 -> 열거상수로 변환
		
		System.out.printf("Other is %s(%d)%n", 
				other.name(),
				other.ordinal());
		
		//	순번 비교
		int diff = today.compareTo(other);
		System.out.println("today와 other의 순번차:" + diff);
	}

}
