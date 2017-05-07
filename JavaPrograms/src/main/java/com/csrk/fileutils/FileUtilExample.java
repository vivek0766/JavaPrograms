package com.csrk.fileutils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.csrk.exceptions.NotAValidFileException;

public class FileUtilExample {

	File aFile = new File("C:\\file\\vivek.txt");
	FileUtils aFileUtil = new FileUtils();

	public String[] readFilesFrom() throws NotAValidFileException {
		String[] lines = null;
		try {
			List<String> linesList = aFileUtil.readLines(aFile);
			lines = new String[linesList.size()];
			int i = 0;
			for (String string : linesList) {
				lines[i] = string;
				i++;
			}
		} catch (IOException e) {

		}

		return lines;
	}

	public void writeFilesFrom(String[] filerows) {
		List<String> lineslist = new ArrayList<String>();

		for (int i = 0; i < filerows.length; i++) {
			System.out.println(filerows[i]);
		}
		try {
			aFileUtil.writeLines(aFile, lineslist);
		} catch (IOException e) {

			// e.printStackTrace();
		}
	}

}
