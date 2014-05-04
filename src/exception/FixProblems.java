package exception;

import java.util.Arrays;

public class FixProblems extends Exception {
			
	private int errorno;
	private String errormsg;
	ExceptionIO e=new ExceptionIO();
	
	public FixProblems() {
		super();
		//printmyproblem();
	}
	
	public FixProblems(String errormsg) {
		super();
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public FixProblems(int errorno) {
		super();
		this.errorno = errorno;
		//Read error messsage for 101 error code from file
		//this.errormsg=<file>
	    e.openFile(errorno);
		
	}
	
	public FixProblems(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	
	public FixProblems(Exception e){
		super(e);
		this.errormsg = "WOW!!"+ e.getMessage();
		//Write errorMsg to file
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
		System.out.println("FixProblems [errorno=" + errorno + ", errormsg=" + errormsg+  "]"); 
		ExceptionLogging.log();
	}

	public String fixProblemReadFromConsole()
	{
		String a = "X:\\Radha\\car-config\\src\\FordZTW.txt";
		System.out.println("fixedProblemReadFromConsole");
		return a;
	}
}
