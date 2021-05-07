package com.javaex.ojectclass.example1;

//	두 사각형의 넓이(면적)가 같으면 두 사각형은 같은 것으로 하자
public class Rectangle {
	private int width;
	private int height;
	
	//	생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return width * height == other.width * other.height;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width 
				+ ", height=" + height 
				+ ", area=" + (width * height) + "]";
	}
	
	
}
