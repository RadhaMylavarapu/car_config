package model.util;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;
import model.Automobile;
import exception.FixProblems;

public class ReadSource {
	Automobile a = null;

	/**
	 * buildAutoObject() reads the data from the file to Automotive object
	 * 
	 * @param filename
	 * @return
	 * @throws FileNotFoundException
	 * @throws FixProblems
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public Automobile buildAutoObject(String filename) throws FixProblems {
		String currentStep = "";
		try {
			BufferedReader bufferedReader = null;
			currentStep = "FILE_READ";
			bufferedReader = new BufferedReader(new FileReader(filename));
			String line = null;
			a = new Automobile("Ford's Wagon ZTW", 5, 18445);

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
					currentStep = "OPTION SET";
					optionSetName = st.nextToken();
					count = Integer.parseInt(st.nextToken().trim());
					a.setOptionSet(optionSetName, count, optionSetCount);
					optionSetCount++;
					optionCount = 0;
				} else if (!(s).equals("keys")) {
					if (optionCount < count) {
						currentStep = "OPTION PRICE";
						cost = Integer.parseInt(st.nextToken().trim());
						a.setOption(optionSetName, s, cost, optionCount,
								optionSetCount - 1, count);
						optionCount++;
					} else {
						System.out.println("Array out of Bounds");
					}

				}
			}

			a.print();
		} catch (Exception ex) {
			throw new FixProblems(ex, currentStep);
			// throw new FixProblems(101);
		}
		return a;

	}

	/**
	 * serializeAuto() reads the data from the file to object
	 * 
	 * @param a
	 */
	public void serializeAuto(Automobile a) {
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
	 * 
	 * @param fileName
	 * @return
	 */
	public Automobile DeserializeAuto(String fileName) {
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			a = (Automobile) in.readObject();
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
