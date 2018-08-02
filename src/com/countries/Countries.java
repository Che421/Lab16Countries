package com.countries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Countries {

	private String string;

	public Countries(String string) {
		this.string = string;
	}

	public static void createFile() {
		String dirString = "Countries";
		String fileName = "countries.txt";// random name selected by Kaelan

		Path filePath = Paths.get(dirString, fileName);

		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("File was created successfully");
			} catch (IOException e) {
				System.out.println("Something went wrong with the file creation");

			}
		}

	}

	public static void createDirectory(String Path) {
		String path = "Countries";
		Path dirPath = Paths.get(Path);
		// Path dirPath = Paths.get("resources");//we could pass this directly in as a
		// parameter for the FIles.notExists() method
		// Files.notExists() method
		// to avoid declaring the String and Path variables above

		if (Files.notExists(dirPath)) {
			try {
				Files.createDirectories(dirPath);
				System.out.println("Folder was created successfully!");
			} catch (IOException e) {
				System.out.println("Something went wrong");

			}

		}

	}

	public static void writeToFile(String name) {
		String dir = "countries";
		String fileName = "countries.txt";

		Countries c = new Countries(name);

		Path writeFile = Paths.get(dir, fileName);

		File file = writeFile.toFile();

		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));

			outW.println(c);
			outW.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found!");

		}

	}
	static void readFromFile() {
		String dirString = "countries";
		String fileName = "countries.txt";// random name selected by Kaelan

		
		Path filePath = Paths.get(dirString, fileName);
		File file = filePath.toFile();
		try {
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		 String line = reader.readLine();
		
		while(line != null)  {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
			
		}catch(IOException e) {
			System.out.println("Something went wrong!");
		}
		

	}


	@Override
	public String toString()  {
		return this.string;
	}

}