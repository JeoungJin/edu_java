package com.shinhan.day04;

public class Employee{
	//1.field(멤버변수, static변수)
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	//2.Constructor(생성자:new하는 방식) : 값 초기화목적 
	public Employee(String name, String title, int baseSalary) {		
		this.name = name;
		this.title = title+"님";
		this.baseSalary = baseSalary;
		getTotalSalary();
	}
	//3.일반메서드 
	public void getTotalSalary() {
		//문자열비교에 주의~ ==는 주소비교이다. 값비교는 equals()사용
		if(title.equals("부장님")) {
			totalSalary = (int)(baseSalary + baseSalary*0.25);
		}else if(title.equals("과장님")) {
			totalSalary = (int)(baseSalary + baseSalary*0.15);
		} else {
			totalSalary = (int)(baseSalary + baseSalary*0.05);
		}
	}
	 public void print() {
		 System.out.printf("%s 직급의 %s씨의 본봉은 %d 원이고 총급여는 %d 원입니다.\n",
				  title, name,baseSalary,totalSalary );
	 }
	
}
 
