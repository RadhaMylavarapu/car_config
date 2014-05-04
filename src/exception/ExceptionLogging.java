package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ExceptionLogging {
	public static void log() {

		//System.err.println("This goes to the console");
		PrintStream console = System.err;

		File file = new File("err1.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintStream ps = new PrintStream(fos);
		System.setErr(ps);

		//System.err.println("This goes to err.txt");

		try {
			throw new Exception("Exception goes to err.txt too");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.setErr(console);
		//System.err.println("This also goes to the console");
	}
	/**
	 * PrintWriter out = null; try { out = new PrintWriter("application.log");
	 * out.println(msg); } catch (Exception e) { e.printStackTrace(); } finally
	 * { out.close(); } }
	 **/
}
