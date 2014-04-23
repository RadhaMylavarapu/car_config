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
		this.opSet = new OptionSet[optionSetSize];
	}

	public String getName() {
		return name;
	}

	public int getBasicPrice() {
		return basePrice;
	}

	public OptionSet[] getOptionSet() {
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
		System.out.println("+++++++++++++++++++++");
		System.out.println(opSet[index].getName());
		System.out.println("+++++++++++++++++++++");

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
		opSet[optionSetIndex] = new OptionSet(optionSetName, count);
		opSet[optionSetIndex].setOption(optionIndex, optionName, cost);

	}

	/**
	 * prints the optionset and option array
	 */
	public void printOptionSet() {
		OptionSet[] OpSet = getOptionSet();
		for (int i = 0; i < opSet.length; i++) {
			System.out.println(opSet[i].getName());
		}

	}

	/**
	 * public void print() { System.out.println("Name: "+getName()); OptionSet[]
	 * opSet=getOptionSet(); System.out.println("Make:" + "FORD");
	 * System.out.println("Name of the Model: " + getName()); for (int i = 0; i
	 * < opSet.length; i++) { OptionSet optionSet = getOptionSet(i);
	 * System.out.println(); System.out.println("OptionSet" + i); System.out
	 * .println(
	 * "------------------------------------------------------------------------------------------------------"
	 * ); OptionSet optionSet2 = opSet[i]; System.out.printf("%23S %70s \n",
	 * optionSet2.getName(), " cost"); System.out.printf("%23s %70s \n",
	 * "-------------------------", "--------"); Option[] op =
	 * optionSet.getOptions(); for (int j = 0; j < op.length; j++) { op[j] = new
	 * OptionSet().new Option(); Option option = op[j];
	 * System.out.println(op[j]);
	 * 
	 * System.out.println(option); System.out.printf("%-33s%61d \n",
	 * option.getName(), option.getCost());
	 * 
	 * } } }
	 **/

	@Override
	public String toString() {
		return "Automotive [name=" + name + ", optionSet="
				+ Arrays.toString(opSet) + "]";
	}

}
