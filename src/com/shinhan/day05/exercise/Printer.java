package com.shinhan.day05.exercise;

public class Printer {
    //method overloading : 이름같고 매개변수의 사양(갯수, 타입) 다르다. return무관 
	//자동형변환 가능 
	static void println(int a) {
		System.out.println("int:" + a);
	} 
	 
	static void println(double a) {
		System.out.println("double:" + a);
		
	} 
	static void println(boolean a) {
		System.out.println("boolean:" + a);
	}
	
	static void println(String a) {
		System.out.println("String:" + a);
	} 
	static void println(Object a) {
		System.out.println("Object:" + a);
	} 
}
