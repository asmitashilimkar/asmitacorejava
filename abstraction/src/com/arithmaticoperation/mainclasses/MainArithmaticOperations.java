package com.arithmaticoperation.mainclasses;

import com.arithmaticoperation.interfaces.*;

public class MainArithmaticOperations {
	
	public static void main(String[] args) {
				
		
		ArithmaticOperations add =(o,q)->o+q;
		ArithmaticOperations sub =(a,b)->a-b;
		ArithmaticOperations mul =(x,y)->x*y;
		ArithmaticOperations div =(s,p)->s/p;
		
		System.out.println("Addition Result is: "+ add.doOperation(15, 30));
		System.out.println("Substraction Result is: "+ sub.doOperation(25, 6));
		System.out.println("Multiplication Result is : "+ mul.doOperation(5, 9));
		System.out.println("Divison Result is : "+ div.doOperation(100, 5));
		

	}

}
