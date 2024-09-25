package com.sbp.abstraction.billgenrator.classes;

public class StateWiseBill extends IndustrialBill{
	public StateWiseBill(int number) {
		super(number);
	}
	
	@Override
	public float genarateBill(int units) {
		return units*16*30f;
	}

}
