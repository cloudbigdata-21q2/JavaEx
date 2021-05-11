package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		// 생성	: Map 인터페이스
		Map<String, ClassRoom> map =
				new Hashtable<>();	//	키로 String사용, 값 ClassRoom
		
		//	데이터 담기: put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Linux", "R404"));
		
		//	키의 순서는 없고, 키는 중복될 수 없다
		System.out.println(map);
		
		//	값의 변경
		map.put("404", new ClassRoom("SQL", "R404"));
		System.out.println(map);
		
		//	키에 연결된 값 가져오기 : get
		System.out.println("303:" + map.get("303"));
		
		//	키가 있는지 확인 : containsKey
		System.out.println("303 이 있는가? " + map.containsKey("303"));
		System.out.println("505 가 있는가? " + map.containsKey("505"));
		
		//	값 중에서 subject가 Java인 값이 있는가? : containsValue
		System.out.println("Java가 값에 있는가? "
				+ map.containsValue(new ClassRoom("Java", "R101")));
		
		//	iterator
		Iterator<String> it = map.keySet().iterator();  // 키의 반복자
		while(it.hasNext()) {
			String key = it.next(); // 키를 추출
			System.out.println(map.get(key));
		}
		
		//	맵 비우기
		map.clear();
		System.out.println(map);
	}

}
