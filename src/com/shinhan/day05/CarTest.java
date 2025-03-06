package com.shinhan.day05;

//cmd>java CarTest
//class load...static은 method영역으로 올라간다. 
public class CarTest {

	public static void main(String[] args) {
		
		System.out.println(Car.company);
		Car.print();
		
		//instance field와 method는 객체생성후 사용가능 
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println(c1.company);
		System.out.println(c2.company);
		c1.print();
		c2.print();
		
		
		System.out.println(c1.gas);
		//System.out.println(c1.speed);
        c1.gas = 10;
        //c1.speed=100;
        c1.setSpeed(200);
        System.out.println(c1.gas);
		//System.out.println(c1.speed);
        System.out.println(c1.getSpeed());
	}

}
