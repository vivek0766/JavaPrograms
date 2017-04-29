package com.csrk.FibonocciExample;

public class FebonocciApp {

	public static void main(String[] args) {
		Fibonocci fibb = new Fibonocci();
		try{
		fibb.display(args[0]);
		}catch(NumberFormatException exp){
			System.out.println("Please give only Integer Number. Nothing else");
		}
	}

}
