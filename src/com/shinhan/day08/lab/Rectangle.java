package com.shinhan.day08.lab;

import java.io.IOException;
 
public class Rectangle extends Shape implements Resizable{
	double width, height;
	Rectangle(double width, double height){
		super(4);
		this.width = width;
		this.height = height;
	}
	@Override
	public void resize(double s) {
		width = width * s;
		height *= s;
		
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return width*2 + height*2;
	}
	 
}
