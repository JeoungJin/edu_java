//package정의
package com.shinhan.day05;

//다른패키지의 Employee를 사용ㅎ기위해 import
//import com.shinhan.day04.Calculator;
//import com.shinhan.day04.Employee;
import com.shinhan.day04.*;

public class PhoneTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee("aa", "부장", 1000);
		emp.print();
		Calculator cal = new Calculator();
		System.out.println(cal.plus(1, 2));
		
		System.out.println(Phone.COMPANY3);
		//불가 Phone.COMPANY3 = "dd";
		Phone p = new Phone();
		System.out.println(p.company);
		System.out.println(p.company2);
		//p.company = "dd";
		//p.company2 = "dd";
		
		//Integer의 최대값 
		//PI값 
		//Integer.MAX_VALUE = 100;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}

}
