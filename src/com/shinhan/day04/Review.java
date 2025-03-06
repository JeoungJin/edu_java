package com.shinhan.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) {
		System.out.println("hello main");
	}

	public void f2() {
		System.out.println("Hello f2");
	}
}

public class Review {

	public static void main(String[] args) {
		System.out.println("Review main시작");
//		f();
//		f3();
//		f4();
//		f5();
//		Hello aa = new Hello();
//	    aa.f2();	
		q9();
		System.out.println("Review main끝");

	}

	// java.lang패키지가 아닌곳에 있는 class들은 반드시 import후 사용한다.
	private static void q9() {
		Scanner sc = new Scanner(System.in);
		menuDisplay();
		boolean isLooping = true;
		int studentCount = 0;
		int[] score = null; //null은 아직 결정된 값이 없음을 의미,지역변수는 초기화하지않으면 사용불가  
		 
		while (isLooping) {
			System.out.print("선택>>");
			int jobSelect = sc.nextInt();
			// if(jobSelect==5) break;
			switch (jobSelect) {
				case 1 -> {
					studentCount = f_insertCount(sc);
					score = new int[studentCount];
				}
				case 2 -> {
					f_insertScore(sc, score);
				}
				case 3 -> {
					f_printScore(score);
				}
				case 4 -> {
					f_display(score);
				}
				case 5 -> {
					isLooping = false;
				}
				default -> {
					System.out.println("잘못된 작업선택입니다. 다시선택~");
				}
			}
		}
		sc.close();
	}

	private static void f_display(int[] score) {
		if ( !f_countCheck(score)) return;
		int total = 0;
		int max = Integer.MIN_VALUE;
		for(int data:score) {
			total += data;
			max = data>max?data:max;
		}
		System.out.println("최고 점수:"+ max);
		System.out.println("평균 점수:" + 1.0*total/score.length);
		
	}
	private static void f_printScore(int[] score) {
		if ( !f_countCheck(score)) return;		
		for(int i=0;i<score.length;i++) {
			System.out.printf("scores[%d]:%d\n", i, score[i]); 
		}
	}
	private static boolean f_countCheck(int[] score) {
		if(score==null) {
			System.out.println("학생수를 먼저 입력해야 합니다.");
			return false;
		}
		return true;
	}
	private static void f_insertScore(Scanner sc, int[] score) {
		if ( !f_countCheck(score)) return;
		for(int i=0;i<score.length;i++) {
			System.out.printf("scores[%d]>", i);
			score[i] = sc.nextInt();
		}
		
	}

	
	
	
	// f_insertCount는 함수이름
	// Scanner sc2는 매개변수, argument, parameter
	// int는 return값의성격
	private static int f_insertCount(Scanner sc2) {
		System.out.println("학생수>>");
		return sc2.nextInt();

	}

	private static void menuDisplay() {
		System.out.println("------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------------------");

	}

	private static void q8() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int total = 0;
		int cnt = 0;
		for (int[] datas : array) {
			for (int data : datas) {
				cnt++;
				total += data;
			}
		}
		System.out.println("총점=" + total);
		System.out.println("평균=" + (double) total / cnt);

	}

	private static void q7() {
		int[] array = { 1, 999, 5, 3, 8, 2, 100 };
		int max = Integer.MIN_VALUE;
		for (int su : array) {
			/*
			 * if(su>max) { max = su; }
			 */
			max = su > max ? su : max;
		}
		System.out.println(max);
	}

	private static void f5() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		System.out.println(array.length); // 2차원 : 1차원이 1차원을 참조
		System.out.println(array[2].length);
		for (int[] datas : array) {
			for (int data : datas) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
	}

	private static void f4() {
		String[] arr = new String[3];
		System.out.println("*" + arr[0] + "*");
		System.out.println("*" + arr[1] + "*");
		System.out.println("*" + arr[2] + "*");

	}

	private static void f3() {
		// data type
		// 1.기본형:byte < short,char < int < long< float<double
		// boolean
		// 2.참조형:배열, class, enum, interface , ......
		int[] arr = { 10, 20, 30 }; // new int[] 생략가능
		// arr = new int[4];//자동초기화
		// arr = new int[] {10,20,30};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void f() {
		System.out.println("Review f");
	}

}
