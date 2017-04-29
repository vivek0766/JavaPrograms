package com.csrk.stringargs;



public class IntegerArray {
	int[] array = { 2, 5, 4, 1, 5, 16, 7, 10, 9, 3 };
   
	public int findIndex(String value) throws ArrayIndexOutOfBoundsException{
		int number = Integer.parseInt(value);
		for(int i =0; i<array.length;i++){
			if(array[i]==number){
				System.out.println("Num Found");
			}
				System.out.println("Num Not Found");
			
		}
		
     return array[number];
	}
}
