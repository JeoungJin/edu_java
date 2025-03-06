package com.shinhan.day05;

class Cup{
	
	
	String name;
	void print() {
		
	}
	void print(String s) {
		
	}
	int print(String s, int a) {
		return 0;
	}
	static int a=10;
	int b=20;
	static {
		a=30;
	}
	final String s1 = "자바";
	final String s2;
	static final String S3 = "자바"; //선언시 초기화
	static final String S4;
	static {
		int i = 100;
		S4 = "자바" + i;
	}
	Cup(String name){
		this.name = name;
		s2 = "java2";
		
	}
}

public class SingleToneTest {
	//구성요소는 5가지이지만 필수는 아니다. 순서 상관없음 
    //1.field
	//2.constructor
	//3.method
	//4.block
	//5.inner class
	public static void main(String[] args) {
		//지역변수는 method내에서만 사용되는 변수 , 반드시 초기화후 사용한다. 
		int i =0 ;
		System.out.println(i);
		
		SingleTone a = SingleTone.getInstance();
		SingleTone b = SingleTone.getInstance();
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(a==b);

	}

}
