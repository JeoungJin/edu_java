package com.shinhan.day10;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//롬복라이브러리는 컴파일시 자동으로 메서드들을 생성해준다.  
//JavaBeans기술: 기본생성자, field는 private, public Getter/Setter
@ToString(of = {"name","major"})
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(exclude = {"name"})
public class Student{
	private  String name;
	private  Long score;
	private  String major;
 
}

