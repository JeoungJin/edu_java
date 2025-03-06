package com.shinhan.day05;

public class ComputerTest {

	public static void main(String[] args) {
		f3();

	}
	private static void f3() {
		Computer c1 = new Computer("DESKTOP-P73G82A","window10" );
		System.out.println(c1.getProductName());
		System.out.println(c1.getOs());
		System.out.println(c1.getPrice());
		c1.infoPrint();
	}
	private static void f2() {
		Computer c1 = new Computer("DESKTOP-P73G82A","window10",300);
		System.out.println(c1.getProductName());
		System.out.println(c1.getOs());
		System.out.println(c1.getPrice());
	}

	private static void f1() {
		//기본형 : 선언, 초기화, 사용 
		int a;
		a=10;
		++a;
		System.out.println(a);
		//1.객체참조변수선언
		Computer c1;
		//2.객체생성
		c1 = new Computer();
		//3.객체사용
		c1.setProductName("내컴퓨터");
		c1.setOs("window10");
		c1.setPrice(200);
		System.out.println(c1.getProductName());
		System.out.println(c1.getOs());
		System.out.println(c1.getPrice());
	}

}
