package cars;

import java.util.Arrays;


import cars.OptionSet.Option;


/**
 * Class Automobile
 * 
 * @author Radha
 * 
 */
public class Automotive implements java.io.Serializable {
	private String name;
	private OptionSet[] opSet;
	private int basePrice;

	public Automotive() {

	}

	public Automotive(String name, int optionSetSize, int basePrice) {
		this.name = name;
		this.basePrice = basePrice;
		this.opSet = new OptionSet[optionSetSize];
	}

	public String getName() {
		return name;
	}

	public int getBasicPrice() {
		return basePrice;
	}

	public OptionSet[] getOptionSet() {
		System.out.println(opSet);
		return opSet;
	}

	public OptionSet getOptionSet(int j) {
		if (j > opSet.length - 1) {
			return null;
		}
		return opSet[j];

	}

	/**
	 * find the optionset by taking the name and return index where it loated if
	 * it exits . If it is not found returns -1.
	 * 
	 * @param name
	 * @return int
	 */
	public OptionSet findOptionSet(String optionSetName) {

		for (int i = 0; i < opSet.length; i++) {
			if ((opSet[i].getName()).equalsIgnoreCase(optionSetName)) {
				return opSet[i];
			}

		}
		System.out.println("There is  no optionset with this name");
		return null;
	}

	/**
	 * it takes the option name and searches for the option.If it exits returns
	 * option .If not returns null
	 * 
	 * @param name
	 * @return Option
	 */
	public Option findOption(String optionName) {

		for (int i = 0; i < opSet.length; i++) {
			OptionSet optionSet = getOptionSet(i);
			Option[] op = optionSet.getOptions();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
				if ((optionName).equals(option.getName())) {
					System.out.println(option.getName());
					System.out.println(optionSet.getName());
					return option;
				}
			}
		}
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOptionSet(String optionSetName, int count, int index) {
		opSet[index] = new OptionSet(optionSetName, count);
	}

	public void setBasicPrice(int basicPrice) {
		this.basePrice = basicPrice;
	}

	/**
	 * setOption
	 * 
	 * @param opSet
	 * @param optionName
	 */
	public void setOption(String optionSetName, String optionName, int cost,
			int optionIndex, int optionSetIndex, int count) {
		// opSet[optionSetIndex] = new OptionSet(optionSetName, count);
		opSet[optionSetIndex].setOption(optionIndex, optionName, cost);

	}

	public void DeleteOptionSet(String optionSetName) {
		boolean deleted=false;
		for (int i = 0; i < opSet.length; i++) {
			if ((optionSetName).equalsIgnoreCase(opSet[i].getName())) {
				if (i < opSet.length - 1) {
					opSet[i] = opSet[i + 1];
					opSet[i+1]=null;
					for (int j = i + 1; j < opSet.length-1; j++) {
						opSet[j] = opSet[j + 1];
						break;
						
					}
					
					
				} else if (i == opSet.length - 1) {
					opSet[i] = null;
				}
				deleted=true;
				break;
			}
		}
			

		}
		
	

	public void DeleteOption(String optionName) {
		boolean deleted = false;
		for (int i = 0; i < opSet.length; i++) {
			OptionSet optionSet = getOptionSet(i);
			System.out.println(optionSet.getName());
			Option[] op = optionSet.getOptions();
			// System.out.println();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
				if ((optionName).equalsIgnoreCase(option.getName())) {
					if (j < op.length - 1) {
						op[j] = op[j + 1];
						op[j + 1] = null;
						for (int k = j + 1; k < op.length - 1; k++) {
							op[k] = op[k + 1];
						}
					} else if (j == op.length - 1) {
						op[j] = null;
					}
					deleted = true;
					break;
				}
			}
			if (deleted) {
				break;
			}
		}

	}

	public void updateOptionSet(String optionSetName, String newoptionSetName) {

		for (int i = 0; i < opSet.length; i++) {
			if ((opSet[i].getName()).equalsIgnoreCase(optionSetName)) {
				opSet[i].setName(newoptionSetName);
				System.out.println(opSet[i].toString());
			}

		}
	}

	public void updateOption(String optionName, String newOptionName,
			int newcost) {
		for (int i = 0; i < opSet.length; i++) {
			OptionSet optionSet = getOptionSet(i);
			Option[] op = optionSet.getOptions();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
				if ((optionName).equals(option.getName())) {
					option.setName(newOptionName);
					option.setCost(newcost);
					System.out.println(option.toString());
				}

			}

		}

	}

	public void print() {
		System.out.println("Name of the car: " + getName());
		System.out.println("Car Make:" + "FORD");
		System.out.println("Car Model: " + getName());
		System.out.println("Basic Model price" + getBasicPrice());
		for (int i = 0; i < opSet.length; i++) {
			System.out.println();
			System.out.println("OptionSet " + i);
			System.out
					.println("------------------------------------------------------------------------------------------------------");
			OptionSet optionSet = opSet[i];
			System.out.printf("%23S %70s \n", optionSet.getName(), " cost");
			System.out.printf("%23s %70s \n", "-------------------------",
					"--------");
			Option[] op = optionSet.getOptions();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
				if (option == null) {
					System.out.println("no option at " + j);
					continue;
				}
				System.out.printf("%-33s%61d \n", option.getName(),
						option.getCost());

			}
		}
	}

	@Override
	public String toString() {
		return "Automotive [name=" + name + ", optionSet="
				+ Arrays.toString(opSet) + "]";
	}

}
