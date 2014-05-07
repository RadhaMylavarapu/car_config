package model;

import java.util.Scanner;

import exception.ExceptionLogging;
import exception.FixProblems;
import model.util.ReadSource;

public class TestAutomobile {
	public static void main(String[] args) throws FixProblems {
		ReadSource rs = new ReadSource();
		Automobile auto1 = null;
		String fileName = "X:\\Radha\\car-config\\src\\FordZTW.txt";
		int j = 0;
		while (auto1 == null && j < 2) {

			try {
				auto1 = rs.buildAutoObject(fileName);
				j = 2;
			} catch (FixProblems e) {
				ExceptionLogging.log();
				fileName = e.fixProblemReadFromConsole();
				System.out.println(" Enter the correct file Name :" + fileName);
				j++;
			} finally {
				if (j != 2) {
					System.out
							.println("Sorry!FileName you entered was wrong again.Please check it again........");
					fileName = "X:\\Radha\\car-config\\src\\txtfiles\\FordZTW1.txt";
				}
				System.out.println("\n");
				System.out.println("\n");
			}
		}
		// Automotive auto = new Automotive();
		// Automotive auto11 = new Automotive("Focus Wagon ZTW", 5, 18445);
		OptionSet ops = new OptionSet();
		OptionSet[] optionSet = auto1.getOptionSet();
		ops.getClass();
		System.out.println("/n");
		for (int i = 0; i < optionSet.length; i++) {
			if (optionSet[i].getName().equals("Color".trim())) {
				// Get OptionSet (by index value) method
				System.out.println();
				System.out
						.println("Get OptionSet (by index value)  method takes the index value as a parameter and returns the optionset in that index if exits ,otherwise returns null ");

				try {
					System.out.println(auto1.getOptionSet(-7));
				} catch (Exception e1) {
					e1.printStackTrace();
					ExceptionLogging.log();
					System.out
							.println("There are only 5 optionSets.Choose any from 0to 4");
				}
				// Find OptionSet (with name)method
				System.out.println();
				System.out.println();
				System.out
						.println("Find OptionSet( with name) method takes optionSet name as aparameter and returns optionSet if exits ,oterwise returns null if not exits");

				System.out.println(auto1.findOptionSet("color".trim()));
				System.out.println(auto1.findOptionSet("booo"));
				System.out.println();
				System.out.println();
				System.out
						.println("Find Option (with name) method takes option name as a parameter and returns option if exists,otherwise returns null if not exists");
				System.out.println(auto1
						.findOption("French Blue Clearcoat Metallic".trim()));
				boolean success = false;
				int k = 0;
				while (!success && k < 2) {
					try {
						System.out.println(auto1.findOption("Red"));
						success = true;
						k = 2;
					} catch (Exception e) {
						System.out
								.println("There is no option found with this name");
						k++;
						success = true;
					}

				}
				System.out.println();
				System.out.println();
				// setOption(int i, String name, int price): void method in
				// OptioSet class
				System.out
						.println("setOption(int i, String optionName, int optionprice) method in OptionSet class Set the given name and cost in optionSet");
				optionSet[i].setOption(3, "Red", 200);
				System.out.println(optionSet[i].getOption("Red").toString());
				// getOptionPrice(name: String): int method in OptionSet class
				System.out.println();
				System.out.println();
				System.out
						.println(" getOptionPrice(String optionName) method in OptionSet class takes option name and gives it's price");
				System.out.print(optionSet[i].getOptionPrice("cost=" + "blue"));
				System.out.println();
				System.out.println(optionSet[i].getOptionPrice("cost="
						+ "French Blue Clearcoat Metallic".trim()));
				System.out.println();
				System.out.println();
				// Find Option with name (in context of OptionSet)
				System.out
						.println(" findOption(String optionname) method takes optionname as parameter and  if it exit returns values oterwise returns null ");
				ops.getClass();
				model.OptionSet.Option option = auto1
						.findOption("CD Silver Clearcoat Metallic".trim());
				try {
					System.out.println("Option Details" + option);
					model.OptionSet.Option option1 = auto1.findOption("phjdhkhf"
							.trim());
					System.out.println("Option Details=" + option1);
				} catch (Exception e) {
					System.out.println("Cannot find the option to delete");
					e.printStackTrace();
				}

				System.out.println();
				System.out.println();
				// Find OptionSet with name
				System.out
						.println(" findOptionSet(String optionSetname) method takes optionSetname as parameter and  if it exit returns values oterwise returns null ");
				try {
					ops = auto1.findOptionSet("color".trim());
				} catch (FixProblems ex) {
					ExceptionLogging.log();
					ex.printStackTrace();
				}
				System.out.println("OptionSet details:" + ops.toString());
				System.out.println();
				System.out.println();
				// Update values of Options() find the option and set the values
				System.out
						.println("upDateOptions() method in automotive class takes the option name as a parameter then find it and update ");
				auto1.updateOptionPrice(
						"Fort Knox Gold Clearcoat Metallic".trim(), "platinum",
						80);
				System.out.println();
				System.out.println();
				// Update values of OptionSet() find the OptionSet and set the
				// values
				System.out
						.println("findOptions() method in automotive class takes the option name as a parameter then find it and update ");
				auto1.updateOptionSet("Color", "colour");
				System.out.println();
				System.out.println();
				// Delete an OptionSet method deletes the OptionSetname from
				// list
				System.out
						.println("DeleteOptionSet() takes the OptionSet Name as parameter and deletes it from records");
				auto1.DeleteOptionSet("Transmission".trim());
				System.out.println("OptionSet Details:" + auto1.toString());
				System.out.println();
				System.out.println();
				// Delete an Option method deletes the Optionname from list
				System.out
						.println("DeleteOption() takes the Option Name as parameter and deletes it from records");
				auto1.DeleteOption("no Air Bags".trim());
				System.out.println("OptionSet Details:" + auto1.toString());

			}
		}
	}
}
