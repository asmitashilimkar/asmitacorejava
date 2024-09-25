package com.abstraction.sbp.abstractionclass;


public class Operation extends Transaction {
	
	private int bal;
	
	public Operation(int bal) {
		this.bal=bal;
		System.out.println();
		
	}
	
	public void debitAmount(float amount) {
		bal-=amount;
		
	}
	
	@Override
	public void creditAmount(float amount) {
		bal+=amount;
	}
	
	public void checkBal() {
		System.out.println("your bal "+ bal);
	}

	@Override
	public void debittAmount(float amount) {
		// TODO Auto-generated method stub
		
	}

}
