package com.staticandfinal.finaldemo.classes;

public class ParentFinalClass {
	
	//lazy initialization
	private final int CONSTATN_VALUE;
	//lazy initialization won't work for static final
	private static final int CONSTANT_VALUE1=145;
	
//	static {
//		private static final int CONSTANT_VALUE1=145;
//	}
	
	public ParentFinalClass() {
		CONSTATN_VALUE = 0;
		
	}
	
	public void method1() {
		System.out.println("Parent method 1");
	}

}
