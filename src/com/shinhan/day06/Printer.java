package com.shinhan.day06;

public class Printer {

	//메서드:행위, 기능, 필수구성요소는 : ReturnType 함수이름(){}
	//구현됨 {}
	//non-static : instance메서드이다. 객체생성후 호출가능 
	//static :class메서드이다.   객체생성 불필요 
	void println(int param){
		System.out.println(param);
	}
	void println(String param){
		System.out.println(param);
	}
	void println(boolean param){
		System.out.println(param);
	}
	static void println2(int param){
		System.out.println(param);
	}
	static void println2(String param){
		System.out.println(param);
	}
	static void println2(boolean param){
		System.out.println(param);
	}
}
