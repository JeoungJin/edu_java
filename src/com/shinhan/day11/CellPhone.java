package com.shinhan.day11;

import lombok.AllArgsConstructor;
//자동 import 단축키 : ctrl + shift + o
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;




//필수칼럼(final)을 매개변수로 갖는 생성자만들기 
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of = "model")
@ToString
public class CellPhone {
	final String model;	// 핸드폰 모델 번호
	double battery;	// 남은 배터리 양
//	CellPhone(String model){
//		this.model = model;
//	}
	void  call(int time) {
		//강제Exception발생 , 
		//Exception<--RuntimeException<--IllegalArgumentException
		//RuntimeException : UnChecked Exception 
		//-----처리하지않으면 자동으로 throws IllegalArgumentException문장추가 
		//Exception : Checked Exception 
		if(time < 0 )
			throw new IllegalArgumentException("통화시간입력오류");
		System.out.println("통화 시간 : "+ time + "분");
		battery -= time * 0.5;
		if(battery<0) battery = 0;
	}
	void  charge(int time) throws IllegalArgumentException {
		if(time<0) 
			throw new IllegalArgumentException("충전시간입력오류");
		
		System.out.println("충전 시간 : " + time + "분");
		battery += time * 3;
		if(battery > 100) battery = 100;
	}
	void  printBattery() {
		System.out.println("남은 배터리 양 : " + battery);
	}
	//equals재정의 안함:Object class의 equals()그대로 사용--주소비교 
	//모두같아야함(함수이름,매개변수,return),접근지정자는 같거나 넓어져야한다. 
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((model == null) ? 0 : model.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CellPhone other = (CellPhone) obj;
//		if (model == null) {
//			if (other.model != null)
//				return false;
//		} else if (!model.equals(other.model))
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("CellPhone [model=").append(model).append(", battery=").append(battery).append("]");
//		return builder.toString();
//	}
	
	
}
/*
 
boolean  equals(Object otherObject)	// Object 타입의 객체를 입력받고, 입력받은 객체가CellPhone 타입의 클래스이면서 모델 번호가 같은 경우에 true를 리턴한다.
*/
