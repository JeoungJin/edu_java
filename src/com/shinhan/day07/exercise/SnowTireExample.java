package com.shinhan.day07.exercise;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		//1)자동형변환 : 부모 = 자식 
		Tire tire = snowTire;
		//메서드는 재정의된것이 수행된다.(instance를 따른다)
		snowTire.run();
		tire.run();
	}
}
