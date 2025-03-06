package com.shinhan.day03;

//JVM
//cmd>java Review
//class load
public class Review {
	public static void main(String[] args) {
		f7();
		System.out.println("===END====");
	}

	private static void f7() {
		
		int a=10;
		int b=0;
		if(b!=0)
		   System.out.println(a/b);
		else
		   System.out.println("정수는 0으로 나눌수 없음");
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y; //0으로 나눌수 없다. 오류발생안함
		//if (y == 0.0) {
		if ( Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}

	}

	private static void f6() {
		int x = 10;
		int y = 5;
		System.out.println((x > 7) && (--y <= 5));// true
		System.out.println((x % 3 == 2) || (--y % 2 != 1));// false

		System.out.println(x);
		System.out.println(y);

	}

	private static void f5() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthTop + lengthBottom) * height / 2.0;
		double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2;
		double area3 = (double) (lengthTop + lengthBottom) * height / 2;
		double area4 = (double) ((lengthTop + lengthBottom) * height / 2);// 값오류
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);

	}

	private static void f4() {
		int value = 356;
		System.out.println(value / 100 * 100);
		System.out.println(value - value % 100);

	}

	private static void f3() {
		int pencils = 534;
		int students = 30;
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		// 남은 연필 수
		int pencilsLeft = pencils - students * pencilsPerStudent;
		int pencilsLeft2 = pencils % students;
		System.out.println(pencilsLeft);
		System.out.println(pencilsLeft2);

	}

	private static void f2() {
		int score = 85;
		String result = !(score > 90) ? "가" : "나";
		System.out.println(result);

	}

	// 함수이름(){}
	public static void f1() {
		int x = 10;
		int y = 20;
		int z = ++x + y--;
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);

	}
}
