package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//This class used to print console errors in text file
public class ExceptionLogging {
	public static void log() {

		PrintStream console = System.err;

		File file = new File("err.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		PrintStream ps = new PrintStream(fos);
		System.setErr(ps);

		try {
			throw new Exception("Exception goes to err.txt too");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.setErr(console);

	}

}
