package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "last-leaf.txt";
	static String target = rootPath + "last-leaf-filtered.txt";
	
	//	leaf, leaves가 포함된 라인을 -> last-leaf-filtered.txt로 저장
	public static void main(String[] args) {
		try {
			//	주스트림
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
			//	보조 스트림
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			//	줄단위 입출력에 편리한 부가 메서드를 지원
			String line = "";
			while((line = br.readLine()) != null) {
				//	더이상 읽을 라인이 없으면 null
				//	leaf, leaves가 들어있는 라인만 출력, 저장
				if (line.toLowerCase().contains("leaf") ||
						line.toLowerCase().contains("leaves")) {
					System.out.println("Found:" + line);
					//	출력
					bw.write(line);
					bw.newLine(); //	개행
				}
			}
			
			br.close();
			bw.close();
			
			System.out.println("필터링 완료!");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
