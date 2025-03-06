package com.shinhan.day09;

interface RemoteControl {
	public abstract void turnOn();

	void turnOff();
}

class ARemoteControl implements RemoteControl {
	public void turnOn() {
		System.out.println(getClass().getSimpleName() + "turnOn");
	}

	public void turnOff() {
		System.out.println(getClass().getSimpleName() + "turnOff");
	}
}

class BRemoteControl implements RemoteControl {
	public void turnOn() {
		System.out.println(getClass().getSimpleName() + "turnOn");
	}

	public void turnOff() {
		System.out.println(getClass().getSimpleName() + "turnOff");
	}
}

public class 익명구현class연습2 {

	 
	public static void main(String[] args) {
		 
	 	work(new ARemoteControl());
		work(new BRemoteControl());

		int score = 100;

		class LocalClass {
			void f() {
				// score++;
				System.out.println("score=" + score);
			}
		}
		 
		// score++;
		LocalClass local = new LocalClass();
		 
		local.f();

		System.out.println("score=" + score);
		work(new RemoteControl() {
			// 익명구현class는 local class임
			@Override
			public void turnOn() {
				// 주의 : 지역변수변경불가 score++;
				System.out.println("익명구현class....turnOn" + score);
			}

			@Override
			public void turnOff() {
				System.out.println("익명구현class....turnoff");

			}
		});

	}

	public static void work(RemoteControl remote) {
		System.out.println("--------------------");
		remote.turnOn();
		remote.turnOff();
	}

}
