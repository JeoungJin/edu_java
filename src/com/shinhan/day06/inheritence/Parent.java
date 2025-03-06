package com.shinhan.day06.inheritence;

//final 
//1)field : 값 할당후 변경불가 
//2)method : Override 불가 
//3)class  : 상속불가 
public class Parent {
    //1.field
	final int max = 1000;
	final static int MAX2 = 1000;
	int a=100;
	//2.method
	void f1() {
		//max = 2000;
		System.out.println("부모정의함수 f1()");
	}
}
