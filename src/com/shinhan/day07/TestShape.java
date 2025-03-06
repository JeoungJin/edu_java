package com.shinhan.day07;

public class TestShape {
	public static void main(String args[]) {
		//배열생성 
		Shape[] s = new Shape[3];

		s[0] = new Circle("BLUE", 10);
		s[1] = new Rectangle("RED", 5, 7);
		s[2] = new Circle("GREEN", 8);

		for (int i = 0; i < 3; i++) {
			System.out.println("-------------------");
			 System.out.println(s[i] + " 면적:" + s[i].calculateArea());
			 if(s[i] instanceof Circle cc) {
				 System.out.println("반지름:" + cc.getRadius());
			 }
		}
	}

}
