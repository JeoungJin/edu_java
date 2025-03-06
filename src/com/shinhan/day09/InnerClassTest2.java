package com.shinhan.day09;


class Window{
	
	//4) interface
	static interface MyInterface{
		void method1();
	}
	
	//1)instance inner class
	class InnerClass{
		
	}
	//2)static inner class
	static class InnerClass2{
		
	}
	//field...상위에 있는것이 바람직 
	String subject = "자바";
		
	void method(String param) {
		//3)Local Class
		String localVar = "지역변수";
		//localVar = "수정";
		class LocalClass{
			//local class에서 지역변수에 접근하면 Modifier는 final임 
			void call() {
				//localVar = "수정";
				System.out.println("field:" + subject);
				System.out.println("매개변수:" + param);
				System.out.println("지역변수:" + localVar);
			}
		}
		class LocalClass2{
			
		}
		LocalClass aa = new LocalClass();
		aa.call();

	}
}

public class InnerClassTest2 {

	public static void main(String[] args) {
		//1.instance inner class
		Window.InnerClass aa = new Window().new InnerClass();
		//2.static inner class의 instance field,method 사용
		Window.InnerClass2 bb = new Window.InnerClass2();;

		//익명구현class만들고 즉시실행 
		Window.MyInterface cc =  new Window.MyInterface() {
			public void method1() {
				System.out.println("익명구현class..override");
			}
		};
		(new Window.MyInterface() {
			public void method1() {
				System.out.println("익명구현class..override");
			}
		}).method1();
	}

}






