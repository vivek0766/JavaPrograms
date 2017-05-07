package com.csrk.fileutils;

import com.csrk.exceptions.NotAValidFileException;

public class FileUtilApp {

	public static void main(String[] args) {
		FileUtilExample fileutilExample = new FileUtilExample();
		try {
			String[] lines = fileutilExample.readFilesFrom();
			for (int i = 0; i < lines.length; i++) {
				System.out.println("The " + i + " line in the file is " + lines[i]);
			}
		} catch (NotAValidFileException e) {

			System.out.println("The file you are trying is corrupted or Invalid ");
		}

		
	}

}
