package com.staticandfinal.staticdemo.classes;

public class StaticDemo {
//	public static int num1; 
//	public int num2;
//	
//	
//	static {
//		
//	}
//	
//	public static void method1() {
//		StaticDemo staticDemo = new StaticDemo();
//		System.out.println("Instance Variable :" + staticDemo.num2);
//		System.out.println("Class Variable :" + num1);
//		
//		staticDemo.method2();
//		
//	}
//	public void method2() {
//		System.out.println("Method belong to object");
//		
//	}
	
	public static int staticCounter;
	public static int instanceCounter=0;
	
	static {
		staticCounter=0;
	}
	
	public StaticDemo() {
		staticCounter++;
		instanceCounter++;
	}
	
	public static void printCounterValue() {
		System.out.println("Instance Counter:" + instanceCounter);
		System.out.println("Static Counter:" + staticCounter);
	}

}
