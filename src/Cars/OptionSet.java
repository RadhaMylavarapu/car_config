package Cars;

import java.util.Arrays;

/**
 * 
 * @author Radha class OptionSet Innerclass Option
 * 
 */
public class OptionSet implements java.io.Serializable {
	String name;
	Option[] option;

	/**
	 * constructor
	 */
	public OptionSet() {

	}

	public OptionSet(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 * @param count
	 *            = no of options
	 */
	public OptionSet(String name, int count) {
		this.name = name;
		option = new Option[count];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Option[] getOptions() {
		return option;
	}

	public void setOption(Option[] option) {
		this.option = option;
	}

	/**
	 * sets the ith Option to the specified name and price.
	 * 
	 * @param i
	 * @param name
	 * @param price
	 */
	public void setOption(int i, String optionName, int optionprice) {
		Option[] op = getOptions();
		Option option = op[i];
		System.out.println("Before Update");
		System.out.println("option :"+option);
		op[i].setName(optionName);
		op[i].setCost(optionprice);
		System.out.println("After update");
		System.out.println(op[i]);

	}

	/**
	 * return the option by taking the name
	 * 
	 * @param name
	 * @return
	 */
	public Option getOption(String optionName) {
		Option[] op = getOptions();
		for (int j = 0; j < op.length; j++) {
			String s = op[j].getName();
			Option option = op[j];
			if ((optionName).equalsIgnoreCase(s)) {
				return op[j];
			}
		}
		return null;
	}

	/**
	 * It takes option name as an argument and returns the value or cost for the
	 * option
	 * 
	 * @param name
	 * @return
	 */
	public int getOptionPrice(String optionName) {
		Option[] op = getOptions();
		for (int j = 0; j < op.length; j++) {
			Option option = op[j];
			if ((optionName).equals(option.getName())) {
				System.out.println(option.getName()+"cost:");
				int cost = option.getCost();
				return cost;
			}
		}
		return 0;
	}

	/**
	 * It takes the option name if it's found, returns the index (i.e., the
	 * number) of the Option with the specified name; otherwise it returns -1.
	 * 
	 * @param name
	 * @return
	 */
	private int findOption(String optionName) {
		Option[] op = getOptions();
		for (int j = 0; j < op.length; j++) {
			Option option = op[j];
			if ((optionName).equals(option.getName())) {
				return j;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "optionSet [name=" + name + ", options="
				+ Arrays.toString(option) + "]";
	}

	/**
	 * Innerclass Option
	 * 
	 * @author Radha
	 * 
	 */
	public class Option implements java.io.Serializable {
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

		@Override
		public String toString() {
			return "Option [name=" + name + ", cost=" + cost + "]";
		}

	}

}
