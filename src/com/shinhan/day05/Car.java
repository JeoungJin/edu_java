package com.shinhan.day05;

public class Car {
    //field(변수) : instance 변수(멤버변수), static 변수 
	//1)instance 변수(멤버변수)
	int gas;
	private int speed;
	//2)static 변수 : class변수, 객체생성없이 사용가능,   C언어의 Share변수와 같다. 
	static String company="현대자동차";
	
	//static method: non-static사용불가 
	static void print() {
		System.out.println("static method.."+company );
	}
	
	static{
	   System.out.println("static block..class 최초 load시 1번실행");	
	}
	{
		   System.out.println("instance block..객체생성시마다 실행");	
	}
	
	//instance method: static 사용가능 
	void setSpeed(int speed){
		System.out.println("===method이용==="+company);
		this.speed = speed;
	}
	int getSpeed() {
		//return this.speed;
		return speed;
	}
	
}
