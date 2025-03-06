package com.firstzone.dbtest;

import java.util.List;

public class EmpView {

	public static void display(List<EmpDTO> emplist) {		
		System.out.println("====모든 직원조회====[" + emplist.size() + "건]");
		
		for(EmpDTO emp:emplist) {
			System.out.println(emp);
		}
	}
	public static void display(EmpDTO emp) {		
		System.out.println("====1건 직원조회====");
	    System.out.println(emp==null?"직원없음":emp);
	    System.out.println("입사일은 "  );
 
	}
	public static void display(String message) {		
	    System.out.println("[알림]"+ message);
 
	}
}



