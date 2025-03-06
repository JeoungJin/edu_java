package com.shinhan.day10;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		method3();
	}

	private static void method3() {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("[2]인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("[1]숫자로 변환할 수 없음");
			} finally {
				System.out.println("[0][1][2]" + value);
			}
		}

	}

	private static void method2() {
		try {
			new ExceptionTest2().method1();
		} catch (ClassNotFoundException aa) {
			System.out.println(aa.getMessage());
		} catch (Exception aa) {
			System.out.println(aa.getMessage());
		}

	}

	public void method1() throws NumberFormatException, ClassNotFoundException {

	}

	public static void main2(String[] args) {
		try {
			f1();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} finally {
			System.out.println("***********반드시**********");
		}
		System.out.println("----main end--");
	}

	private static void f1() throws MyException {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID>>");
		String id = sc.next();
		if (id.length() > 5) {
			// 강제로 Exeption발생하기 (throw)
			throw new MyException("ID는 5자리 이하이어야한다");
		}
		sc.close();
	}

}
/*
 * Exception발생 : 자동, 강제(throw) 1)checked---일반Exception 2)unchecked
 * ---RuntimeException
 * 
 * Exception처리 1)처리 : try~catch 2)떠넘기기 : throws
 */
