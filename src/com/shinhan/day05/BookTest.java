package com.shinhan.day05;


//Controller : 사용자가 요청을 하면 처리~~업무는 service를 통해서 수행 
public class BookTest {

	public static void main(String[] args) {
		//배열생성 : 이름은 하나, 같은 타입의 여러개의 값을 저장, 갯수모르면 생성불가 
		Book[] b = new Book[5];
		//Book객체생성	
		b[0] = new Book("Java Program",30000);
		b[1] = new Book("JSP Program",25000);
		b[2] = new Book("SQL Fundamentals",20000);
		b[3] = new Book("JDBC Program",32000);
		b[4] = new Book("EJB Program",25000);
		
		BookMgr bm = new BookMgr(b);
		bm.printBookList();
		bm.printTotalPrice();


	}

}
