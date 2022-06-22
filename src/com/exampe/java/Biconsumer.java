package com.exampe.java;

import java.util.function.BiConsumer;

public class Biconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  BiConsumer<String, String> biconsumer=(a,b)->{
	System.out.println("a:"+a+"b:"+b)  ;
  };
    biconsumer.accept("java8", "java9");
    BiConsumer<Integer, Integer> multi=(a,b)->{
    	
    	System.out.println("multiplication is"+(a*b));
    };
 BiConsumer<Integer, Integer> division=(a,b)->{
    	
    	System.out.println("division is"+(a/b));
    };
    multi.andThen(division).accept(10, 5);
	}

}
