package com.networkbill.classes;


public interface BillGenerator {
	
//	public static final int number = 10;
	
	public abstract float generateBill(int internetUsage);
	
//	public void showMessage();
//	
//	abstract void method1();
	
	default void method2() {
		System.out.println("Hello");
		method4();
	}
	
	public static void method3() {
		System.out.println("This is static method");
	}
	// after java 14 version
	private void method4() {
		System.out.println("This is private method");
	}

}
