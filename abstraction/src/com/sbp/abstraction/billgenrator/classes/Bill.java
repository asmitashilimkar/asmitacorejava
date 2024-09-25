package com.sbp.abstraction.billgenrator.classes;

public abstract class Bill {
	
	private int number;
	private final float PI;
	
	public Bill(int number) {
//		this.number=number;
		PI=number;
	}
	
	public abstract float genarateBill(int units);

}
