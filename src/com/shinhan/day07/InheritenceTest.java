package com.shinhan.day07;

import com.shinhan.day06.inheritence.Tire;
import com.shinhan.day06.inheritence.금호타이어;
import com.shinhan.day06.inheritence.한국타이어;

public class InheritenceTest {

	public static void main(String[] args) {
		f3();

	}

	private static void f3() {
		Tire[] t1 = new Tire[3];
		t1[0] = new Tire();
		t1[1] = new 한국타이어();
		t1[2] = new 금호타이어();
		print(t1);
	}

	private static void print(Tire[] t1) {
		//1)부모 = 자식
		//2)자식 = (자식)부모 
		for(Tire tire:t1) {
			System.out.println("-------------");
			//field는 type을 따른다 
			System.out.println(tire.color);
			//메서는 OVerride된것이 수행 
			tire.roll();
			
			if(tire instanceof 한국타이어 aa) {
				//한국타이어 aa = (한국타이어)tire;
				System.out.println("한국:" + aa.color);
			}else if(tire instanceof 금호타이어 aa) {
				//금호타이어 aa = (금호타이어)tire;
				System.out.println("금호:" + aa.color);
			}
		}
		
	}

	private static void f2() {
		
		//Child a = new Child();
		//1.자동형변환:  부모 = 자식 
		//field는 타입을 따른다. 
		Parent var1 = new Child();
		System.out.println(var1.a);
		//메서드는 재정의되었다면 instance를 따른다. 
		var1.method1();
		
		//2.강제형변환 : 자식 = (자식)부모 
		Child var2 = (Child)var1;
		System.out.println(var2.a);
		var2.method1();
		
	}

	private static void f1() {
		Child ch = new Child();
		ch.method1();
		ch.method2();
		System.out.println(ch.a);
		
	}

}
