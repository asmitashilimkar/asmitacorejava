package com.string.mainclass;

import java.util.Arrays;

import com.strings.classes.StringExample;

public class MainStringExample {

	public static void main(String[] args) {
		StringExample str = new StringExample();
		String name ="Asmitaa";
		StringBuilder str1 = new StringBuilder();
		str1.append(name);
		str1.append(" Shilimkar");
		System.out.println(str.getResult(str1.toString()));
		byte [] bytes=name.getBytes();
		for(byte val:bytes) 
			System.out.println(val);
		
		
		String name1 ="Amruta";
		String name2 ="Ankita";
		String name3 = new String("Akshay");   
		
		System.out.println(name1!=name2);
		System.out.println(name1==name3);
		
		System.out.println(name.equals(name1));
		
		char character=name.charAt(4);
		System.out.println(character);
		
		StringExample str2 = new StringExample();
		char[] charArray=name.toCharArray();
		
		int left=0;
		int right=charArray.length-1;
		while(left<=right) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(charArray));
		
		System.out.println(name.matches("[A-Z][a-z]{1,6}"));
		
		String mob="7325074445";
		System.out.println(mob.matches("[6-9][0-9]{1,9}"));
		
		
		
		
		
	}

}
