package client;

import java.io.IOException;

import model.Automobile;
import model.util.ReadSource;
//import exception.ExceptionLogging;
import exception.FixProblems;

public class Driver6 {
	public static void main(String[] args) throws FixProblems,
			NumberFormatException, IOException {
		ReadSource readSource = new ReadSource();
		Automobile fordZTW = null;
		String fileName = "X:\\Radha\\car-config\\src\\FordZTW4.txt";
		// Build Automobile Object from a file.
		try {

			fordZTW = readSource.buildAutoObject(fileName);
		} catch (FixProblems e) {
			e.printStackTrace();
		}
	}
}