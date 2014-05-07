package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

//custom exception
public class FixProblems extends Exception {

	private int errorno;
	private String errormsg;
	ExceptionIO e1 = new ExceptionIO();

	public FixProblems() {
		super();

	}

	public FixProblems(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public FixProblems(int errorno) {
		super();
		this.errorno = errorno;
		//e1.openFile(errorno);
		this.errormsg = "WOW!!" + e1.openFile(errorno);
		System.out.println(this.errormsg);
		

	}

	public FixProblems(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
	}

	public FixProblems(Exception e, String currentStep) {
		super(e);
		this.errorno = 0;
		if (e instanceof FileNotFoundException) {
			if (currentStep.equals("FILE_READ")) {
				this.errorno = 101;
			}
		} else if (e instanceof NoSuchElementException) {
			if (currentStep.equals("OPTION PRICE")) {
				this.errorno = 108;
			} else if (currentStep.equals("OPTION SET")) {
				this.errorno = 103;
			}
		} else if (e instanceof NumberFormatException) {
			if (currentStep.equals("OPTION PRICE")) {
				this.errorno = 110;
			}
		} else if (e instanceof IOException) {
			new FixProblems(105);
		} else if (e instanceof ArrayIndexOutOfBoundsException) {
			this.errorno = 105;
		}
		ExceptionLogging.log();
		this.errormsg = "WOW!!" + e1.openFile(errorno);
		System.out.println(this.errormsg);
	}

	public int getErrorno() {
		return errorno;
	}

	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	public void printmyproblem() {
		ExceptionLogging.log();
		System.out.println("FixProblems [errorno=" + errorno + ", errormsg="
				+ errormsg + "]");

	}

	public String fixProblemReadFromConsole() {
		String a = "X:\\Radha\\car-config\\src\\txtfile\\FordZTW.txt";
		System.out.print("To fix Problem Read From Console");
		return a;
	}
}
