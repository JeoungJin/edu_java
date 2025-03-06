package com.shinhan.day07.inheritence;
//자식class
public class C extends A {
	@Override
	public void method1() {
		System.out.println("C-method1()");
	}
    //추가 
	public void method2() {
		System.out.println("C-method2()");
	}
}