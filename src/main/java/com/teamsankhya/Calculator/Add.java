package com.teamsankhya.Calculator;

import org.apache.log4j.Logger;

public class Add 
{
	 private static final Logger logger=Logger.getLogger(Add.class);

	
   public static int add(int a,int b)
   {
	  
	   logger.info("adding two integers :"+a +"+" +b);
	
	return a+b;
	
    }
   
   public static float add(float a,float b)
   {
	
	return a+b;
	
    }
   
   public static double add(double a,double b)
   {
	
	return a+b;
	
    }
   
   public static long add(long a,long b)
   {
	
	return a+b;
	
    }
   
  
}

