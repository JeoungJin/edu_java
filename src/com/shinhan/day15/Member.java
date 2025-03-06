package com.shinhan.day15;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Member implements Serializable{
	private String name;
	private int age;
}
