package com.exampe.java;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOpratorExample {
 static Comparator<Integer> comp=(a,b)->a.compareTo(b);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  BinaryOperator<Integer> multy=(a,b)->a*b;
  System.out.println(multy.apply(3, 4));
  BinaryOperator<Integer> multi=BinaryOperator.maxBy(comp);
  System.out.println("result is:" +multi.apply(4, 5));
  BinaryOperator<Integer> multi1=BinaryOperator.minBy(comp);
  System.out.println("result is:" +multi1.apply(4, 5));
	}

}
