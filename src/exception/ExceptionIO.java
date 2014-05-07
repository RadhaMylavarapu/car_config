package exception;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.StringTokenizer;
import exception.FixProblems;

public class ExceptionIO {
	FixProblems problem;

	// reads the exception message from the text file
	public String openFile(int number) {
		String errorMsg = "Something went wrong...";

		try {
			BufferedReader bufferedReader = null;
			bufferedReader = new BufferedReader(new FileReader(
					"X:\\Radha\\car-config\\src\\txtfiles\\Exception.txt"));
			String line = null;
			int errorNo = 0;
			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "=");

				String s1 = st.nextToken();

				errorNo = Integer.parseInt(s1.trim());
				if (number == errorNo) {
					errorMsg = st.nextToken();
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return errorMsg;

	}
}
