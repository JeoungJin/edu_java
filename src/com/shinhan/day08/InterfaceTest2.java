package com.shinhan.day08;

interface Z4{ 	void f4(); }

interface Z3{ 	void f3(); }

interface Z2 extends Z3, Z4{
	void f2();
}

interface Z{
	void f1();
}


class Student implements Z, Z2{
	public void f1() {}
	public void f2() {}
	public void f3() {}
	public void f4() {}
}



public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
