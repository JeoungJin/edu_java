package com.shinhan.day05;

 /*
 * class : 틀,template, object들을 만들기 위한 정의 , object들의 공통특성 
 * object : class를 이용해서 만든 독립된 개체 (멤버마다 field값이 다르다),new로 생성
 */
//JavaBeans기술 Spec :field의 접근지정자(Modifier) : private , 접근은 getter/setter
public class Computer extends Object {
	//1.field(특징, 속성, 변수:멤버변수,static변수)
	private String productName;
	private String os;
	private int price;
	static int count;
	
	//2.constructor...new시에 자동호출되는 함수(method), 
	//이때 자동초기화(기본형:정수:0 실수:0.0 boolean:false,객체는null)
	//정의가 없으면 컴파일시에 자동으로 추가된다. Computer(){}
	//정의하면 컴파일시에 자동으로 추가되지않는다.
	//초기화가 목적이다.
	//Overloading:이름같고 매개변수 사양이 다르다. 
	//매개변수이름과 field이름이 충돌
	//구분을 하기위해 객체자신을 this
	//하나의 생성자가 같은 이름의 다른모양의 생성자를 호출 this()
	//생성자를 호출하는 문장은 반드시 첫줄만 작성가능하다.  
	Computer(){
		this(null,null,0); 
		System.out.println("Computer...default생성자");
		
	}
	Computer(String os, String productName){
	    this(productName,os, 0);	 		 
	}
	Computer(String productName,String os,int price  ){
		count++;
		this.productName = productName;
		this.os = os;
		this.price = price;
		System.out.println("Computer생성됨");
	}
	//3.method..일반적으로 외부에 접근하기위해 public으로 공개 
	//함수는 반드시 returnType정의해야한다. 
	
	//메서드는 이름과 returnType이 필수이다.
	//return이 없으면 void 
	//{}는 block...문장들의 묶음 
	//method Overloading:이름같고 매개변수 사양이 다르다. 
	void sum() {
		System.out.println("argument가 없는 sum method");
	}
	int sum(int a , int b) {
		System.out.println("argument가 2개 sum method");
		return a+b;
	}
	//가변길이 매개변수 (배열)
	int sum(int...arr) {
		int total = 0;
		for(int su:arr) {
			total += su;
		}
		return total;
		//total++;
	}
	String sum(int a , int b, int c) {
		System.out.println("argument가 3개 sum method");
		return a+b+c+"";
	}
	
	public void infoPrint() {
		System.out.println("-----Computer정보---");
		System.out.println(getProductName() + ":" + productName);
		System.out.println(getOs() + ":" + os);
		System.out.println(getPrice() + ":" + price);
		
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    
	//4.block
	//5.inner class
	
	
}



