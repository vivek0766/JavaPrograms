package com.csrk.primenumber;

import com.csrk.exceptions.NotAValidInputException;

public class PrimeNumberApp {

	public static void main(String[] args) {
		PrimeNumber primeNum = new PrimeNumber();
		try {
//			primeNum.prime("7");
			primeNum.prime(args[0]);
		} catch (NotAValidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (NumberFormatException numberformatException) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Not a valid Input..!");
		}

	}

}
