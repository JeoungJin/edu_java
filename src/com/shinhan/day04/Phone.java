package com.shinhan.day04;

public class Phone {
	//1.field
	//private:정보은닉, 캡슐화한다. 
	private String model;
	private String company;
	private int price;
	
	
	//2.constructor
	//this : 객체자신을 의미 
	//1)매개변수이름과 field이름이 같은 경우 구분을 위해 
	//2)생성자의 Overloading에서 하나의 생성자가 다른 생성자호출시 
	Phone() {
		this( "AA", "Samsung",100 );
	}

	Phone(String model) {
		this(model, "S", 0);
	}

	Phone(String model, String company) {
		this(model, company, 0);
	}
	Phone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	//3.일반메서드
	public void print() {
		System.out.println("-------Phone정보-----");
		System.out.println("model=>" + this.model);
		System.out.println("company=>" + company);
		System.out.println("price=>" + price);
	}
	
	
	
	
}
