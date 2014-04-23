package Cars;

import java.util.Arrays;
import Cars.OptionSet.Option;

/**
 * Class Automotive
 * 
 * @author Radha
 * 
 */
public class Automotive implements java.io.Serializable {
	String name;
	OptionSet[] opSet;
	int basePrice;

	public Automotive() {

	}

	public Automotive(String name, int optionSetSize, int basePrice) {
		this.name = name;
		this.basePrice = basePrice;
		opSet = new OptionSet[optionSetSize];
	}

	public String getName() {
		return name;
	}

	public OptionSet[] getOptionSet() {
		return opSet;
	}

	public OptionSet getOptionSet(int i) {
		return opSet[i];
	}

	public int getBasicPrice() {
		return basePrice;
	}

	/**
	 * find the optionset by taking the name and return index where it loated if
	 * it exits . If it is not found returns -1.
	 * 
	 * @param name
	 * @return int
	 */
	public int findOptionSet(String optionSetname) {
		OptionSet op1 = new OptionSet();
		int j = 0;
		OptionSet[] op = new OptionSet[opSet.length];
		for (int i = 0; i < opSet.length; i++) {
			op[i] = getOptionSet(i);
			if ((op[i].getName()).equals(optionSetname)) {
				j = i;
				return j;
			}

		}
		System.out.println("There is optionset with this name");
		return -1;
	}

	/**
	 * it takes the option name and searches for the option.If it exits returns
	 * option .If not returns null
	 * 
	 * @param name
	 * @return Option
	 */
	public Option findOption(String optionname) {

		for (int i = 0; i < opSet.length; i++) {
			OptionSet optionSet1 = getOptionSet(i);
		    OptionSet optionSet2 = optionSet1;
			Option[] op = optionSet2.getOptions();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
				if ((optionname).equals(option.getName())) {
					System.out.println(optionSet2.getName());
					return option;
				}
			}
		}
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOptionSet(OptionSet[] opSet) {
		this.opSet = opSet;
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
	public void setOption(OptionSet opSet, String optionName,
			String newOptionName, int newCost) {
		OptionSet opset = new OptionSet();
		System.out.println("Before changes");
		System.out.println("optionSet Name:" + opSet.getName());
		Option option = opSet.getOption(optionName);
		System.out.println(option);
		option.setCost(newCost);
		option.setName(newOptionName);
		System.out.println("After update");
		System.out.println(option);
	}

	/**
	 * prints the optionset and option array
	 */
	public void print() {
		System.out.println("Make:" + "FORD");
		System.out.println("Name of the Model: " + getName());
		for (int i = 0; i < opSet.length; i++) {
			OptionSet optionSet = getOptionSet(i);
			System.out.println();
			System.out.println("OptionSet" + i);
			System.out
					.println("------------------------------------------------------------------------------------------------------");
			OptionSet optionSet2 = optionSet;
			System.out.printf("%23S %70s \n", optionSet2.getName(), " cost");
			System.out.printf("%23s %70s \n", "-------------------------",
					"--------");
			Option[] op = optionSet2.getOptions();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
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
