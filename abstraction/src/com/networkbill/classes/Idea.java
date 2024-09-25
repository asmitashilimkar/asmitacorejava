package com.networkbill.classes;

public class Idea implements BillGenerator {

	@Override
	public float generateBill(int internetUsage) {
		
		return internetUsage*10;
	}




}
