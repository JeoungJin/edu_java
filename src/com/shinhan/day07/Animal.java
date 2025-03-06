package com.shinhan.day07;

//abstract class : abstract method가 있음을 의미 
// - 직접생성불가 
public abstract  class Animal {
	private String name;
	private int size;
	Animal(){
		
	}
	Animal(String name, int size){
		System.out.println("Animal생성자");
		this.name = name;
		this.size = size;
	}
	//추상메서드...자식이 구현한다.  
	abstract void sound() ;
	 
	//일반메서드...내가 직접구현한다.  
	void f1() {
		
	}
}
