package com.firstzone.dbtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MyTest {

	@BeforeAll
	public static void f2() {
		System.out.println("-------@BeforeAll----");
	}
	@BeforeEach
	public void f3() {
		System.out.println("-------@@BeforeEach----");
	}
	
	@DisplayName("aa")
	@Test
	public void f1() {
		String name = "아메리카노";
		System.out.println(name);
		Assertions.assertEquals(name,  "아메리카노");
	}
	@DisplayName("aa")
	@Test
	public void f4() {
		String name = "아메리카노";
		System.out.println(name);
		Assertions.assertEquals(name,  "아메리카노");
	}
	
}
