package com.csrk.calculator;

import com.csrk.exceptions.NotAValidInputException;

public class CalculatorApp {

	public static void main(String[] args) throws NotAValidInputException{
		Calculator subtract = new Calculator();
		try {
			subtract.subtraction(args[0], args[1]);
		} catch (NumberFormatException exception) { 
			System.out.println("please give only Integers");
		}catch (ArrayIndexOutOfBoundsException exe) {
			System.out.println("please give valid inputs");
		} /*catch (NotAValidInputException e) {
			//e.printStackTrace();
		}*/
		
		Calculator divide = new Calculator();
		try{
		divide.division(args[2], args[3]);
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Please give Correct input");
		}catch(ArithmeticException ex){
			System.out.println("The Numbers Can not be divisible by Zero");
		}catch(NumberFormatException e){
			System.out.println("Please give only Numbers");
		}
	}

}
