package com.shinhan.day06.inheritence;

public class 한국타이어 extends Tire {
	public boolean color = true;
	@Override
	public void roll() {
		System.out.println("#####################");
		System.out.println("한국타이어 roll...roll....roll");
		System.out.println("#####################");
	}
	
	void display() {
		System.out.println("한국타이어만 가지는 기술");
	}
   
}
