package com.shinhan.day06;

import com.shinhan.day05.Phone;

public class ModifierTest2 extends Phone {

	public static void main(String[] args) {
		String s1 = "자바";
		String s2 = new String("자바");
		byte[] bytes = {65,66,67};
		String s3 = new String(bytes);
		System.out.println(s3);
	}
	
	
	public static void f2(String[] args) {
		//static final 
		System.out.println(Integer.MAX_VALUE);
		//static method 
		System.out.println(Integer.bitCount(7)); //111
		Integer a=new Integer(10); //10
		Integer b=new Integer("1");//1
		//instance method
		System.out.println(a.compareTo(b));
	}

	void test2() {

		System.out.println(a + b);
		print1();
		print2();

	}

}
