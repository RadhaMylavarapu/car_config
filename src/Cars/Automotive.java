package Cars;

import java.util.Arrays;

public class Automotive {
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

	@Override
	public String toString() {
		return "Automotive [name=" + name + ", optionSet="
				+ Arrays.toString(opSet) + "]";
	}

}
