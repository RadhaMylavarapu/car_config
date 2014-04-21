package Util;

import java.io.*;
import java.util.StringTokenizer;

import Cars.Automotive;
import Cars.OptionSet;
import Cars.OptionSet.Option;

public class ReadSource {

	/**
	 * Reads text from a file line by line
	 */
	public void readFromFile(String filename) {

		BufferedReader bufferedReader = null;

		try {

			// Construct the BufferedReader object
			bufferedReader = new BufferedReader(new FileReader(filename));

			String line = null;

			while ((line = bufferedReader.readLine()) != null) {
				// Process the data, here we just print it out
				System.out.println(line);
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// Close the BufferedReader
		try {
			if (bufferedReader != null)
				bufferedReader.close();
		} catch (IOException ex) {
			System.out.println("Error -- " + ex.toString());
		}
	}

	public void readFromFileToArray(String filename) {
		try {
			BufferedReader bufferedReader = null;
			bufferedReader = new BufferedReader(new FileReader(filename));
			String line = null;
			Automotive a = new Automotive();
			a.setName("Ford");
			a.setBasicPrice(1000);
			OptionSet[] opset = new OptionSet[5];
			OptionSet ops = null;
			Option[] op = null;
			int count = 0;
			int cost = 0;
			int optionCount = 0, optionSetCount = 0;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("line="+line);
				if (!line.contains(":")) {
					continue;
				}
				StringTokenizer st = new StringTokenizer(line, ":");
				String s = st.nextToken();
				if ((s).equals("keys")) {
					System.out.println("***creating optionset");
					ops = new OptionSet();
					ops.setName(st.nextToken());
					count = Integer.parseInt(st.nextToken().trim());
					op = new Option[count];
					ops.setOption(op);
					opset[optionSetCount++] = ops;
					optionCount=0;
				} else if (!(s).equals("keys")) {
					System.out.println("***creating option");
					OptionSet.Option o = new OptionSet().new Option();
					o.setName(s);
					cost = Integer.parseInt(st.nextToken().trim());
					o.setCost(cost);
					op[optionCount++] = o;
				}

			}
			print(opset);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		/**
		 * BufferedReader bufferedReader = null;
		 * 
		 * try {
		 * 
		 * // Construct the BufferedReader object bufferedReader = new
		 * BufferedReader(new FileReader(filename));
		 * 
		 * String line = null; OptionSet[] optionset = new OptionSet[5];
		 * 
		 * // Process the data, here we just print it out
		 * 
		 * 
		 * int count = 1;
		 * 
		 * while ((line = bufferedReader.readLine()) != null) {
		 * 
		 * // System.out.println(j); StringTokenizer st = new
		 * StringTokenizer(line, ":"); // String sID = st.nextToken();
		 * OptionSet.Option ops = new OptionSet().new Option(); String s =
		 * st.nextToken(); if ((s).equals("keys")) { OptionSet opset = new
		 * OptionSet(); opset.setName(st.nextToken());
		 * System.out.println(opset.getName()); String strTotal =
		 * st.nextToken(); count = Integer.parseInt(strTotal.trim());
		 * System.out.println(count); optionset[i] = new
		 * OptionSet(opset.getName(), count); //
		 * System.out.println(optionset[i]); break; } else if
		 * (!(s).equals("keys")) { for(int j=0;j<count;j++){ Option[] op = new
		 * Option[count]; // System.out.println(op); ops.setName(s);
		 * System.out.println(ops.getName()); int cost =
		 * Integer.parseInt(st.nextToken().trim()); ops.setCost(cost);
		 * System.out.println(ops.getCost()); op[j] = new OptionSet().new
		 * Option(ops.getName(),ops.getCost()); } } } }
		 * 
		 * print(optionset); } catch (Exception ex) { ex.printStackTrace(); } //
		 * Close the BufferedReader try { if (bufferedReader != null)
		 * bufferedReader.close(); } catch (IOException ex) {
		 * System.out.println("Error -- " + ex.toString()); }
		 **/
	}

	private void print(OptionSet[] optionsetarray) {
		for (int i = 0; i < optionsetarray.length; i++) {
			System.out.println("***OptionSet" + i);
			OptionSet optionSet2 = optionsetarray[i];
			System.out.println(optionSet2.getName());
			Option[] op = optionSet2.getOption();
			for (int j = 0; j < op.length; j++) {
				Option option = op[j];
				System.out.println(option.getName() + "," + option.getCost());
			}
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		ReadSource obj = new ReadSource();
		// obj.readFromFile("X:\\Radha\\car-config\\src\\FordZTW.txt");
		obj.readFromFileToArray("X:\\Radha\\car-config\\src\\FordZTW.txt");
	}

}
