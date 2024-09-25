package com.sbp.abstraction.billgenrator.classes;

public class IndustrialBill extends Bill {
	
	public IndustrialBill(int number) {
		super (number);
		
	}

	@Override
	public float genarateBill(int units) {
//		float amount=units*16.30f;
		return units*16.30f;
	}

}
