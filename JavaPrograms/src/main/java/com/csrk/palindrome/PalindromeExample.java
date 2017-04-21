package com.csrk.palindrome;

import java.util.Scanner;

public class PalindromeExample {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String -->");
		
		String s=sc.next();
		//String s1=sc.nextLine(); If the given string have spaces.
		StringBuffer sb= new StringBuffer(s);
		sb.reverse();
		
		if(s.equalsIgnoreCase(sb.toString())){
			System.out.println("The given String is Palindrome");
		}else{
			System.out.println("The given String is Not a Palindrome");
		}
		
	sc.close();
	
	

	}
}
