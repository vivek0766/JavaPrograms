package com.csrk.stringargs;

import com.csrk.exceptions.NotAValidInputException;

public class PrintExamples {

	public void printRightTriangle(String num) {
		System.out.println("To print RightAngled Triangle");
		int number = Integer.parseInt(num);
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void printTriangle(String num) throws NotAValidInputException {
		System.out.println("To print Triangle");
		int number = Integer.parseInt(num);
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= number - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void printLeftTriangle(String num) {
		System.out.println("To print Left Triangle");
		int number = Integer.parseInt(num);
		for (int l = 0; l < number; l++) {
			for (int m = 0; m <= number - l; m++) {
				System.out.print("-");
			}
			for (int n = 0; n <= l; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
	} 
	
	public void square(String a){
		System.out.println("To print Square");
		int value = Integer.parseInt(a);
		for(int x=1; x<=value;x++){
			for(int y=1; y<=value;y++){
				if(x==1 || y==1|| x==4 || y==4){
				System.out.print(y);
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
	}

}
