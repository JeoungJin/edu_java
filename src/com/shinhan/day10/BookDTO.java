package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//DTO(Data Transfer Object)
//VO(Value Object)
//Beans(Java Beans--Object)
//@ToString
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//public class BookDTO {
//   String title;
//   int price;
//}


//constructor, getter, toString, equals 메소드를 자동 생성
public record BookDTO(String title,int price) {
 
}
