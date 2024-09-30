package com.staticandfinal.staticdemo.mainclass;

import com.staticandfinal.staticdemo.classes.StaticDemo;

public class MainStaticDemo {
	
	static int variable1;
	int variable2;
	
	
	//we can access static references(static variable ,static mrthod)
	//form static method without any refercese(object)
	
	
	//we can not accessnon static refereces(instance variable,instance method)
	//from  static method without any referces(object)

	public static void main(String[] args) {
		System.out.println("This is main method");
//		MainStaticDemo mainStaticDemo= new MainStaticDemo();
//		variable1=10;
//		method2();
//		
//		mainStaticDemo.method();
//


	StaticDemo staticDemo1 = new StaticDemo();
	staticDemo1.printCounterValue();
	
	StaticDemo staticDemo2 = new StaticDemo();
	staticDemo2.printCounterValue();
	
	
	StaticDemo staticDemo3 = new StaticDemo();
	staticDemo3.printCounterValue();
	StaticDemo staticDemo4 = new StaticDemo();
	staticDemo4.printCounterValue();
	StaticDemo staticDemo5 = new StaticDemo();
	staticDemo5.printCounterValue();
	StaticDemo staticDemo6 = new StaticDemo();
	staticDemo6.printCounterValue();
	StaticDemo staticDemo7 = new StaticDemo();
	StaticDemo staticDemo8 = new StaticDemo();
	StaticDemo staticDemo9 = new StaticDemo();
	StaticDemo staticDemo10 = new StaticDemo();
	
	
	
	}
	public void method() {
		System.out.println("Instantce level Method");
	}
	
	public static void method2() {
		System.out.println("Static method 2");
	}
	

}
