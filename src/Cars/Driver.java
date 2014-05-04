package cars;

import adapter.BuildAuto;
import exception.FixProblems;

import Util.ReadSource;

public class Driver {

	public static void main(String[] args) {
		ReadSource readSource = new ReadSource();
		Automotive fordZTW = null;
		String fileName = "X:\\Radha\\car-config\\src\\FordZTW.txt";
		int count = 0;
		while (fordZTW == null && count++ < 3) {
			// Build Automobile Object from a file.
			try {

				fordZTW = readSource.buildAutoObject(fileName);
			} catch (FixProblems e) {
				e.printStackTrace();
				if (e.getErrorno() == 101) {
					fileName = e.fixProblemReadFromConsole();
				}
			}
		}

		// Print attributes before serialization
		fordZTW.print();

		// Serialize the object
		readSource.serializeAuto(fordZTW);
		// deserialize the object and read it into memory.
		Automotive newFordZTW = readSource
				.DeserializeAuto("X:\\Radha\\car-config\\src\\auto.ser");
		// Print new attributes.
		newFordZTW.print();
		System.out.println("=====================================================");
	}
	
	
}
