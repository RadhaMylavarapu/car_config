package Util;

import java.io.*;
import java.util.StringTokenizer;

import Cars.Automotive;
import Cars.OptionSet;
import Cars.OptionSet.Option;

public class ReadSource {
	Automotive a = null;
/**
 * buildAutoObject() reads the data from the file to Automotive object
 * @param filename
 * @return
 */
	public Automotive buildAutoObject(String filename) {

		try {
			BufferedReader bufferedReader = null;
			bufferedReader = new BufferedReader(new FileReader(filename));
			String line = null;
			a = new Automotive("Ford's Wagon ZTW", 5, 18445);

			int count = 0;
			int cost = 0;
			int optionCount = 0, optionSetCount = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if (!line.contains(":")) {
					continue;
				}
				String optionSetName = null;
				StringTokenizer st = new StringTokenizer(line, ":");
				String s = st.nextToken();
				if ((s).equals("keys")) {
					optionSetName = st.nextToken();
					count = Integer.parseInt(st.nextToken().trim());
					a.setOptionSet(optionSetName, count, optionSetCount);
					optionSetCount++;
					optionCount = 0;
				} else if (!(s).equals("keys")) {

					cost = Integer.parseInt(st.nextToken().trim());
					a.setOption(optionSetName, s, cost, optionCount,
							optionSetCount - 1, count);
					optionCount++;
				}

			}
			a.print();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return a;

	}
/**
 * serializeAuto() reads the data from the file to object
 * @param a
 */
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

	/**
	 * reads the data from the object to file
	 * @param fileName
	 * @return
	 */
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

}
