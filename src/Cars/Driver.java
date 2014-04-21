package Cars;

import Util.ReadSource;

public class Driver {
	public static void main(String[] args){
		ReadSource readSource=new ReadSource();
		Automotive FordZTW=readSource.readFromFileToArray("X:\\Radha\\car-config\\src\\FordZTW.txt");
		FordZTW.print();
		readSource.serializeAuto(FordZTW);
		Automotive newFordZTW = readSource.DeserializeAuto("X:\\Radha\\car-config\\src\\auto.ser");
		newFordZTW.print();
	}
	

}
