package com.shinhan.day06;

//modifier
//1)접근권한 : public > protected > 생략(default) > private 
//private는 외부에서 접근불가이므로 외부 접근이 필요하면 반드시 접근하는 기능을 제공해야한다. (setter/getter)
//2)활용방법 : static, final, abstract, synchronized, sealed, ...
public class Account {
	//변수
	private int balance;
	//상수: static=>class소유 final=>최종(값 변경불가)
	//선언시 또는 static block에서 반드시 초기화한다. 
	private static final int MIN_BALANCE  ;
	private static final int MAX_BALANCE  ;
	static {
		MIN_BALANCE = 0;
		MAX_BALANCE = 1000000;
	}
	public void setBalance(int balance){
		if(balance >=MIN_BALANCE && balance<=MAX_BALANCE) {
		    this.balance = balance;
		}
	}
	public int getBalance(){
		return balance;
	}
	
}
/*
19. 은행 계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있습니다. 
balance 필드는 
음수값이 될 수 없고, 최대 백만 원까지만 저장할 수 있습니다. 외부에서 balance 필드를 마음대로 
변경하지 못하도록 하고, 0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록 Account 클래
스를 작성해보세요.
➊ Setter와 Getter를 이용
➋ 0과 1,000,000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
➌ Setter의 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지
*/
