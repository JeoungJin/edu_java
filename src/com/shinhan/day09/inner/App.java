package com.shinhan.day09.inner;

public class App {

	public static void main(String[] args) {
		Button.ClickListener aa = new SearchButtonListener();	
		Button.ClickListener bb = new CloseButtonListener();
		action(aa);
		action(bb);
		action(new SearchButtonListener());
		
		//익명구현class
		Button.ClickListener cc = new Button.ClickListener() {
			void call() {
				System.out.println("익명구현class에서 함수추가");
			}
			@Override
			public void onClick() {
				System.out.println("익명구현class만들기..onClick()재정의");
				call();
			}}; 
		action(cc);
		action(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("익명구현class만들기2..onClick()재정의");
			}
		});

	}
	public static void action(Button.ClickListener listener) {
		Button 아무거나 = new Button();
		아무거나.setMyListener(listener);
		아무거나.click();
	}

}
