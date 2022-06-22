package com.exampe.java;

import java.util.function.UnaryOperator;

public class UnaryOpratorExample {

	static UnaryOperator<String> unary=(s)->s.concat("default");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("opearot is:" +unary.apply("java"));
	}

}
