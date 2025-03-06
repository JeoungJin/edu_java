package com.shinhan.day09;


//.java를 컴파일후 
//OuterClass$InnerClass.class
//OuterClass$SInnerClass.class
class OuterClass{
	//1.field
	int score1 = 10;
	String name = "자바";
	static int s_score = 100;
	
	//2.method
	//3.생성자
	//4.block
	//5.inner class
	class InnerClass {
		int score2 = 20;
		boolean name = true;
		void method2() {
			//이름충돌 : 내부에있는 것이 우선
			System.out.println(score1+score2 + ""+ OuterClass.this.name + name);
		}
	}
	//static은 객체생성없이 접근가능 
	//non-static은 객체생성을 해야 접근가능 
	static class SInnerClass {
	   int score3 = 30;
	   static int score4 = 40;
	   void method3() {
		   System.out.println(score3 + score4 + s_score);
	   }
	   static void method4() {
		   System.out.println(score4 + s_score);
	   }
	}
	
}
 


public class InnerClassTest {

	public static void main(String[] args) {
		//1.instance inner class사용법
		OuterClass.InnerClass aa = new OuterClass().new InnerClass();
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass aa2 =outer.new InnerClass();
		
		aa.method2();
		
		//2.static inner class사용법 
		
		//1)static method
		OuterClass.SInnerClass.method4();
		
		//2)instance method
		OuterClass.SInnerClass bb = new OuterClass.SInnerClass();
		bb.method3();
	}

}








