package com.shinhan.day11;

import lombok.NoArgsConstructor;
import lombok.val;

//class
public class Service {

	//field
	int score;
	//constructor
	public Service(){
		
	}
	
	
	
	@Override
	@PrintAnnotation
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@PrintAnnotation
	public void method1() {
       System.out.println("method1실행");
	}
	//value속성은 생략가능 
	@PrintAnnotation("#")
	public void method2() {
		 System.out.println("method2실행");
	}
	@PrintAnnotation(value = "@", number = 20 )
	public void method3() {
		 System.out.println("method3실행" );
	}

}
