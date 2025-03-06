package com.shinhan.day10;

//예외로 사용하고자한다. 
//extends Exception 를 상속받았으므로 일반예외이다. 
//ID는 5자리 이하이어야한다. 
public class MyException extends Exception{
	String message2;
	public MyException(String message){
		super(message);   //getMessage()
		this.message2 = message;
	}
	void f1() {
		System.out.println(message2 + ".....");
	}
}
