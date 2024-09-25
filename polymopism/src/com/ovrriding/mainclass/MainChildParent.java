package com.ovrriding.mainclass;

import com.overriding.subclass.Child;
import com.sbp.overriding.superclass.Parent;

public class MainChildParent {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child= new Child();
		
		Parent parent1 = new Child();
//		Child child1 = (Child)new Parent();
				
		parent1.WakeUp();
		
		child.sleep();
		child.wakeUp();

	}

}
