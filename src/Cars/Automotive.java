package Cars;

import java.util.Arrays;

import Cars.OptionSet.Option;

public class Automotive  implements java.io.Serializable {
	String name;
	OptionSet[] opSet;
	int basicPrice;

	public Automotive() {

	}

	public Automotive(String name, OptionSet[] opSet, int basicPrice) {
		this.name = name;
		this.opSet = opSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OptionSet[] getOptionSet() {
		return opSet;
	}

	public void setOptionSet(OptionSet[] opSet) {
		this.opSet = opSet;
	}

	public int getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(int basicPrice) {
		this.basicPrice = basicPrice;
	}

	public void print() {
		System.out.println("Name: "+getName());
		OptionSet[] optionSet = getOptionSet();
		for (int i = 0; i < getOptionSet().length; i++) {
			System.out.println();
			System.out.println("OptionSet" + i);
			System.out.println("-------------");
			OptionSet optionSet2 = optionSet[i];
			System.out.println(optionSet2.getName());
			System.out.println("-----------------");
			Option[] op = optionSet2.getOption();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
				System.out.println(option.getName() + "," + option.getCost());

			}
		}
	}

	@Override
	public String toString() {
		return "Automotive [name=" + name + ", optionSet="
				+ Arrays.toString(opSet) + "]";
	}

}
