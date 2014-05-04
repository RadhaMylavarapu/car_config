package client;

import model.Automobile;

import adapter.BuildAuto;
import exception.ExceptionLogging;
import exception.FixProblems;

import model.util.*;

/**
 * 
 * @author Radha In Driver1 class we will serialize the object and deserialize
 *         the object and read in to memory
 * 
 */
public class Driver1 {

	public static void main(String[] args) throws FixProblems {
		ReadSource readSource = new ReadSource();
		Automobile fordZTW = null;
		Automobile fordZTW1 = null;
		String fileName = "X://Rha\\car-config\\src//FordZTW1.txt";
		int count = 0;
		while (fordZTW == null) {
			// Build Automobile Object from a file.
			try {

				fordZTW = readSource.buildAutoObject(fileName);
			} catch (FixProblems e) {
				ExceptionLogging.log();
				System.out.println("Enter the correct file Name :" + fileName);
				fileName = e.fixProblemReadFromConsole();
			}
		}
	}
}

		

