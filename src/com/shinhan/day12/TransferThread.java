package com.shinhan.day12;

//계좌이체Thread: 공유영역의 lee계좌 ->sung계좌로 12번 이체  
public class TransferThread extends Thread {

	ShareArea shareArea;
	TransferThread(String threadName, ShareArea shareArea){
		super(threadName);
		this.shareArea = shareArea;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=12; i++) {
			
			//동기화 블럭 : 공유영역을 사용중일때 다른 thread가 접근금지 
			/*synchronized (shareArea) {
				int amount = shareArea.lee.withdraw(100);
				System.out.println(amount + "만원 lee계좌에서 출금");
				shareArea.sung.deposit(amount);
				System.out.println(amount + "만원 sung계좌에서 입금");
				System.out.println(currentThread().getName()+ "-------------------------");
			}*/
			shareArea.transfer();
			
			
		}
	}

}





