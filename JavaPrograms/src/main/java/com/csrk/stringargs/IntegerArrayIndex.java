package com.csrk.stringargs;



public class IntegerArrayIndex {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		IntegerArray indexofArray = new IntegerArray();
		try {
			indexofArray.findIndex(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please give correct input value ");
			
		}

	}

}
