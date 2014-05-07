package client;

import model.Automobile;

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
		String fileName = "X://Rha\\car-config\\src//FordZTW1.txt";
		int i = 0;
		while (fordZTW == null && i < 2) {
			// Build Automobile Object from a file.
			try {
				
				fordZTW = readSource.buildAutoObject(fileName);
				i = 2;
				break;
			} catch (FixProblems e) {
				System.out.println(e);
				ExceptionLogging.log();
				fileName = e.fixProblemReadFromConsole();
				System.out.println(" Enter the correct file Name :" + fileName);
				i++;
				System.out.println("\n");
				
			} finally {
				if(i!=2){
				System.out
						.println("Sorry!FileName you entered was wrong again.Please check it again........");
				fileName = "X:\\Radha\\car-config\\src\\txtfiles\\FordZTW1.txt";
				}
				System.out.println("\n");
				System.out.println("\n");
			}
		}
	}
}
