package com.csrk.stringmethods;

public class StringProgram {

	public static void main(String[] args) {
		String s = "  Hello World";
		int a =3;
		String x="";
		//String a="world";
		System.out.println(" The length of the String-->"+s.length());
		System.out.println("concatinating string -->" + s.concat("This is 2016 "));
		System.out.println("SubString method with index  ->" + s.substring(4));
		System.out.println("SubString method with begin and end indexes->" + s.substring(3, 9));
		System.out.println("replacing string->" + s.replace(" ", "/"));
		System.out.println("replace the substring with given string -->"+s.replace("World", "abcd"));
		System.out.println("Prints string in UpperCase-->"+s.toUpperCase());
		System.out.println("print char at perticular index -->"+s.charAt(4));
		System.out.println("print the index of string-->"+s.indexOf("r"));
		System.out.println("  -->"+s.intern());
		System.out.println("Specifies no of unicode in the text range  -->"+s.codePointCount(3, 9));
		System.out.println("specifies the code point value of charecter at that index -->" +s.codePointAt(6));
		System.out.println(" Prints String in lowercase-->"+s.toLowerCase());
		System.out.println("returns the same string-->"+s.toString());
		System.out.println(" Removes initial and end spaces in string-->"+s.trim());
		System.out.println(" Returns the string representation of the int argument. -->"+s.valueOf(a));
		System.out.println(" string start char-->"+s.startsWith(" "));
		System.out.println(" string start char-->"+s.startsWith("H"));
		System.out.println("string end char -->"+s.endsWith(" "));
		System.out.println(" string end char-->"+s.endsWith("d"));
		System.out.println("replacing the char in string-->"+s.replace('o','*' ));
		System.out.println("returns String is empty or not -->"+s.isEmpty());
		System.out.println("-->"+x.isEmpty());
		

	}

}
