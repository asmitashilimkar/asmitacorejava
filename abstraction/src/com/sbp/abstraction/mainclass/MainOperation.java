package com.sbp.abstraction.mainclass;

import com.abstraction.sbp.abstractionclass.Operation;

public class MainOperation {

	public static void main(String[] args) {
		Operation operation = new Operation(1000);
		operation.creditAmount(500);
		operation.checkBal();
		
		operation.debitAmount(200);
		operation.checkBal();
		
		

	}

}
