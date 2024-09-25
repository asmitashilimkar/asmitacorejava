package com.sbp.methodoverloading.mainclass;

import com.sbp.methodoverloading.Diagrams;

public class MainDiagram {

	public static void main(String[] args) {
//       Diagrams Dgm =new Diagrams(10,5);
//       Dgm.printHeightWidth();
//       Dgm.area(20);
//       Dgm.area(20, 30);
//       Dgm.area(10);
//       Dgm.area(12, 25);
//       Dgm.area(10.5F, 10);
//       Dgm.area(10, 10.5F);
//       
//		
//		byte num1=(byte)130;
//		System.out.println(num1);
		
		int intVariable=1000;
		float floatVariable = intVariable;
		System.out.println(floatVariable);
       
		intVariable = (int)floatVariable;
		System.out.println(intVariable);
	}

}
