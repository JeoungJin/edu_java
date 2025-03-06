package com.shinhan.day05;


//Service : 업무로직 
public class BookMgr {
	Book[] booklist;

	public BookMgr(Book[] booklist) {
		super();
		this.booklist = booklist;
	}
	public void printBookList(){
		System.out.println("=== 책 목록 ===");
		for(Book book:booklist) {
			System.out.println(book.getTitle());
		} 
	}
	public void printTotalPrice(){
		System.out.println("=== 책 가격의 총합 ===");
		int total=0;
		for(Book book:booklist) {
			total += book.getPrice();
		}
		System.out.printf("전체 책 가격의 합 : %d", total);
	}
}
/*
 

3. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 

*/