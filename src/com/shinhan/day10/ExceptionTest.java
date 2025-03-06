package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		//Stream : 1byte씩
		//Reader,Writer : 2byte씩
		try(FileReader fi = new FileReader("src/com/shinhan/day10/Student.java")) {
			
			int i;
			while((i = fi.read())!=-1) {
				System.out.print((char)i);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("--------------------END-------------------");
	}
	
	public static void main5(String[] args) {
		FileInputStream fi = null;
		try {
			int a=10/0;
			fi = new FileInputStream("src/com/shinhan/day10/Student.java");
			//파일읽기
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수없음");
		} finally {
			//자원반납(file은 close, DB close) 
			try {
				if(fi!=null) fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	
	
	//Exception처리하지않고 떠넘기기, 호출한 곳으로 간다. : throws 
	public static void main4(String[] args) throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day10.Student2");
		System.out.println(cls.getModifiers());
		System.out.println(cls.getSimpleName());
		System.out.println("----------END------------------");
	}
	//Exception처리함:try~catch~finally
	public static void main3(String[] args) {
		try {
			Class cls = Class.forName("com.shinhan.day10.Student2");
			
			System.out.println(cls.getModifiers());
			System.out.println(cls.getSimpleName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main2(String[] args)  {
		try {
			f5();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지않음..이름확인");
		} catch (IOException e) {
			System.out.println("IO 오류");
		}
		System.out.println("=========main END(정상종료)=========");
	}

	private static void f5() throws IOException {
		// 1)RuntimeException(예외처리필수가 아님) - NumberFormatException, ArrayIndexOutOfBoundsException.....
		// 2)일반Exception(필수) - 컴파일시 Exception처리가 되어있는지 check 한다. 
		//   (a)내가처리한다. (b)떠넘긴다. : 함수의 선언부에 throws키워드 사용 (이 함수를 부른곳으로 떠넘기기)
		FileReader fr = new FileReader("src/com/shinhan/day10/Student.java");
		int i;
		 
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

	private static void f4() {
		// RuntimeException(예외처리필수가 아님), 일반Exception(필수)
		int a = 10;
		int[] arr=new int[5];
		String score = "100점";
		try {
			int iScore = Integer.parseInt(score);
			
			arr[5] = 100;
			arr[0] = 100;
			System.out.println(a / 0);
		} catch (NumberFormatException ex) {
			System.out.println("반드시 숫자형태의 문자열이어야 한다.");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("index범위벗어남");
		}catch (NullPointerException ex) {
			System.out.println("null은 객체가 생성되지않음을 의미..사용불가");
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누기 불가");
		} catch (Exception ex) {
			System.out.println("기타 Exception");
		} finally {
			System.out.println("반드시 수행하는 문장들~");
		}

	}

	private static void f3(int b) {
		// 프로그램은 실행하다가 오류가 날수있다. 프로그램중단된다.
		// Exception
		// 1)RuntimeException--컴파일시 Exception처리 check하지않음
		// 2)일반 Exception
		int a = 10;
		// int b=0;
		// 예외가 발생하면?
		try {
			// a.예외가 발생할 가능성이 있는 문장들
			System.out.println(a / b); // 오류발생(Exception)...프로그램중단을 막을수있다.
		} catch (ArithmeticException ex) {
			// b.예외처리한다.
			System.out.println("정수는 0으로 나누기불가" + ex.getMessage());
		} finally {
			System.out.println("예외발생 또는 정상일때 모두 수행된다");
		}
		System.out.println("method END");
	}

	private static void f2() {
		// 프로그램은 실행하다가 오류가 날수있다. 프로그램중단된다.
		// Exception
		// 1)RuntimeException--컴파일시 Exception처리 check하지않음
		// 2)일반 Exception
		int a = 10;
		int b = 0;
		if (b != 0) { // 예외가 발생하지않도록 로직을 수정(오류처리로직과 업무로직이 섞여있다)
			System.out.println(a / b);
		}
		System.out.println("method END");
	}

	private static void f1() {
		// 프로그램은 실행하다가 오류가 날수있다. 프로그램중단된다.
		// Exception
		// 1)RuntimeException--컴파일시 Exception처리 check하지않음
		// 2)일반 Exception
		int a = 10;
		int b = 0;
		System.out.println(a / b); // 오류발생(Exception)...프로그램중단을 막을수있다.
		System.out.println("method END");
	}

}
