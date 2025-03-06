package com.shinhan.day09;

//[modifier] :public|생략 / abstract, final(상속불가) 
abstract class Parent1 {
	// field Modifier : public|protected|생략|private/final, static
	int field1 = 100;

	// constructor 추가되면 default생성자가 자동으로 만들어지지않음
	Parent1(String s) {

	}

	// method Modifier : public|protected|생략|private/final, static
	void method1() {
		System.out.println("method1....field1=" + field1);
	}

	// 규칙(정의)만있고 구현은 없다
	abstract void work();
}

interface MyInterface1 {
	public abstract void action1();

	void action2();
}

interface MyInterface2 {
	void action3();
}

//interface는 다중상속 가능 
interface MyInterface3 extends MyInterface1, MyInterface2 {
	void action4();
}

//구현class: 여러개의  interface를 구현 가능 
class Child1 extends Parent1 implements MyInterface1, MyInterface2 {
	
	String childField = "자바";
	
	Child1() {
		super("");
	}

	@Override
	public void method1() {
		System.out.println("method1 override....field1=" + field1);
	}

	//
	public void method1(int a) {
		System.out.println("method1 overloading....field1=" + field1);
	}

	void method2() {
		System.out.println("부모의 field접근:" + field1);
		method1();
	}

	void work() {

	}

	public void action1() {
		System.out.println("MyInterface1... action1");
	}

	public void action2() {
		System.out.println("MyInterface1... action2");
	}

	public void action3() {
		System.out.println("MyInterface2... action3");
	}
}

public class Review {
	//class method
	public static void main(String[] args) {
          Child1 a = new Child1();
          
          //자동형변환 
          Parent1 b = a;
          MyInterface1 c = a;
          MyInterface2 d = a;
          
          new Review().display(a);
          
	}
	//instance method
	void display(Object aa) {
		//강제형변환시 반드시 instance를 체크한다. 
		if(aa instanceof Child1) {
			((Parent1)aa).method1();
			
			MyInterface1 bb = (MyInterface1)aa;
			bb.action1();
			bb.action2();
		}
	}
}








