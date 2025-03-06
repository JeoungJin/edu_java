package com.shinhan.day06.inheritence;

public class BonusPointAccount extends Account{
    int bonusPoint;
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint){
		//명시적으로 부모의 생성자 호출 
		super(accountNo, ownerName, balance); 
		this.bonusPoint = bonusPoint;
	}
	//입금하다...Override(시그니처같아야한다.)
	//annotation : 컴파일러가 해석하는 주석 
	@Override
	public void deposit(int amount) {
		//부모의 코드호출 
		super.deposit(amount);
		//추가 
		bonusPoint += amount*0.001;
	}
	
	//출금하다...그대로 물려받아 사용
}
