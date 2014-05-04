package client;

import adapter.BuildAuto;
import exception.FixProblems;


/**
 * 
 * @author Radha In Driver2 class we will access all the code in the hidden file
 *         proxyAutoMobile by creating an instance of BuildAuto
 */
public class Driver2 {

	public static void main(String[] args) throws FixProblems {

		/**
		 * BuildAuto class hiding the ProxyAutomobile class Here creating
		 * instance of BuildAuto class
		 */

		String fileName = "X:\\Radha\\car-config\\src\\FordZTW.txt";
		BuildAuto buildAuto = new BuildAuto();
		buildAuto.buildAuto(fileName);

		buildAuto.printAuto("Focus Wagon ZTW");

	}

}
