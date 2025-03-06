package com.shinhan.day14;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor@Getter 
public class Student implements Comparable<Student> {
	private String name;
	private int englishScore;
	private int mathScore;
	
	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		return name.compareTo(obj.name) ;
	}
	
	
    /*
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}*/
	
}
