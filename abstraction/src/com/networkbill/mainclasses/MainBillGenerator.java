package com.networkbill.mainclasses;

import com.networkbill.classes.Airtel;
import com.networkbill.classes.BillGenerator;
import com.networkbill.classes.Idea;

public class MainBillGenerator {

	public static void main(String[] args) {
		Airtel a = new Airtel();
		System.out.println("Your Mobile bill :"+a.generateBill(150));
		Idea i = new Idea();
		System.out.println("Your mobile bill :"+i.generateBill(150));
		a.method2();
		BillGenerator.method3();
		i.method2();
	
	

	}

}
