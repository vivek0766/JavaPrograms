package com.csrk.monthfinder;

public class TestMonthFinder {

	public static void main(String[] args) throws Exception {
		
		int number = Integer.parseInt(args[0]);
		
		if(number==1){
			System.out.println("this is January");
		}if(number==2){
			System.out.println("This is Febraury");
		}if(number==3){
			System.out.println("this is March");
		}if(number==4){
			System.out.println("This is April");
		}if(number==5){
			System.out.println("this is May");
		}if(number==6){
			System.out.println("This is June");
		}if(number==7){
			System.out.println("this is July");
		}if(number==8){
			System.out.println("This is August");
		}if(number==9){
			System.out.println("this is September");
		}if(number==10){
			System.out.println("This is October");
		}if(number==11){
			System.out.println("this is November");
		}if(number==12){
			System.out.println("This is December");
		}if(number<1){
			System.out.println("this is Not Month! Please give correct input");
		}if(number>12){
			System.out.println("this is Not Month! Please give correct input");
		}

	}

}
