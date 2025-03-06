package com.shinhan.day04;

import java.util.Calendar;
import java.util.Scanner;

public class EnumTest {
    //상수가 목적에 맞게 분리되지않아서 로직오류발생 
	static final int MONDAY = 10;
	static final int SUCCESS = 1;
	
	public static void main(String[] args) {
		f4();

	}

	private static void f4() {
		// 오늘은 무슨요일? 1~7 (일요일,월~토요일)
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		Week today = null;
		switch(week) {
		case 1:
			today = Week.SUNDAY;break;
		case 2:
			today = Week.MONDAY;break;
		case 3:
			today = Week.TUESDAY;break;
		case 4:
			today = Week.WEDNESDAY;break;
		case 5:
			today = Week.THURSDAY;break;
		case 6:
			today = Week.FRIDAY;break;
		case 7:
			today = Week.SATURDAY	;break; 
			
		}
		System.out.println(today + "--" + today.name() + "--" + today.ordinal());
		
	}

	private static void f3() {
		Week[] arr = Week.values();
		for(Week week:arr) {
			System.out.println(week + "--" + week.name() + "--" + week.ordinal());
		}
		Week w = Week.MONDAY;
		System.out.println(w == Week.MONDAY?"월":"기타");
	 
		
	}

	private static void f2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일입력(1)>>");
		int su = sc.nextInt();
		
		System.out.println(su==SUCCESS?"월요일":"기타");
		
	}

	private static void f1() {
		//상수:한번할당후 수정불가 
		//예, 원의 넓이 r*r*PI
		int r = 10;
		System.out.println(Math.PI);
		double area = r*r*Math.PI;
		System.out.println(area);
		
		
	}

}
