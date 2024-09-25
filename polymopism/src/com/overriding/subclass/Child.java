package com.overriding.subclass;

import com.sbp.overriding.superclass.Parent;

public class Child extends Parent {
	
	public void sleep() {
		System.out.println("Child sleeps @3:00 AM");
	}
	
	
	public void wakeUp()  {
		System.out.println("Child wokes up @10:00 AM");
	}
	
	

}
