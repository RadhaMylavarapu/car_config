package client;

import model.Automobile;
import model.util.ReadSource;
import exception.FixProblems;

public class Driver4 {
	public static void main(String[] args) throws FixProblems {
		ReadSource readSource = new ReadSource();
		Automobile fordZTW=null;
		String fileName = "X://Radha\\car-config\\src//FordZTW2.txt";
		//int count = 0;
		
			// Build Automobile Object from a file.
		try{

				fordZTW = readSource.buildAutoObject(fileName);
		}
		 catch (FixProblems e) {
				e=new FixProblems(103);
			}
		}

}
