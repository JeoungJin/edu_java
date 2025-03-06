package com.shinhan.day05;




//final : 최종임, 변경불가 
//1.field에 사용하면 값변경불가 
//2.method에 사용하면 재정의불가 
//3.class에 사용하면 상속불가 
public  class Phone {
	public String model;
	public int price;
	//값을 할당후 수정불가 : instance변수이므로  선언시 , 생성시 
	public final String company = "aa";
	public final String company2;
	//선언시 초기화가 필수(상수), 관례상 이름은 대문자로 사용한다. 
	public final static  String COMPANY3 = "cc";
	
	//생성자 접근권한:public, 생략, private
	public  Phone(){
		company2 = "bb";
	}
	private Phone(String s){
		company2 = s;
	}
	///접근제한자 Test
	
	//public>protected>생략(default)>private
	//모든패키지는 모든 class에서 접근가능
	public int a=10;
	//같은패키지는 모든 class에서 접근가능, 다른패키지이면 상속받으면 가능 
	protected int b=20;
	//default, modifier생략, 같은패키지에서만 접근가능 
	int c = 30;
	//private : class내부에서만 접근가능
	private int d=40;
	void test() {
		System.out.println(a+b+c+d);
		print1();
		print2();
		print3();
		print4();
		
	}
	public void print1() {
		
		System.out.println("phone class의 public method");
	}
	protected void print2() {
		System.out.println("phone class의 protected method");
	}
	void print3() {
		System.out.println("phone class의 default method");
	}
	private void print4() {
		System.out.println("phone class의 private method");
	}
	
}
