package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		p1.draw();
		
		Point p2 = new Point(30, 40);
		p2.draw();
		
		//	오버로딩된 메서드 호출
		p1.draw(true);
		p1.draw(false);
		
		p2.draw(true);
		p2.draw(false);
	}

}
