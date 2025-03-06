package com.shinhan.day05;

public class Person {
	//field : 1)instance변수(non-static) 2)class변수 (static)
	static int numberOfPersons;	// 전체 인구 수, Person 객체가 생성될 때마다 증가, class변수(instance들이 공유)
	int age;	
	String name;	
	public Person(){
		 this(12, "Anonymous");
	}
	public Person(int age, String name){
		this.name = name;
		this.age = age;
		numberOfPersons++;
	}
	void selfIntroduce(){
		System.out.println("내 이름은 "
				+ name
				+ "이며, 나이는 "
				+ age
				+ "살입니다.");
	}
	static int getPopulation(){
		return numberOfPersons;
	}
	
}

 




