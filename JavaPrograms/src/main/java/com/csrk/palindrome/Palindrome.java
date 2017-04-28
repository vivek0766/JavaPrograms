package com.csrk.palindrome;

//import java.util.Scanner;

public class Palindrome {
	/*
	 * public static void main(String[] args) { Scanner sc = new
	 * Scanner(System.in); System.out.println("Enter String -->");
	 * 
	 * String s = sc.next(); // String s1=sc.nextLine(); If the given string
	 * have spaces. StringBuffer sb = new StringBuffer(s); sb.reverse();
	 * 
	 * if (s.equalsIgnoreCase(sb.toString())) {
	 * System.out.println("The given String is Palindrome"); } else {
	 * System.out.println("The given String is Not a Palindrome"); }
	 * 
	 * sc.close();
	 * 
	 * }
	 */

	// http://www.programmingunit.com/2014/02/23/java-program-palindrome-command-line-input/
	public void printName(String name) {
		String msg = name.toString().toLowerCase();
		String rev = new StringBuilder(msg).reverse().toString();
		if (msg.equals(rev)) {
			System.out.println("Given String " + msg + " is a Palindrome.");
		} else {
			System.out.println("Given String " + msg + " is not a Palindrome.");
		}
	}

}
