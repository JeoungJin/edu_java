package com.shinhan.day07.inheritence;

public class App {

	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());

	}
	public static void action(A a) {
		a.method1();
		if(a instanceof C cc) {
		  cc.method2();	
		}
		 
	}

}
