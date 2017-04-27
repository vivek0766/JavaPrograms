package com.csrk.stringargs;

import com.csrk.exceptions.NotAValidInputException;

public class PrintExamplesApp {

	public static void main(String[] args) throws NotAValidInputException{
		 //int number =Integer.parseInt(args[0]);
		PrintExamples rightAngleTriangle = new PrintExamples();
		try {
			rightAngleTriangle.printRightTriangle(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Please give correct Input Number Not a String");
			//e.printStackTrace();
		}
		
		PrintExamples triangle = new PrintExamples();
		try{
		triangle.printTriangle(args[0]);
		}catch(NumberFormatException exp){
			System.out.println("Please give correct values");
		}
		
		PrintExamples leftAngledTriangle = new PrintExamples();
		try{
		leftAngledTriangle.printLeftTriangle(args[0]);
		}catch(NumberFormatException exception){
			System.out.println("Enter correct value");
		}
		
		PrintExamples printSquare = new PrintExamples();
			printSquare.square("4");
			
		
		
	}

}
