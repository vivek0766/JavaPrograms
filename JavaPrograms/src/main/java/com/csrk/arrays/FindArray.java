package com.csrk.arrays;

public class FindArray {
	int[] a = { 2, 4, 3, 6, 5, 8, 10, 23, 12, 7 };

	public void findNum(int num) throws ArrayIndexOutOfBoundsException {
		for (int i = 0; i <= a.length; i++) {
			if (a[i] == num) {
				System.out.println("the number is in given array");
			} else {
				System.out.println("The Number is not in Given Array ");
			}
		}
	}

	// Loop through the array with for-Each.
	public void roomMems(){
	String[] names ={"vivek", "satish", "neeraj", "Raju", "Dilip"};

	for(String i:names){  
		System.out.println(names[3]);
	}
	}
}
