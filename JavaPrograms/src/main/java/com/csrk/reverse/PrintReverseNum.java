package com.csrk.reverse;

public class PrintReverseNum {

	//int number =0766;
	int reverse;
	public void reverseNum(String number){
		int num = Integer.parseInt(number);
		while(num != 0){
			reverse = reverse*10;
			reverse = reverse+num%10;
			num =num/10;
		}System.out.println(" The Reverse of Number -->"+reverse);
	}
	public static void main(String args[]){
		PrintReverseNum reversenumber= new PrintReverseNum();
		reversenumber.reverseNum(args[0]);
	}
}
