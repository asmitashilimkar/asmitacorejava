package com.sbp.abstraction.billgenrator.mainclass;

import com.sbp.abstraction.billgenrator.classes.Bill;
import com.sbp.abstraction.billgenrator.classes.IndustrialBill;
import com.sbp.abstraction.billgenrator.classes.ResidentialBill;

public class MainBill {

	public static void main(String[] args) {
//		Bill bill = new IndustrialBill();
//		float amount=bill.genarateBill(100);
//		System.out.println("Your Electricity Bill is: " + amount);
		
//		System.out.println("Your Electricity Bill is: " + bill.genarateBill(200));
		
//		Bill bill1 = new ResidentialBill();
//		System.out.println("Your Electricity Bill is : "+ bill1.genarateBill(100));
		
		Bill bill2=new IndustrialBill(100);
		System.out.println("Your Electricity Bill is : "+ bill2.genarateBill(100));

		
		

	}

}
