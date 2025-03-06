package com.shinhan.day07.exercise;

public class Parent2 extends Object{
	public String nation;

	public Parent2() {
		this("대한민국"); //다른모양의 자신의 생성자를 호출 
		System.out.println("2.Parent2() call");
	}

	public Parent2(String nation) {
		super();
		this.nation = nation;
		System.out.println("1.Parent2(String nation) call");
	}
}
