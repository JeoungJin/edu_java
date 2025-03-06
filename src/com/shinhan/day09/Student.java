package com.shinhan.day09;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//이미 존재하는 class의 Sort기준바꾸기위해 2개를 비교하기 : Comparator 인터페이스를 구현해야한다. 

//기본적으로 Object는 비교불가 
//비교가능한 class만들기하려면 반드시 Comparable 인터페이스를 구현해야한다. 


@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Student extends Object implements Comparable<Student> {
	String name;
	int score;

	@Override
	public int compareTo(Student obj) {
		// 1.점수순으로 asc
		// 2.점수순으로 desc (*-1)
		// 3.점수가 같으면 이름으로 asc
		int result = (score - obj.score) * -1;
		if (result == 0)
			return name.compareTo(obj.name);
		return result;
	}

}
