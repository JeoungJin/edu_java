package com.shinhan.day03;

import java.util.Scanner;

public class LAB {

	public static void main(String[] args) {
		//hokeyGraphics( '$', 4, false); //함수호출 (값 전달)
		q5();

	}

	private static void q5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 역삼각형을 출력할 줄 수:");
		int su = sc.nextInt();
		for(int row=1;row<=su;row++) {
			for(int col=1;col<=su+1-row;col++) {
				System.out.print("*"); //옆으로 출
			}
			System.out.println(); //줄바꾸기 
		}
		sc.close();
		// 문제5. 입력 받은 수 만큼 ‘*’로 직각 역삼각형을 출력하는 프로그램을 작성하십시오.
		//결과>
		//직각 역삼각형을 출력할 줄 수: 10
		//1~10
		//1~9
		//1~8
		//....
		//1

		
	}

	/*
	 * 문제4. 아래와 같은 출력이 나오도록 StringUtil 클래스의 
	 * hokeyGraphics(char cell, int size, boolean isRect) 메소드를 완성한다. 
	 * hokeyGraphics 메소드는 cell 문자와 size 값을 이용하여 특정 모양을 출력한다. 
	 * isRect 값이 true 이면 사각형 모양을 출력하고, false 이면 삼각형을 출력한다. 
	 */
	//함수정의: 매개변수를 선언 
	public static void hokeyGraphics(char cell, int size, boolean isRect)
    {
        //특정 도형을 출력하는 메소드 구현
		if(isRect) {
			for(int row=1;row<=size;row++) {
				for(int col=1;col<=size;col++) {
					System.out.print(cell);
				}
				System.out.println();
			}
		}else {
			for(int row=1;row<=size;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(cell);
				}
				System.out.println();
			}
		}
		
    }

	
	private static void q3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. :");
		int total = 0;
		
		int end = sc.nextInt();
		int start;
		if(end%2==0) {
			start=2;
		}else {
			start=1;
		}
		for(int su=start;su<=end;su+=2) {	
			System.out.print(su + (su==end?"=":"+"));
			total += su;
		}
		System.out.println("결과 값 : " + total);
		sc.close();
		/*
		 * 문제3. 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 SumTest 클래스의 main 메쏘드를 완성하십시오. 
			a. 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
			- 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
			b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
			- 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
				숫자를 입력하세요. : 7
				결과 값 : 16

		 */
		
	}

	private static void q2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. :");
		String inputString = sc.nextLine();
		
		System.out.println("문자열의 길이:" + inputString.length());
		//abc def
		//대부분의 언어들은 index시작이 0이다
		//0<=abc def<7
		for(int i=0;i<inputString.length();i++) {
			System.out.println(inputString.substring(0, i+1).toUpperCase()); //<=  <
		}
		
		
		sc.close();
		/*
		 * 문제2. 문자열을 입력 받아서 아래와 같은 실행결과가 나타나도록 ForTest클래스의 main 메쏘드를 완성하십시오. 
		 * 입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다. 
		 * (단, 대문자로 출력해야 합니다.)
		 * 문자열을 입력하세요. : Bat Man
		 *1->1~1
		 *2->1~2
		 *3->1~3
		 */
		
	}

	private static void q1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요. :");
		int start = sc.nextInt();
		System.out.print("마지막 값을 정수로 입력하세요. :");
		int end = sc.nextInt();
		System.out.print("증가분을 정수로 입력하세요. :");
		int step = sc.nextInt();
		int total=0;
		
		for(int job=start;job<=end;job+=step) {
			total += job;
		}
		if(total>1000) {
			total += 2000;
		}
		System.out.printf("총합은 %d 입니다.", total); 
		
		sc.close();
		/*
		 * 문제1. 초기 값, 마지막 값, 증가분을 입력 받아서, 초기값부터 마지막 값까지, 
		 * 증가분씩 값을 증가시키면서 각 값들의 총합을 구하는 프로그램을 작성하세요. 
		 * 단, 합을 구한 결과가 1000을 넘으면, 결과에 2000을 한번 더 더하여 출력합니다. 
		 * 초기값을 정수로 입력하세요. : 1
			마지막 값을 정수로 입력하세요. : 10
			증가분을 정수로 입력하세요. : 1
			총합은 55 입니다.

		 */
		
	}

}
