package com.shinhan.day09;

interface A {
}

class B implements A {
}

class C implements A {
}

class D extends B {
}

class E extends C {
}

interface Remocon {
	public void powerOn();
}

class TV implements Remocon {
	public void powerOn() {

	}

	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}
}

interface Soundable {
	public String sound();
}

class Cat implements Soundable {
	public String sound() {
		return "AA";
	}
}

class Dog implements Soundable {
	public String sound() {
		return "BB";
	}
}

/*
 * abstract class DataAccessObject{ //class라면 :field/constructor/일반메서드 abstract
 * void select(); abstract void insert(); abstract void update(); abstract void
 * delete(); }
 */
interface DataAccessObject {
	void select();

	void insert();

	void update();

	void delete();
}

//이미 다른class를 상속중이라면 다중상속불가  
class OracleDao implements DataAccessObject {
	public void select() {
	}

	public void insert() {
	}

	public void update() {
	}

	public void delete() {
	}
}

class MySqlDao implements DataAccessObject {
	public void select() {
	}

	public void insert() {
	}

	public void update() {
	}

	public void delete() {
	}
}

interface A2 {
	public void method1();
}

class B2 implements A2 {
	@Override
	public void method1() {
		System.out.println("B - method1()");
	}
}

class C2 implements A2 {
	@Override
	public void method1() {
		System.out.println("C - method1()");
	}

	public void method2() {
		System.out.println("C - method2()");
	}
}

public class 확인문제 {
	public static void main(String[] args) {
		action(new B2());
		action(new C2());
	}
	public static void action(A2 a) {
		a.method1();
		if (a instanceof C2 c) {
			c.method2();
		}
	}

	

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main4(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main3(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

	public static void main2(String[] args) {
		확인문제 aa = new 확인문제();
		aa.method(new B());
		aa.method(new C());
		aa.method(new D());
		aa.method(new E());
	}

	void method(A a) {

	}

}
