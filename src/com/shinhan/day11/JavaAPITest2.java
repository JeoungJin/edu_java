package com.shinhan.day11;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shinhan.day10.Student;


public class JavaAPITest2 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		method8();
	}
	
	
	private static void method8() throws IOException {
		Class cls = JavaAPITest2.class;
		URL url =  cls.getResource("img/umbrella.jpg");
		System.out.println(url.getPath());
		
		InputStream is = cls.getResourceAsStream("img/문자셋 연습.txt");
		int i;
		
		while((i = is.read())!=-1) {
			System.out.print((char)i);
		}
		
		
		
	}


	private static void method7() {
		method6(CellPhone.class);
		System.out.println("-------------------");
		method6(Student.class);
	}


	private static void method6(Class aa) {
		Field[] arrField = aa.getDeclaredFields();
		for(Field field:arrField) {
			System.out.println(field.getName());
			 
		}
		
	}
	private static void method5() {
		String email = """
				8888888888888888888888
				wed0406@daum.com 
				mmmmmmmmm  
				zzilre1004@naver.com 
				aaaaaa
				8888888888888888888888
				""";
		String regExp = "(\\w+)@\\w+\\.\\w+";
		
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(email);
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println("--------------------");
		}
		
	}
	private static void method4() throws ClassNotFoundException {
		//리플렉션 : class의 메타정보얻기 
		Class<?> cls1 = CellPhone.class;
		Class<?> cls2 = Class.forName("com.shinhan.day11.CellPhone");
		CellPhone phone = new CellPhone("ABC");
		Class<?> cls3 = phone.getClass();
		
		Constructor[] arr1 = cls1.getDeclaredConstructors();
		for(Constructor cons:arr1) {
			System.out.println(cons.getParameterCount());
			
			Class[] aa = cons.getParameterTypes();
			for(Class bb:aa) {
				System.out.println(bb.getName());
			}
			System.out.println("-------------");
			
		}
		
		
		
		
	}

	private static void method3() {
		String subject = "JavaD";
		//^ : 시작
		//[^] : 제외 
		//$ : 끝
		String regExp1 = "^J\\w+[^ABC]$";
		boolean result = Pattern.matches(regExp1, subject);
		System.out.println(result);
		
	}

	private static void method2() {
		String email = "wed0406@daum333333.5555";
		String regExp1 = "\\w+[@#]?\\w{5,}\\.\\w*";
		
		boolean result = Pattern.matches(regExp1, email);
		System.out.println(result);
		
	}

	private static void method1() {
		//정규표현식
		String phoneNumber = "010-1234-5678";
		//000, 111,010,.....
		String s1 = "com/shinhan/day11/CellPhone.java";
		String s2 = "com\\shinhan\\day11\\CellPhone.java";
		
		//String regExp1 = "[01]{3}-[0-9]{3,4}-\\d{4}"; //\\->\
		String regExp1 = "([01]{3})-(\\d{3,4})-(\\d{4})"; //\\->\
		boolean result = Pattern.matches(regExp1, phoneNumber);
		
		//[]:선택
		//- : 범위
		//+ : 1개이상
		//* : 0개이상
		//? : 0, 1
		//[0-9a-zA-Z] : \w
		//[0-9] : \d
		//. : 임의의 1문자
		//() : group 
		String email = "wed0406@daum.net  wed0406@daum.net";
		String regExp2 = "(\\w+)@(\\w+\\.\\w+)";
		result = Pattern.matches(regExp2, email);
		System.out.println(result);
		
		Pattern pattern1 = Pattern.compile(regExp1);
		Pattern pattern2 = Pattern.compile(regExp2);
		
		Matcher matcher1 = pattern1.matcher(phoneNumber);
		Matcher matcher2 = pattern2.matcher(email);
		
		while(matcher1.find()) {
			System.out.println(matcher1.group());
			System.out.println(matcher1.group(1));
			System.out.println(matcher1.group(2));
			System.out.println(matcher1.group(3));
		}
		
		while(matcher2.find()) {
			System.out.println(matcher2.group()); //전체 
			System.out.println(matcher2.group(1)); //첫번째 ()
			System.out.println(matcher2.group(2)); //두번째 ()
		}
		
		
		
	}

}







