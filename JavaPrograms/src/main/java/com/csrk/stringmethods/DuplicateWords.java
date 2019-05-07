package com.csrk.stringmethods;

import java.util.HashMap;

public class DuplicateWords {
	StringBuffer sb = null;

	public void duplicate(String message) {
		String[] separate = message.split(" ");
		int lenthofWords = separate.length;
		System.out.println(" the lenght of the words " + lenthofWords);
		HashMap<String, Integer> list = new HashMap<String, Integer>();

		for (String word : separate) {

			if (list.containsKey(word.toLowerCase())) {
				

			} else {
				
			}
		}

	}

	public static void main(String args[]) {
		DuplicateWords dw = new DuplicateWords();
		dw.duplicate("Vivek Reddy Komati Reddy");
	}
}
