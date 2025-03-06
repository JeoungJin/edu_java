package com.shinhan.day06.inheritence;

public class Child extends Parent{
	//1.field 추가 
	String myname = "자바";
	//3.상속후 변경하기
	String a = "상속후 변경하기";
	//Override(덮어쓰기)
	void f1() {
		//super.f1();
		System.out.println("f1()=>Override(덮어쓰기)");
	}
	
	//2.method추가 
	void f2() {
		System.out.println("자식정의함수 f2()");
		System.out.println("a=" + a);
		f1();
		System.out.println(myname);
	}
}
