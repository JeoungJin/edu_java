package com.shinhan.day06.inheritence;

public class CreditLineAccount extends Account{
	int creditLine;
	CreditLineAccount(String accountNo, 
			String ownerName, int balance, 
			int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine = creditLine;
	}
	//인출하다의 기능 재정의(Override)
	//이름같고 매개변수 타입과 개수같고 return같고 modifier가 같거나 더 넓어야한다.
	//Overloading( 추가) : 이름같고 매개변수 사양이 다르다. 
	int withdraw(int a, int b){
		return a+b;
	}
	public int withdraw(int amount2) {
		if (balance+creditLine < amount2) {
			System.out.println("잔고부족 출금불가...");
			return 0;
		}

		balance -= amount2;
		return amount2;
	}
}
