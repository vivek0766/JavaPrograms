package com.csrk.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public void numberList() {

		ArrayList<Integer> numbersList = new ArrayList<Integer>();

		numbersList.add(2);
		numbersList.add(4);
		numbersList.add(1);
		numbersList.add(6);
		numbersList.add(null);
		numbersList.add(5);
		numbersList.add(4);
		System.out.println("Inserting new element-->"+numbersList.add(8));
		System.out.println("The number in 3rd index of ArrayList-->"+numbersList.get(3));
		System.out.println("The number in 7th index of ArrayList-->"+numbersList.get(7));
		
		System.out.println("The Size of ArrayList-->"+numbersList.size());
		
		Iterator iterator  = numbersList.iterator();
		while(iterator.hasNext()){
			System.out.println("The element in the ArrayList-->"+iterator.next());
		}
		System.out.println("The Elements present in the ArrayList are -->");
		for(int i = 0; i<numbersList.size(); i++){
			System.out.println(numbersList.get(i));
		}
		
		
	}
}
