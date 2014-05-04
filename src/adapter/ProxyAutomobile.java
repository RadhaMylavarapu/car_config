package adapter;


import exception.FixProblems;

import model.Automobile;
import model.util.ReadSource;

public abstract class ProxyAutomobile {

	private static Automobile automobile = null;

	public void buildAuto(String fileName) throws FixProblems {

		ReadSource rs = new ReadSource();
		automobile = rs.buildAutoObject(fileName);

	}

	public void printAuto(String modelName) throws FixProblems {
		
			automobile.printAuto(modelName);
			modelName=automobile.getName();
			System.out.println(modelName);
		
	}

	public void updateOptionSetName(String modelName, String optionSetName,
			String newName) throws FixProblems {
		automobile.updateOptionSet(optionSetName, newName);

	}

	public void updateOptionPrice(String modelName, String optionName,
			String newOptionName, int newPrice) {
		try {
			automobile.updateOptionPrice(optionName, newOptionName, newPrice);
		} catch (Exception e) {

		}

	}

}
