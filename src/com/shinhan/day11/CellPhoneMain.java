package com.shinhan.day11;

public class CellPhoneMain {
	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		//Exception처리함 
		try {
			myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 
		System.out.println(myPhone);
		System.out.println(yourPhone);
	} 

}
/*
<<CellPhoneMain 실행결과>>
충전 시간 : 20분
남은 배터리 양 : 60.0
통화 시간 : 300분
남은 배터리 양 : 0.0
충전 시간 : 50분
남은 배터리 양 : 100.0
통화 시간 : 40분
남은 배터리 양 : 80.0
통화시간입력오류
동일 모델입니다. 
*/