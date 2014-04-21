package Cars;

import java.util.Arrays;

public class OptionSet {
	String name;
	Option[] option;

	public OptionSet() {

	}
	public OptionSet(String name){
		this.name=name;
	}

	public OptionSet(String name, int count) {
		this.name = name;
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Option[] getOption() {
		return option;
	}

	public void setOption(Option[] option) {
		this.option = option;
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
				+ Arrays.toString(option) + "]";
	}

	public class Option {
		String name;
		int cost;

		public Option() {

		}

		public Option(String name, int cost) {
			
			this.name = name;
			this.cost = cost;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

	}

}
