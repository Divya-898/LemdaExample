package com.exampe.java;

import java.util.Comparator;

class CompratorLemda {
 public static void main(String args[])
 {
	 
	 Comparator<Integer> comprator=new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
	};
	System.out.println("result it"+comprator.compare(3, 1));
	Comparator<Integer> comprator1=(Integer a,Integer b)-> a.compareTo(b);
	System.out.println("result with lemda"+comprator1.compare(4, 1));
	Comparator<Integer> comprator2=(a,b)-> a.compareTo(b);
	System.out.println("result with lemda"+comprator2.compare(5, 1));
 }
}
