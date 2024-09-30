package com.holiday.mainclasses;

import com.holiday.classes.Holidays;

public class MainHoliday {

	public static void main(String[] args) {
		Holidays []day= new Holidays[] {
				
		new Holidays("26 Jan","Republic Day"),
		new Holidays("15 Aug","Independet Day"),
		new Holidays("25 Dec","Chrisemas")
		
		};
		for(Holidays holidays:day) {
			System.out.println("Date: "+ holidays.date + " festival: "+ holidays.festival);
			
		}

	}

}
