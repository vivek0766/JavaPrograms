package com.csrk.arrays;

public class FindArrayApp {

	public static void main(String[] args) {
		FindArray findArray = new FindArray();
		try{
		int num = Integer.parseInt(args[0]);
			findArray.findNum(num);	
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		
		findArray.roomMems();

	}

}
