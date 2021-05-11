package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ScannerEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";
	//	Scanner는 여러가지 입력 소스로부터 데이터 입력 받는 클래스
	
	public static void main(String[] args) {
		// 파일 정보 설정
		File file = new File(filename);
		
		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;
			
			//	줄 단위 읽어오기
			while(scanner.hasNextLine()) {
				name = scanner.next(); // 문자열
				height = scanner.nextFloat(); // 실수
				weight = scanner.nextFloat(); // 실수
				
				System.out.printf("%s, 키:%f, 체중:%f%n",
						name, height, weight);
				scanner.nextLine();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
