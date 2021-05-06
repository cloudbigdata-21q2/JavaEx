package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		/*
		Point p1 = new Point(10, 20);
		p1.draw();
		
		Point p2 = new Point(30, 40);
		p2.draw();
		
		//	오버로딩된 메서드 호출
		p1.draw(true);
		p1.draw(false);
		
		p2.draw(true);
		p2.draw(false);
		*/
		
		//	상속 받은 객체 사용
		Point cp1 = new ColorPoint(50, 60, "red");
		cp1.draw(true);
		
		Point cp2 = new ColorPoint(100, 200, "blue");
		cp2.draw(false);
	}

}
