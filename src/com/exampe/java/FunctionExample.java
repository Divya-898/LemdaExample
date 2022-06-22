package com.exampe.java;
import java.util.function.Function;
public class FunctionExample {
  static Function<String, String> function=(name)->name.toUpperCase();
  static Function<String, String> addstirng=(name)->name.toUpperCase().concat("default");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("result is" +function.apply("java8"));
    System.out.println("result is" +function.andThen(addstirng).apply("java8"));
    System.out.println("result is" +function.compose(addstirng).apply("java8"));
	}

}
