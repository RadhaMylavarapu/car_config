package Util;

import java.io.*;
import java.util.StringTokenizer;

import Cars.Automotive;
import Cars.OptionSet;
import Cars.OptionSet.Option;

public class ReadSource {
	Automotive a = null;

	public Automotive readFromFileToArray(String filename) {

		try {
			BufferedReader bufferedReader = null;
			bufferedReader = new BufferedReader(new FileReader(filename));
			String line = null;
			a = new Automotive();
			a.setName("Ford");
			a.setBasicPrice(1000);
			OptionSet[] opset = new OptionSet[5];
			OptionSet ops = null;
			Option[] op = null;
			int count = 0;
			int cost = 0;
			int optionCount = 0, optionSetCount = 0;
			while ((line = bufferedReader.readLine()) != null) {
				// System.out.println("line="+line);
				if (!line.contains(":")) {
					continue;
				}
				StringTokenizer st = new StringTokenizer(line, ":");
				String s = st.nextToken();
				if ((s).equals("keys")) {
					// System.out.println("optionset");
					// System.out.println("---------");
					ops = new OptionSet();
					ops.setName(st.nextToken());
					count = Integer.parseInt(st.nextToken().trim());
					op = new Option[count];
					ops.setOption(op);
					opset[optionSetCount++] = ops;
					optionCount = 0;
				} else if (!(s).equals("keys")) {
					// System.out.println("***creating option");
					OptionSet.Option o = new OptionSet().new Option();
					o.setName(s);
					cost = Integer.parseInt(st.nextToken().trim());
					o.setCost(cost);
					op[optionCount++] = o;
				}

			}
			// print(opset);
			a.setOptionSet(opset);
			System.out.println(a);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return a;

	}

	public void serializeAuto(Automotive a) {
		try {
			FileOutputStream fileOut = new FileOutputStream(
					"X:\\Radha\\car-config\\src\\auto.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(a);
			out.close();
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Automotive DeserializeAuto(String fileName) {
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			a = (Automotive) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();

		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}

		return a;

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		ReadSource obj = new ReadSource();
		obj.readFromFileToArray("X:\\Radha\\car-config\\src\\FordZTW.txt");
	}

}
