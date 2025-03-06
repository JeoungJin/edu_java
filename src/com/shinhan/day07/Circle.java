package com.shinhan.day07;

public class Circle  extends Shape{
	double radius;
	double circumference;

	public Circle(String color, int radius) {
		super(color, "Circle");  
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		circumference = 2*radius*Math.PI;
		return circumference;
	}

	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	 

}
