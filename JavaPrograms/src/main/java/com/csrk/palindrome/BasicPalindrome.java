package com.csrk.palindrome;

public class BasicPalindrome {
	
	public boolean isPalindrome(String word){
		String str = word.toString().toLowerCase();
		int length = str.length()-1;
		for(int i=0;i<length/2;i++){
			if(str.charAt(i)!=str.charAt(length-i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		BasicPalindrome testPali = new BasicPalindrome();
		System.out.println(testPali.isPalindrome("Amma"));
	}

}
