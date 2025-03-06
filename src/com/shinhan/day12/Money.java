package com.shinhan.day12;

import lombok.ToString;
 
@ToString
public class Money {
    int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
        //더하기 구현
    	return new Money(amount + money.amount);
    }
    public Money minus(Money money) {
        //빼기 구현
    	return new Money(amount - money.amount);
    }
    public Money multiply(Money money) {
        //곱하기 구현
    	return new Money(amount * money.amount);
    }
    public Money devide(Money money) {
        //나누기 구현
    	return new Money(amount / money.amount);
    } 
    public boolean equals(Object object) {
        //Object equals 메쏘드 재정의
    	Money money = (Money)object;
    	return amount == money.amount;
    }

    @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.hashCode(amount);
	}
    
    
	public static void main(String[] args){
        Money five  = new Money(5); //
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);
        
        if( five.equals(two.add(three))
            && three.equals(five.minus(two))
            && ten.equals(five.multiply(two))
            && two.equals(ten.devide(five)) )  {
            System.out.println("Money Class 구현을 완료 하였습니다.");
        }else {
        	System.out.println("실패");
        }
    }
	
	 
	
}

