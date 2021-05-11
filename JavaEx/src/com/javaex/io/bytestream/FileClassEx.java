package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	public static void main(String[] args) {
		// 파일 객체의 생성
		File root = new File(rootPath);
		//	파일이 실제 존재하는가 ?
		System.out.println(rootPath + ":" + root.exists());
		//	파일 정보 출력
		printInfo(root);
		
		//	디렉터리 생성 : subdir
		File child = new File(rootPath + "\\subdir");	
		
		if (!child.exists()) {	//	생성할 디렉터리가 없으면
			child.mkdirs();
			System.out.println("subdir 생성!");
		}
		
		//	파일 생성 : myFile.txt
		File newFile = new File(rootPath + "myFile.txt");	//	파일 정보만 생성
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();// 실제 파일 생성
				System.out.println("myFile.txt 생성!");
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했어요!");
			}
		}
		printInfo(root);
		
		//	파일 지우기
		newFile.delete();
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
