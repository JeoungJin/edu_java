package com.shinhan.day07;

//extends는 상속 
//자식생성시 부모도 생성된다. 
public class HighSchool extends Student{
    //1.field
	private int pocketMoney;
	//2.constructor
	HighSchool(String name, int age, int pocketMoney){
		//1)default로 무조건 부모의 default생성자호출 
		//super();
		//2)명시적으로 부모의 생성자 호출 
		super(name, age);
		System.out.println("---------");
		System.out.println("HighSchool생성자");
	    //setName(name);
	    //setAge(age);
	    this.pocketMoney = pocketMoney;
	}
	//3.method
	public int getPocketMoney() {
		return pocketMoney;
	}
	public void setPocketMoney(int pocketMoney) {
		this.pocketMoney = pocketMoney;
	}
	
	//4.block
	//5.inner class 
}
