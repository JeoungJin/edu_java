package com.shinhan.day09.inner;

public class A {
	
	void useB() {
		//A class내의 B class사용하기
		//1)static사용
		System.out.println(B.field2);
		B.method2();
		//2)instance사용 
		B b = new B();
		System.out.println(b.field);
		b.method1();
	}
	
	
	// 1) instance inner class(인스턴스멤버클래스)
	class B {
        //1.field
		int field=1;
		static int field2 = 2;
		//2.constructor
		B(){
			System.out.println("B-생성자");
		}
		//3.일반메서드
		void method1() {
			System.out.println("B-method1실행(instance method)");
		}
		static void method2() {
			System.out.println("B-method2실행(static method)");
		}
		//4.
		//5.
	}
	
}
