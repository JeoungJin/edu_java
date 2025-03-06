package com.shinhan.day06.book;


//자식 
public class SmartPhone extends Phone{
	 
	public static void main(String[] args) {
		SmartPhone a = new SmartPhone();
		
	}
	 
	void f() {
		System.out.println("a");
		int result = sum(1,2);
		sum();
		
	}
	
	private void sum() {
		// TODO Auto-generated method stub
		
	}
	private int sum(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
}
