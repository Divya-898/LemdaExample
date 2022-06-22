package com.exampe.java;

public class RunnableLemdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable 1");
				
			}
		};
         new Thread(runnable).start();
         
         Runnable runnablemda=()->{
        	 System.out.println("Runnable 2");
         };
         
         Runnable runnablemda1=()->System.out.println("Runnable 3");
         new Thread(runnablemda).start();
         new Thread(runnablemda1).start();
         new Thread(()->System.out.println("Runnable 4")).start();
	}

}
