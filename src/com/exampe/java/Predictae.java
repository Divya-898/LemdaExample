package com.exampe.java;

import java.util.function.Predicate;

public class Predictae {
	 static Predicate<Integer> s=(i)->{return i%2==0;};
	 static  Predicate<Integer> s1=(i)->i%2==0;
	 static  Predicate<Integer> s2=(i)->i%5==0; 
	 static void predicateAnd() {
		 
		 System.out.println("predicate" +s1.and(s2).test(10));
		 System.out.println("predicate" +s1.and(s2).test(9));
	 }
	 static void predicateOr() {
		 System.out.println("predicate" +s1.or(s2).test(10));
		 System.out.println("predicate" +s1.or(s2).test(8));
	 }
	 static void predicateNegate() {
		 System.out.println("predicate negate" +s1.or(s2).negate().test(10));
		 System.out.println("predicate negate" +s1.or(s2).test(8));
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      System.out.println(s.test(4));
      
      System.out.println(s1.test(4));
      predicateAnd();
      predicateOr();
      predicateNegate();
	}

}
