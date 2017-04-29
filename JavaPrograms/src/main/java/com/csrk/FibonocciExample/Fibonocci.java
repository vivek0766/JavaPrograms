package com.csrk.FibonocciExample;

//import java.util.Scanner;

public class Fibonocci {

	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number-->");
		int n = sc.nextInt();
		// int a, b, c;

		for (int a = 0, b = 1, c = 0; c <= n; c = a + b) {
			System.out.println(" -->" + c);
			a = b;
			b = c;
		}
		sc.close();
	}*/
      
	public void display(String value) throws NumberFormatException{
		int number = Integer.parseInt(value);
		int a=0;
		int b =1;
		System.out.println("The Fibonocci series of given value");
		for( int c = 0; c<=number; c =a+b ){
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
