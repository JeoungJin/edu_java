package com.shinhan.day07;

public class Child extends Parent{
	boolean a = true;
	String b = "자바..child";
	Child(){
		//super();
		System.out.println("자식의 생성자");
	}
	//Override(덮어쓰기):이름같고 매개변수같고 Return같고 Modifier는 같거나 더 넓어져야한다. 
	//Overloading(추가):이름같고 매개변수다르다. 
	public void method1() {
		   System.out.println("!!자식의 메서드 method1()");
	}
	
	void method2() {
		method1(); //자식의 부모의 메서드 사용가능 
		System.out.println(a+b); //자식은 부모의 field를 사용가능 
	}
}
