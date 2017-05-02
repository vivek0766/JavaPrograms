package com.csrk.stringargs;

import com.csrk.exceptions.NotAValidInputException;

public class IntegerArray {
	int[] array = { 2, 5, 4, 1, 5, 16, 7, 10, 9, 3 };

	public int findIndex(String value) throws NotAValidInputException, ArrayIndexOutOfBoundsException {
		int number = Integer.parseInt(value);
		int indexofnum = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				indexofnum = i;
                break;
			}

		}

		return indexofnum;
	}
}
