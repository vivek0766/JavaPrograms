package com.csrk.primenumber;

import com.csrk.exceptions.NotAValidInputException;

public class PrimeNumber {

	public void prime(String value) throws NotAValidInputException{
		int number = Integer.parseInt(value);

		boolean isPrime = true;
		//int temp;
		for (int i = 2; i < number / 2; i++) {
			//temp = ;
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		} if(isPrime)
			System.out.println("The given input "+number+" is Prime Number");
		else
		System.out.println("The given input "+number+" is Not a prime Number");

	}
}
