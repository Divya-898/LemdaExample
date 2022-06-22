package com.exampe.java;

public class Function1Example {
 public static String performconcat(String str) {
	 
	 return FunctionExample.addstirng.apply(str);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String result=performconcat("hello");
       System.out.println("result:"+result);
	}

}
