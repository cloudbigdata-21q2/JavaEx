package com.javaex.io.bytestream;

import java.io.File;

public class FileClassEx {
	static String rootPath = System.getProperty("user.dir") + "\\files";
	
	public static void main(String[] args) {
		// 파일 객체의 생성
		File root = new File(rootPath);
		//	파일이 실제 존재하는가 ?
		System.out.println(rootPath + ":" + root.exists());
		//	파일 정보 출력
		printInfo(root);
	}

	private static void printInfo(File f) {
		System.out.println("--------------------");
		
		//	파일 객체가 디렉터리인가?
		if (f.isDirectory()) {
			System.out.println("Directory: " + f.getName());
			//	파일 목록 확인
			File[] files = f.listFiles();
			for (File file: files) {
				if (file.isFile()) {	//	파일이면
					System.out.printf("    f %s - %d%n", 
							file.getName(), file.length());
				} else {	//	디렉터리면
					System.out.printf("    d %s%n", 
							file.getName());					
				}
			}
		} else {
			System.out.println("File: " + f.getName());
		}
		
		System.out.println("--------------------");
	}
}
