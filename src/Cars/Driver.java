package Cars;

import Util.ReadSource;

public class Driver {
	public static void main(String[] args) {
		ReadSource readSource = new ReadSource();
		// Build Automobile Object from a file.
		Automotive FordZTW = readSource
				.buildAutoObject("X:\\Radha\\car-config\\src\\FordZTW.txt");
		// Print attributes before serialization
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		FordZTW.printOptionSet();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		// Serialize the object
		readSource.serializeAuto(FordZTW);
		// Deserialize the object and read it into memory.
		Automotive newFordZTW = readSource
				.DeserializeAuto("X:\\Radha\\car-config\\src\\auto.ser");
		// Print new attributes.
		// newFordZTW.print();

	}
}
