package Cars;

import java.util.Arrays;

public class Automotive {
	String name;
	String[] optionSet;
	
	public Automotive() {
		
	}

	public Automotive(String name, String[] optionSet){
		this.name = name;
		this.optionSet = optionSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getOptionSet() {
		return optionSet;
	}

	public void setOptionSet(String[] optionSet) {
		this.optionSet = optionSet;
	}

	@Override
	public String toString() {
		return "Automotive [name=" + name + ", optionSet="
				+ Arrays.toString(optionSet) + "]";
	}
	
	

}
