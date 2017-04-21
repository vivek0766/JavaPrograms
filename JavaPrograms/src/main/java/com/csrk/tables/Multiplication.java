package com.csrk.tables;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.println("Enter the value of p->");
	        int p;
	        p=sc.nextInt();
	        
	        System.out.println("Enter the value of q->");
	        int q;
	        q=sc.nextInt();
	       
	     
	     int R=1;
	    /* while(q==R){
	    	 System.out.println("-->"+p*R);
	     }*/
	     while(q>R){
	    	 System.out.println("Result->"+p*R);
	    	 R++;
	     }
	     while(q<R){
	    	 System.out.println("Result-->"+p*R);
	    	 R--;
	     }
	    	 

	}

}
