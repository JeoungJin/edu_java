package com.shinhan.day01;

public class 변수의범위 {

	//static변수: class의 모든메서드에서 공유한다. (c언어의 share변수)
	static int score=300;
	
	public static void main(String[] args) {
		
		System.out.println("class변수접근:" + score);//300
		//메서드내의 변수는 지역변수이다. 메서드종료시 제거된다. 
		int score=100;
		method1();
		method2();
		System.out.println("------------------------------");
		System.out.println("main에서 출력:" + score); //100
		System.out.println("main에서 출력:" + 변수의범위.score);//300

	}
    //지역변수는 선언후 초기화없고 사용하면 오류
	//변수는 반드시 초기화후 사용해야한다. 
	private static void method2() {
		String grade="A학점";
		int score=88;
		String title; //초기화안됨 
		if(score<90) {
			title = "!!!!!!"; //초기화함 
			grade = "B학점";
		}else {
			title = "&&&&&&"; //초기화함
		}
		System.out.println(title + "당신의 점수는 " + score + " 학점은 " + grade);
	}

	private static void method1() {
		int score=200;
		System.out.println("method1에서 출력:" + score);//200
		System.out.println("method1에서 출력:" + 변수의범위.score);//300
	}

}
