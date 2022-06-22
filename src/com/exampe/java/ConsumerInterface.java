package com.exampe.java;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String args[]) {
		
		Consumer<String> s1=(s)-> System.out.println(s.toUpperCase());
		s1.accept("java8");
	}
}
