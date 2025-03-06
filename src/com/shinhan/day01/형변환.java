package com.shinhan.day01;

public class 형변환 {

	public static void main(String[] args) {
		 typeTest7();
		

	}
	private static void typeTest7() {
		String score="99";
		/* 기본형타입은 data를 저장, 정수와 실수타입은 연산, 비교가능 
		 * Wrapper Class : 기본형타입 + 기능추가 
		 * 1.byte =>Byte
		 * 2.short = >Short
		 * 3.char =>Character
		 * 4.int =>Integer
		 * 5.long =>Long
		 * 6.float =>Float
		 * 7.double =>Double
		 * 8.boolean =>Boolean
		 */
		
		int result = Integer.parseInt(score);
		long result2 = Long.parseLong(score);
		double result3 = Double.parseDouble(score);
		String b = "false";
		System.out.println(result + 1);
		System.out.println(result2 + 1);
		System.out.println(result3 + 1);
		System.out.println(Boolean.parseBoolean(b) == true);
	 
		int score2 = 200;
		String score3 = score2+"";
		String score4 =  String.valueOf(score2);
		System.out.println(score3 + 1);
		System.out.println(score4 + 2);
		
		
		String str = "12.345";
		double f = Double.parseDouble(str);
		System.out.println(f + 10);
		
	}
	private static void typeTest6() {
		int a=10;
		int b=3;
		
		System.out.println("더하기:" + (a+b));
		System.out.println("빼기"+(a-b));
		System.out.println("곱하기:" + a*b);
		System.out.println("몫:" +a/b);
		System.out.println("나머지:" +a%b);
		System.out.println("결과:" + (double)a/b);
	}
	private static void typeTest5() {
		//char는 자바의 기본형타입이다. 반드시 1문자만 가능 , 반드시 '로 작성 
		char ch = '자';
		//String은 자바의 class이다. 
		//java.base모듈/java.lang패키지/String.class
		//변경불가 , 고정문자열 
		//가변문자열을 원한다면 : StringBuffer, StringBuilder
		String s1 = "자바"; //컴파일시점에 객체가 만들어진다. 이미존재하는 리터럴은 다시생성안함 
		String s2 = new String("자바");//실행시점에 만들어진다. 
		String s3 = "자바";
		String s4 = new String("자바");
		String s5 = "이것이 \"자바\"다  'aaa' \\ \" \' \r\n A\tB   ";
		String s6 = """
				이것이 "자바"다
				{"키":"값 "}
				""";
		System.out.println(s5);
		s1 = s1 + "!!";  //새로운주소에 만들어진다.
		s3 = s3 + "!!";  //새로운주소에 만들어진다. 
		System.out.println(s1 == s3); //주소가 같은가?true
		System.out.println(s2 == s4); //주소가 같은가?false
		System.out.println(s1.equals(s3)); //값비교 
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		
	}
	private static void typeTest4() {
		//예외, char 타입보다 허용 범위가 작은 byte 타입은 char 타입으로 자동 변환될 수 없음
		char c; //2
		byte b=97; //1
		//강제변환
		c = (char)b;
		System.out.println(c);
		
		
	}
	private static void typeTest3() {
		byte a=10, b=20, c;
		int d;
		//수식에 있는 정수는 int로 자동변형된다. 
		//강제형변환
		c = (byte)(a + b);
		System.out.println(c);
		
		
		
	}
	private static void typeTest2() {
		//1.자동형변환 : 큰타입의 방 = 작은값
		//2.강제형변환 : 작은타입의 방 = (작은타입)큰값  
		//  data손실 가능성있음 
		//byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
		//       <char(2)<  
		byte var1 =  97  ; //-128~127
		short var2 = 130; //short, char는 자동형변환 불가 
		char var3 = 'a' ;  //2
		int var4  = 98; //4
		long var5=97;
		float var6 ;
		double var7;
		
		var1 = (byte)var3;
		var3 = (char)var4;
		System.out.println(var1);
		System.out.println(var3);
		
	}
	private static void typeTest() {
		//1.자동형변환 : 큰타입의 방 = 작은값
		//2.강제형변환 : 작은타입의 방 = (작은타입)큰값  
		//byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
		//byte(1)<char(2)<int(4)<long(8)<float(4)<double(8)
		byte var1 = 97;
		short var2 = 97; //short, char는 자동형변환 불가 
		char var3 ; 
		int var4 ;
		long var5=97;
		float var6 ;
		double var7;
		
		var6 = var5;
		System.out.println(var6);
		
	}

}
