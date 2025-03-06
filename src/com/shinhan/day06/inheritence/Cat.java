package com.shinhan.day06.inheritence;

public class Cat extends Animal{

	public Cat() {
		super();
		System.out.println("2.Cat생성됨");
	}
	
	void play() {
		System.out.println("고양이 혼자놀기");
	}
	
	@Override
	void sing() {
		System.out.println("cat....야옹~~");
	}
	@Override
	void fly() {
		System.out.println("cat....날수없다 ");
	}
}
