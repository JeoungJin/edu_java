package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//
//DTO(Data Transfer Object)
//VO(Value Object)
//Beans(Java Beans--Object)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data  
//@NoArgsConstructor/@Setter/@Getter
//@EqualsAndHashCode/@toString
public class BookDTO2 {
 String title;
 int price;
}




