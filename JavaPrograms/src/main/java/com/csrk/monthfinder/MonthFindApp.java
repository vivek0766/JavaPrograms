package com.csrk.monthfinder;

import com.csrk.exceptions.NotAValidInputException;

public class MonthFindApp {

	public static void main(String[] args) throws NotAValidInputException{
		
		MonthExample monthExample = new MonthExample();
		try {
			monthExample.findMonth(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Please give coorect Month value");
			//e.printStackTrace();
		}

	}

}
