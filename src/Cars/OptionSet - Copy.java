package Cars;

import java.util.Arrays;

/**
 * 
 * @author Radha class OptionSet Innerclass Option
 * 
 */
public class OptionSet implements java.io.Serializable {
	private String name;
	private Option[] option;

	/**
	 * constructor
	 */
	protected OptionSet() {

	}

	protected OptionSet(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 * @param count
	 *            = no of options
	 */
	protected OptionSet(String name, int count) {
		this.name = name;
		option = new Option[count];
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected Option[] getOptions() {
		System.out.println(option.toString());
		return option;
	}

	protected void setOption(Option[] option) {
		this.option = option;
	}

	/**
	 * sets the ith Option to the specified name and price.
	 * 
	 * @param i
	 * @param name
	 * @param price
	 */
	protected void setOption(int i, String optionName, int optionprice) {
		if (i < (option.length)) {
			option[i] = new Option(optionName, optionprice);
			System.out.println(option[i].getName());
			// option[i].setCost(optionprice);
		}
		// System.out.println("option :"+option);

	}

	/**
	 * return the option by taking the name
	 * 
	 * @param name
	 * @return
	 */
	protected Option getOption(String optionName) {
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
	protected int getOptionPrice(String optionName) {
		Option[] op = getOptions();
		for (int j = 0; j < op.length; j++) {
			Option option = op[j];
			if ((optionName).equals(option.getName())) {
				System.out.println(option.getName() + "cost:");
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
		private String name;
		private int cost;

		protected Option() {

		}

		protected Option(String name, int cost) {

			this.name = name;
			this.cost = cost;
		}

		protected String getName() {
			return name;
		}

		protected void setName(String name) {
			this.name = name;
		}

		protected int getCost() {
			return cost;
		}

		protected void setCost(int cost) {
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Option [name=" + name + ", cost=" + cost + "]";
		}

	}

}
