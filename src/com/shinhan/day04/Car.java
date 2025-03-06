package com.shinhan.day04;
/*
 * 자동차(Car) class정의
특징 : model, color, price
기능 : go(), back(), stop() 
 */

//class:틀,설계도, template, object들의 공통특성이 정의

public class Car {
	// 1.field(변수) - 생성시 자동초기화, 멤버변수
	String model;
	String color;
	int price;

	// 2.생성자메서드 --정의없으면 컴파일러가 자동 만들어준다.정의가 있으면 제공안함
	// 생성자의 Overloading (생성하는 방법이 다양하다)
	// Overloading : 이름은 같고 매개변수가 다르다.
	// 값을 최고하하는 것이 목적이다.
	// 매개변수이름과 Field이름이 충돌발생
	// 구분하기위해 현재객체를 this사용
	// 생성자가 여러개인 경우 하나의 생성자가 다른 생성자를 호출 this()
	public Car() {
		this(null, null, 0);
		System.out.println("3.Car default생성자:매개변수없음");
	}

	public Car(String model, String color, int price) {
		System.out.println("---Car가 생성됨----");
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public Car(String model) {
		this(model, null, 0);
	}

	public Car(String model, String color) {
		this(model, color, 500);
	}

	// 3.일반메서드(기능)
	void go() {
		System.out.println("직진");
	}

	void back() {
		System.out.println("후진");
	}

	void stop() {
		System.out.println("멈춤");
	}

	// toString()재정의
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}

	// 4.block : instance(object) block, static block
	{
		System.out.println("2.instance block-생성시마다수행");
	}

	

	static {
		System.out.println("1.static block-생성시마다수행");
	}
	// 5.inner class

}
