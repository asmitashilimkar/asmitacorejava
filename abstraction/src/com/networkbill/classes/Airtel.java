package com.networkbill.classes;

public class Airtel implements BillGenerator {

	@Override
	public float generateBill(int internetUsage) {
		return internetUsage*8;
	}



}
