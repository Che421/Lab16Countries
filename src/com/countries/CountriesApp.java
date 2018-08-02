package com.countries;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");

		String name = null;
		int userNum = 0;
		String userChoice = null;
		Countries.createDirectory("Countries");
		Countries.createFile();

		System.out.println("1 -See list of countries");
		System.out.println("2 -Add a country");
		System.out.println("3 -Exit");

		ArrayList<Countries> list = new ArrayList<>();
		Countries c1 = new Countries("United States of America");
		Countries c2 = new Countries("Italy");
		Countries c3 = new Countries("Mexico");

		list.add(c1);
		list.add(c2);
		list.add(c3);

		do {
			System.out.println("Enter a menu number: ");
			userNum = input.nextInt();
			input.nextLine();

			if (userNum == 1) {
				for (Countries c : list) {
					System.out.println(c);
				}
			} else if (userNum == 2) {

				System.out.println("Add a country");
				name = input.nextLine();
				Countries.writeToFile(name);
				System.out.println("The country has been saved");
				readFromFile();
				

			} else {
				System.out.println("Goodbye!");
			}

		} while (userNum == 1 || userNum == 2);

		input.close();
	}

	private static void readFromFile() {
		// TODO Auto-generated method stub
		
	}

}