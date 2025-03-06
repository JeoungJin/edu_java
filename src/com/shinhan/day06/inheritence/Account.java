package com.shinhan.day06.inheritence;

/*
 * public:모든패키지의 모든 class접근가능 
 * protected : 같은패키지의 모든 class접근가능 , 다른패키지이면 상속받으면 가능 
 * 생략 : 같은패키지의 모든 class접근가능 
 * private : 해당class에서만 접근가능 
 */

//부모class == 상위class == super class
public class Account {
	// field
	String accountNo;
	String ownerName;
	int balance;

	// Java관련기술들은 JavaBeans기술사용 : default생성자가 있어야한다.
	// JSp, Servlet, Spring, Mybatis, JPA, .....

	public Account() {

	}

	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount+1;
	}

	public int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔고부족 출금불가...");
			return 0;
		}

		balance -= amount;
		return amount;
	}

	void print() {
		System.out.println("===================");
		System.out.println("Account에 추가됨");
		System.out.println("===================");
	}
	
	
}
