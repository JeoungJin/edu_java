package com.shinhan.day06;

//class : object의 틀 
//object는 class를 이용해서 만든 독립된 개체 , 
//this는 현재객체 
public class ProductVO {
	//1.field(data저장목적, 재사용):instance변수(non-static), class변수(static)
	//instance변수(non-static) : new시에 heap에 객체생성후 자동초기화 
	String name;
	int price;
	String maker;
	
	//2.생성자..field초기화 목적 
	ProductVO(String name, int price, String maker){
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	//3.일반메서드 
	void f1() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(maker);
	}
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}
	
}
