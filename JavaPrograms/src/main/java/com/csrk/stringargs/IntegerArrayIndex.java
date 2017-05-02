package com.csrk.stringargs;

import com.csrk.exceptions.NotAValidInputException;

public class IntegerArrayIndex {

	public static void main(String[] args) {
		IntegerArray indexofArray = new IntegerArray();
		try {
			int indexofnum = indexofArray.findIndex(args[0]);
			if (indexofnum == -1) {
				System.out.println("The number is not present in array");
			} else
				System.out.println("The index of that number-->" + indexofnum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please give correct input value which is present in given Array");

		} catch (NotAValidInputException exception) {
			System.out.println("Enter Valid Input Array");
		} catch (NumberFormatException exe) {
			System.out.println("Please give correct format..! Only Integers");
		}

	}

}
