package com.csrk.datatypes;

import java.util.Scanner;

public class Caliculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int a ;         int b  ;
         int Addition, Substraction, Multiplication, Division;
         
         System.out.println("Enter value of A ->");
         a = sc.nextInt();
         System.out.println("Enter value of B ->");
         b = sc.nextInt();
          Addition = a+b;
          Substraction = b-a;
          Multiplication= a*b;
          Division= a/b;
          System.out.println("Addition of a and b is ->"+Addition);
          System.out.println("Substraction of a and b-> "+Substraction);
          System.out.println(" Multiplication of a and b->"+Multiplication);
          System.out.println("Division of a and b->"+Division);
	}
}