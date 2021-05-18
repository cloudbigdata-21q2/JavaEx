package com.javaex.jdbc.oracle.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AuthorApp {

	public static void main(String[] args) {
//		selectAll();
		insertAuthor();
	}

	private static void insertAuthor() {
		//	Scanner에서 이름 입력 -> INSERT
		Scanner scanner = new Scanner(System.in);
	}
	
	private static void selectAll() {
		AuthorDAO dao = new AuthorDAOImpl();
		List<AuthorVO> list = dao.getList();
		
		//	Iterator
		Iterator<AuthorVO> it = list.iterator();
		
		System.out.println("========== Author List");
		
		while(it.hasNext()) {
			AuthorVO item = it.next();	//	iterator에서 요소 추출
			System.out.printf("%d\t%s\t%s%n", 
					item.getId(), 
					item.getAuthorName(), 
					item.getAuthorDesc());
		}
	}
}
