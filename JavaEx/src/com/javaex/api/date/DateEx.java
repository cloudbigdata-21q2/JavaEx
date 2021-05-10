package com.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
//		dateEx();
		calendarEx();
	}
	
	private static void calendarEx() {
		//	캘린더 불러오기
		Calendar now = Calendar.getInstance();
//		System.out.println("NOW:" + now);
		Calendar custom = Calendar.getInstance();
		custom.set(1999, 11, 31); //	1999년 12월 31일 (월정보는 0부터 시작)
		
		//	정보 받아오기 .get(캘린더 상수)
		System.out.printf("오늘은 %d년 %d월 %d일입니다.%n", 
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,	//	월은 0부터
				now.get(Calendar.DATE));
		
		Calendar future = Calendar.getInstance();	//	현재 날짜 
		//	100일 뒤로 이동
		future.add(Calendar.DATE, 100); 
		System.out.printf("100일 후 future: %d년 %d월 %d일%n", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		//	이 날은 무슨 요일?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("100일 후 요일:" + dow);
		
		String dowStr = "?";
		switch(dow) {
		case Calendar.SUNDAY:	//	1
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:	//	2
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:	
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
		}
		//	요일 정보: SUNDAY (1) ~ SATURDAY (7)
		System.out.println(dowStr);
	}
	
	private static void dateEx() {
		//	날짜 얻어오기
		Date now = new Date();
		
		System.out.println(now);
		
		//	형식화 출력 : DateFormat 객체
		//	FULL, LONG, MEDIUM, SHORT -> 바꿔가며 출력해 보자
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM:" + df.format(now));
		
		//	SimpleDateFormat -> 포맷 문자열을 이용, 자유롭게 날짜 포맷
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("SDF:" + sdf.format(now));
	}

}
