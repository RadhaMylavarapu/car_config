package client;

import model.Automobile;
import model.util.ReadSource;
//import exception.ExceptionLogging;
import exception.FixProblems;

public class Driver3 {
	public static void main(String[] args) throws FixProblems {
		ReadSource readSource = new ReadSource();
		Automobile fordZTW=null;
		String fileName = "X://Radha\\car-config\\src//FordZTW1.txt";
		//int count = 0;
		
			// Build Automobile Object from a file.
		try{

				fordZTW = readSource.buildAutoObject(fileName);
		}
		 catch (FixProblems e) {
				e=new FixProblems(108);
			}
		}
	}


