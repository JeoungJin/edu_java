package com.shinhan.day07;

public class StudentTest {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		//0.객체생성없이 사용(static)
		//System.out.println(HighSchool.company1);
		//System.out.println(HighSchool.company5);
		//System.out.println(HighSchool.COMPANY6);
		//System.out.println(HighSchool.COMPANY7);
		//HighSchool.company1 = "변경";
		//System.out.println(HighSchool.company1);
		//1.객체참조변수 선언(instance)
		HighSchool s1;
		//2.객체생성
		s1 = new HighSchool("고딩1",18, 100000);
		//3.객체사용
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getPocketMoney());
		
		
	}

	private static void f1() {
		//0.객체생성없이 사용
		System.out.println(Student.company1);
		System.out.println(Student.company5);
		System.out.println(Student.COMPANY6);
		System.out.println(Student.COMPANY7);
		Student.company1 = "변경";
		
		//1.객체참조변수선언
		Student st1,st2;
		//2.객체생성
		st1 = new Student();
		st2 = new Student();
		//3.객체사용 
		st1.setName("홍길동");
		st1.setAge(20);;
		//st1.company2 = "aaa";
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		System.out.println(st2.getName());
		System.out.println(st2.getAge());
		System.out.println(st2.company2);
		System.out.println(st2.company3);
		System.out.println(st2.company4);
		System.out.println(Student.company5);
		System.out.println(Student.COMPANY6);
		System.out.println(Student.COMPANY7);
		
		
	}

}
