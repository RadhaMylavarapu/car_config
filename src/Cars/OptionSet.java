package Cars;

import java.util.Arrays;

public class OptionSet {
	String name;
	String[] options;

	public OptionSet() {

	}

	public OptionSet(String color, int count) {
		this.name = color;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public void setOption(int i, String name, int price) {

	}

	public Option getOption(String name) {
		return null;

	}

	public int getOptionPrice(String name) {
		return 0;
	}

	private int findOption(String name) {
		return 0;
	}


	@Override
	public String toString() {
		return "optionSet [color=" + name + ", options="
				+ Arrays.toString(options) + "]";
	}

	public class Option {
		String name;
		double cost;

		public Option() {

		}

		public Option(String name, double cost) {
			super();
			this.name = name;
			this.cost = cost;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

	}

}
