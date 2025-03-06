package com.shinhan.day06.inheritence;

public class 금호타이어 extends Tire {
	public int color = 256;
	@Override
	public void roll() {
		System.out.println("****************");
		System.out.println("금호타이어의 roll.....");
		System.out.println("****************");
	}

	
}
