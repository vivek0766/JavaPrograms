package com.csrk.calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		try {
			calculator.division(args[0]);
		} catch (NumberFormatException exception) {
			System.out.println("please give only numbers");
		} catch (ArithmeticException exp) {
			System.out.println("Any Number can not divisible by Zero");
		}
	}

}
