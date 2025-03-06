package com.shinhan.day04;

public class KoreanTest {

	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동","12345");
		
		System.out.println(k1.getNation());
		System.out.println(k1.getName());
		System.out.println(k1.getSsn());
		k1.setNation("미국");
		k1.setName("홍길동2");
		k1.setSsn("1234567890");
		System.out.println(k1.getNation());
		System.out.println(k1.getName());
		System.out.println(k1.getSsn());
	}

}
