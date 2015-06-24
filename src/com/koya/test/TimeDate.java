package com.koya.test;

import java.util.Date;
import java.util.Random;

public class TimeDate {

	
	public static void main(String[] args) throws Exception{
		Random randomGenerator = new Random();
	    for (int idx = 1; idx <= 10; ++idx){
	      int randomInt = randomGenerator.nextInt();
	      System.out.println("Generated : " + randomInt);
	    }
	    Date date = new Date();        
	    System.out.println(date.toString());
	    Thread.sleep(5000);
	    System.out.println(date.toString());
	    Thread.sleep(10000);
	    System.out.println(date.toString());

	}

}
