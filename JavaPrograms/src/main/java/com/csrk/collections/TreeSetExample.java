package com.csrk.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public void stringSet(){
		TreeSet<String> nameSet = new TreeSet<String>();
		
		nameSet.add("Siva Reddy");
		nameSet.add("Vivek Reddy");
		nameSet.add("Anu Reddy");
		nameSet.add("Siddu");
		nameSet.add("Siddu");
		nameSet.add("Anu Reddy");
		nameSet.add("Abhimanyu");
		System.out.println("The Names in TreeSet-->"+nameSet.clone());
		System.out.println("The Size of the TreeSet-->"+nameSet.size());
		for(int i =0; i<nameSet.size();i++){
			System.out.println(nameSet.last());
		}
		
		}
}
