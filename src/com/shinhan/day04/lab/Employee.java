package com.shinhan.day04.lab;
//Object class의 toString()메서드 구현되어있다.....
//객체출력시 자동으로 toString()메서드 호출된다.  
//주소출력  패키지이름.class이름@hashCode
//재정의 가능하다(Override): 이름같고 매개변수같고 
//         ReturnType같고 접근지정자는 같거나 더 넓어져야한다. 
//public > protected > 생략 > private 
//public : 모든 패키지에서 접근가능 
//protected : 같은 패키지이면 접근가능 , 다른패키지이면 상속받으면 가능 
//생략 :  같은 패키지에서만 접근가능 
//private : 같은 class에서만 접근
public class Employee  {
	private String id;
	private String name;
	private int baseSalary;
	//일반적으로 생성자의 접근지정자는 class의  접근지정자와 같다
	public Employee(String id, String name, int baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	double getSalary(double bonus) {
		double salary = baseSalary + baseSalary * bonus ;
		return salary;
	}


	public String toString() {
		 
		return name
				+ "("
				+ id
				+ ") 사원의 기본급은 "
				+ baseSalary
				+ "원 입니다.";
	}
	
    
	
}
/*
 

5. 다음과 같은 형식으로 사원정보를 리턴하는 String toString() 메소드를 가지고 있다
  - "name(id) 사원의 기본급은 baseSalary원 입니다."

 
 메소드는 제한 없이 모두 호출할 수 있는 접근 제한자(public)를 사용한다.

*/
