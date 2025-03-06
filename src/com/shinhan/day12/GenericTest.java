package com.shinhan.day12;

import java.util.HashMap;

import lombok.AllArgsConstructor;


class Person {}
class Worker extends Person{}
class Student extends Person{}
class HighStudent extends Student{}
class MiddleStudent extends Student{}

@AllArgsConstructor
class Applicant<T>{
	T kind;	
}

class Course {
	
	public static void registerCource1(Applicant<?> applicant) {
		System.out.println("registerCource1 등록함(모든)");
	}
	public static void registerCource2(Applicant<? extends Student> applicant) {
		System.out.println("registerCource2 등록함(extends)");
	}
	public static void registerCource3(Applicant<? super Worker> applicant) {
		System.out.println("registerCource3 등록함(super)");
	}
}



public class GenericTest {
	public static void main(String[] args) {
		f2();
	}
	private static void f2() {
		Person p = new Person();
		Student s = new Student();
		Worker w = new Worker();
		HighStudent h = new HighStudent();
		MiddleStudent m = new MiddleStudent();
		
		Applicant<Person> a1 = new  Applicant<>(p);
		Applicant<Student> a2 = new  Applicant<>(s);
		Applicant<Worker> a3 = new  Applicant<>(w);
		Applicant<HighStudent> a4 = new  Applicant<>(h);
		Applicant<MiddleStudent> a5 = new  Applicant<>(m);
		
		Applicant<String> a6 = new  Applicant<>("자바");
		Applicant<Integer> a7 = new  Applicant<>(100);
		Applicant<Money> a8 = new  Applicant<>(new Money(100));
		
		
		Course.registerCource1(a1);
		Course.registerCource1(a2);
		Course.registerCource1(a3);
		Course.registerCource1(a4);
		Course.registerCource1(a5);
		Course.registerCource1(a6);
		Course.registerCource1(a7);
		Course.registerCource1(a8);
		
		
		//Course.registerCource2(a1); //Person X
		Course.registerCource2(a2); //Student O
		//Course.registerCource2(a3); //Worker X
		Course.registerCource2(a4); //HighStudent O
		Course.registerCource2(a5); //MiddleStudent O

		Course.registerCource3(a1); //Person O
		//Course.registerCource3(a2); //Student X
		Course.registerCource3(a3); //Worker O
		//Course.registerCource3(a4); //HighStudent X
		//Course.registerCource3(a5); //MiddleStudent X
	}

	private static void f1() {
		Box<Integer> data = new Box<>(100);
		System.out.println(data);
		
		Box<Money> data2 = new Box<Money>(new Money(1000));
		System.out.println(data2);
		
		HashMap<Money, String> map = new HashMap<>();
		//키는 set으로 만들어짐 , (중복없음, 순서없음)
		map.put(new Money(10), "용돈");//X
		map.put(new Money(10), "저축");//O
		map.put(new Money(20), "선물");
		System.out.println(map);
		
		Box<String> a = makeBox("문자");
		Box<Integer> b = makeBox(100);
		System.out.println(a);
		System.out.println(b);
		
		boolean resutlt1 = compare(10.5, 10.5);
		System.out.println(resutlt1);
		
	}

	private static <T extends Number> boolean compare(T data1, T data2) {
		double a = data1.doubleValue();
		double b = data2.doubleValue();
		return a==b;
	}
	
	
	private static <T> Box<T> makeBox(T data) {
		// TODO Auto-generated method stub
		return new Box<>(data);
	}

}





