package com.shinhan.day06.inheritence;

//자식은 (하나)부모의 정보를 알수 있다. 
public class Dog extends Animal{

	public Dog() {
		super();
		System.out.println("2.Dog생성됨");
	}
	@Override
	void sing() {
		System.out.println("Dog...멍멍~~");
	}
	@Override
	void fly() {
		System.out.println("Dog....날수없다 ");
	}
}
