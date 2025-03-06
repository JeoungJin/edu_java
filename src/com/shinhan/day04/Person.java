package com.shinhan.day04;

//class : 설계도 , 구성요소=>field+method
//object : 실체(instance), class를 이용해서 생성(new)한다. 
public class Person { 
    //1.field : 속성, 변수선언, object들의 공통특성 
	String name;
	int age;
	//2.constructor(생성자)....new를 수행시 자동으로 호출되는 함수
	//정의하지않으면 Compile시에 자동으로 만들어진다. 
	//class이름과 같다. Return을 가질수 없다.  
	public Person(){
		System.out.println("3번 Person class의 생성자이다. new시 마다 실행");
	}
	public Person(String name, int age){
	  this.name = name;
	  this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//3.method : 문장들의 묶음 , 반드시 return타입을 정의한다.
	void study(){
		System.out.println("함수호출시 수행-------------");
		System.out.println(name + "공부한다.");
	}
	
	void useCalculator(){
		//1.객체참조변수 선언 + 2.객체생성 
		Calculator cal = new Calculator();
		//3.사용
		cal.model = "ABC모델";
		cal.color = "black";
		cal.price = 20000;
		cal.print();
		System.out.println(cal.plus(10, 20));
		System.out.println(cal.minus(10, 5));
		
	}
	
	
	//4.block
	{
		System.out.println("2번#####################"); 
		System.out.println("object block..객체생성시마다 실행");
		System.out.println("#####################");
	}
	static {
		System.out.println("1번@@@@@@@@@@@@@@@"); 
		System.out.println("static block..class가 load시 1회");
		System.out.println("@@@@@@@@@@@@@@@");
	}
	//5.inner class
	class InnerClass{
		
	}
}






