package com.ynov.methotest2.ex2;

public class Exo2v3 {
	
	public boolean isLeapYear(int year) {
		boolean ok = false;
		
		if(year % 400 == 0)
			ok = true;
		else if(year % 100 == 0)
			ok = false;
		
		return ok;
	}
	
}
