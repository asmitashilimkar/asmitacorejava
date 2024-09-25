package com.sbp.abstraction.billgenrator.classes;

public class ResidentialBill extends Bill {
	public ResidentialBill(int number) { 
	super (number);
	}

	@Override
	public float genarateBill(int units) {
		
		return units*5.30f ;
	}

}
