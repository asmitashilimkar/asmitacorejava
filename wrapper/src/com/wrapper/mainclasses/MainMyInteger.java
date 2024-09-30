package com.wrapper.mainclasses;

import com.wrapper.classes.MyInteger;

public class MainMyInteger {

	public static void main(String[] args) {
//		integer
		
		MyInteger my = new MyInteger();
		int no1 =my.boxing(18);
		int no2 = my.unboxing(43);
		int no3= my.StringToNum("123");
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		
//	float	
		
		MyInteger me = new MyInteger();
		float no4 =me.boxing(34);
		float no5 = me.unboxing(65);
		float no6= me.StringToNum1("435");
		
		
		
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		
//		compare
		
		int result = Integer.compare(no1, no2);
		System.out.println(result);
		
		if(Integer.compare(no1, no2)>0) {
			System.out.println("First value is greater than second value");
		}
		else if(result==0) {
			System.out.println("Both values are equle");
		}
		else {
			System.out.println("second value is greter than first value");
		}
		
//		min and max value
		
		System.out.println("Max limit for int type is: "+Integer.MAX_VALUE);
		System.out.println("Max limit for int type is: "+Integer.MIN_VALUE);
		
		System.out.println("Max limit for int type is: "+Float.MAX_VALUE);
		System.out.println("Max limit for int type is: "+Float.MIN_VALUE);
		
		System.out.println("Max limit for int type is: "+Double.MAX_VALUE);
		System.out.println("Max limit for int type is: "+Double.MIN_VALUE);
		
		// addition
		Integer num1=95;
		Integer num2=45;
		int result1=num1+num2;
		System.out.println(result1);
			

	}

}
