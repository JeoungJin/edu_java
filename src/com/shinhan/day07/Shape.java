package com.shinhan.day07;

//abstract class : 추상메서드가 하나이상 존재한다. 
//추상메서드 : 함수의 정의는 있으만 구현은 없다.  자식이 반드시 구현한다. 
public abstract class Shape {

	private String color;
	private String type;
	
	public Shape() {}
	
	public Shape(String color, String type)
	{
		this.color = color;
		this.type = type;
	}
	
	public String getColor()
	{
		return color;
	}
	public String getType()
	{
		return type;
	}
	
	//부모의 메서드는 있지만 (부모를 통해 자식의 기능을 수행하기위해 존재)
	//field값을 가지고 있지않아서 구현이 불가. 
	//부모는 정의하고  자식이 구현하도록 한다. 
	public abstract double calculateArea() ;
	public abstract double calculatePerimeter() ;
	
	public String toString()
	{
		return color + " " + type;
	}
	
}
