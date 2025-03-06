package com.shinhan.day06.inheritence;

/*
 * public:모든패키지의 모든 class접근가능 
 * protected : 같은패키지의 모든 class접근가능 , 다른패키지이면 상속받으면 가능 
 * 생략 : 같은패키지의 모든 class접근가능 
 * private : 해당class에서만 접근가능 
 */

//부모class == 상위class == super class
public class CheckingAccount extends Account{
	// field 추가 
	String cardNo;
	public CheckingAccount() {
		super(null,null,0);
	}
	 
	//생성자를 정의하면 default생성자가 자동으로 만들어주지않음 
	public CheckingAccount(String accountNo, 
			String ownerName, int balance, 
			String cardNo) {
		//1)기본:default생성자호출 : 부모에 default생성자정의 
		//2)명시적으로 부모생성자 호출 
	    super(accountNo,ownerName,balance);
		this.cardNo = cardNo;
	}
	//method 추가 
	int  pay(String cardNo, int amount) {
		if(cardNo.equals(this.cardNo)) {
			return withdraw(amount);
		}
		System.out.println("카드번호 오류");
		return 0;
	}
	
	 

}




