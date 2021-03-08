package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exp4 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalDate yes =date.minusDays(1);
		
		LocalDate tom = yes.plusDays(2);
		
		System.out.println("Today "+date);
		
		System.out.println("Yesterday : "+yes);
		
		System.out.println("Tom " +tom);
		
		LocalDate find = LocalDate.of(2004, 1, 1);
		
		System.out.println("Finding "+find);
		
		System.out.println(find.isLeapYear());
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
	}

}
