package Cars;

import Util.ReadSource;

public class Test {
	public static void main(String[] args) {
		ReadSource rs = new ReadSource();
		Automotive auto1 = rs
				.buildAutoObject("X:\\Radha\\car-config\\src\\FordZTW.txt");
		Automotive auto = new Automotive();
		Automotive auto11 = new Automotive("Focus Wagon ZTW", 5, 18445);
		OptionSet ops = new OptionSet();
		// setName() inthe Atuomotive class
		System.out.println();
		System.out.println();
		System.out
				.println("*************************************************************************************************************************************");
		System.out
				.println("setName() Method Sets the Name for the Model in the Automotive class.");
		auto.setName("Focus Wagon ZTW");
		System.out.println(" Car MOdel name :" + auto.getName());// to get the
																	// name of
																	// the model
		System.out.println();
		System.out
				.println("setBasicPrice() method set the base price for the car model ");
		auto.setBasicPrice(18445);// sets the base price for the car model
		System.out.println("Model Price:" + auto.getBasicPrice());// gives the
																	// base
																	// price for
																	// model
		System.out.println();
		System.out
				.println("getOptionSet() methos gives the required optionSet ");
		OptionSet[] optionSet = auto1.getOptionSet();
		for (int i = 0; i < auto1.opSet.length; i++) {
			ops = auto1.getOptionSet(i);
			System.out.println(ops);
		}

		System.out.println();
		System.out
				.println("getOptionSet(by index) method gives the required optionSet ");
		for (int i = 0; i < auto1.opSet.length; i++) {
			if (optionSet[i].getName().equals("Color")) {

				ops = auto1.getOptionSet(i);
				System.out.println(ops);
				System.out.println();
			}
		}

		// {
		// System.out.println(optionset[i]);
		// }

		ops.getClass();
		//
		// System.out
		// .println("//////////////////////////////////////////////////");
		// OptionSet[] optionSet = auto1.getOptionSet();
		for (int i = 0; i < auto1.opSet.length; i++) {
			if (optionSet[i].getName().equals("Color")) {
				System.out
						.println("Get OptionSet (by index value)  method takes the index value as a parameter and returns the optionset in that index if exits ,otherwise returns null ");
				System.out.println(auto1.getOptionSet(2));
				System.out
						.println("Find OptionSet( with name) method takes optionSet name as aparameter and returns optionSet if exits ,oterwise returns null if not exits");
				System.out.println(auto1.findOptionSet("color".trim()));
				System.out.println(auto1.findOptionSet("Gear"));
				System.out
						.println("Find Option (with name) method takes option name as a parameter and returns option if exists,otherwise returns null if not exists");
				System.out.println(auto1
						.findOption("French Blue Clearcoat Metallic"));
				System.out
						.println("set values of Option(in the context of optionset) :");
				System.out
						.println("It takes the optionset,name of the option ,new option name and newprice as a parameter and setvalues for the option");

			//	auto.setOption(optionSet[i], "French Blue Clearcoat Metallic",
					//	"blue", 100);
				System.out.println();
				System.out.println();

				System.out
						.println("setOption(int i, String optionName, int optionprice) method in OptionSet class");
				optionSet[i].setOption(3, "Red", 200);
				System.out.println();
				System.out.println();
				System.out
						.println(" getOptionPrice(String optionName) method in OptionSet class takes option name and gives it's price");
				System.out.print(optionSet[i].getOptionPrice("blue"));
				System.out.println();
				System.out.println(optionSet[i]
						.getOptionPrice("French Blue Clearcoat Metallic"));
				System.out.println();
				System.out.println();
				System.out
						.println(" findOption(String optionname) method takes optionname as parameter and  if it exit returns values oterwise returns null ");
				ops.getClass();
				Cars.OptionSet.Option option = auto1
						.findOption("CD Silver Clearcoat Metallic".trim());
				System.out.println("Option Details" + option);
				Cars.OptionSet.Option option1 = auto1.findOption("pandhi"
						.trim());
				System.out.println("Option Details" + option1);

			}
		}
	}
}

/**
 * auto.print();
 * 
 * for (int i = 0; i < optionSet.length; i++) { if
 * (optionSet[i].getName().equals("Color")) {
 * System.out.println(optionSet[i].getOption("Blue"));
 * System.out.println("-------------3----------");
 * System.out.println(optionSet[i]
 * .getOption("French Blue Clearcoat Metallic")); }
 * 
 * }
 * 
 * 
 * }
 **/

