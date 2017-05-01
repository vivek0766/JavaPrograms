package com.csrk.calculator;

import com.csrk.exceptions.NotAValidInputException;

//import java.util.Scanner;

public class Calculator {

	/*
	 * public static void main(String[] args) { Scanner sc = new
	 * Scanner(System.in); int a ; int b ; int Addition, Substraction,
	 * Multiplication, Division;
	 * 
	 * System.out.println("Enter value of A ->"); a = sc.nextInt();
	 * System.out.println("Enter value of B ->"); b = sc.nextInt(); Addition =
	 * a+b; Substraction = b-a; Multiplication= a*b; Division= a/b;
	 * System.out.println("Addition of a and b is ->"+Addition);
	 * System.out.println("Substraction of a and b-> "+Substraction);
	 * System.out.println(" Multiplication of a and b->"+Multiplication);
	 * System.out.println("Division of a and b->"+Division); sc.close(); }
	 */

	public void subtraction(String firstValue, String secondValue) throws NotAValidInputException {
		int num1 = Integer.parseInt(firstValue);
		int num2 = Integer.parseInt(secondValue);
		int sub = num1 - num2;

		System.out.println("The Subtaction of two Numbers -->" + sub);
	} 

	public void division(String number1, String number2) throws NotAValidInputException{
		int first = Integer.parseInt(number1);
		int second = Integer.parseInt(number2);
		System.out.println("The result of division Numbers-->" + first / second);

	}
}