package com.stringbuffer;

public class MainClass {

	public static void main(String[] args) {
		
		StringBuffer strbuff = new StringBuffer();
		strbuff.append("This is  indapur city");
		int occurence = strbuff.lastIndexOf("is");
		System.out.println(occurence);
		
		strbuff.insert(8, "Great");
		
		System.out.println(strbuff.toString());
		
		strbuff.delete(5, 11);
		System.out.println(strbuff.toString());
		
		strbuff.reverse();
		System.out.println(strbuff.toString());
		System.out.println(strbuff.capacity());
		


	}

}
