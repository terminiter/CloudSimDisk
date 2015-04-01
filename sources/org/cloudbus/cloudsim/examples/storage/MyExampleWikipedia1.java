package org.cloudbus.cloudsim.examples.storage;

/**
 * A first example based on Wikipedia workload.
 * 
 * @author Baptiste Louis
 */
public class MyExampleWikipedia1 {
	
	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws Exception
	 */
	public static void main(
			String[] args) throws Exception {
		
		// Parameters
		String name = "simulationWiki1"; // name of the simulation
		String type = "wiki"; // type of the workload
		int NumberOfRequest = MyConstants.CLOUDLET_NUMBER_WIKI; // Number of requests
		String RequestArrivalDistri = "wikiDistr"; // fileName which contains Times Distributions based on Wikipedia workload format.
		String dataFiles = "wikiDataFiles.txt"; // Hypothetical Wikipedia dataFiles
		String startingFilesList = ""; // No files to start
		
		// Execution
		new MyRunner(
				name,
				type,
				NumberOfRequest,
				RequestArrivalDistri,
				dataFiles,
				startingFilesList);
	}
	
}
