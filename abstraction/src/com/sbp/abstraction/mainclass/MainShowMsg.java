package com.sbp.abstraction.mainclass;

import com.showmsg.classes.*;
public class MainShowMsg {

	public static void main(String[] args) {
		ShowMsg msg=()->{
			System.out.println("Hello");
			System.out.println("Hi");
			
		};
		msg.displayMsg();

	}

}
