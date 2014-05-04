package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import exception.FixProblems;

public class ExceptionIO {
	FixProblems problem;

	public void openFile(int number) {
		try {
			BufferedReader bufferedReader = null;
			bufferedReader = new BufferedReader(new FileReader(
					"X:\\Radha\\car-config\\src\\Exception.txt"));
			String line = null;
			int errorNo = 0;
			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "=");

				String s1 = st.nextToken();

				errorNo = Integer.parseInt(s1.trim());
				if (number == errorNo) {
					String errorMsg = st.nextToken();
					problem = new FixProblems(errorNo, errorMsg);
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
