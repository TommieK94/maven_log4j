package base;

import org.apache.logging.log4j.Logger;

public class Main {
	
	static Logger logger = Logger.getLogger();
	
	public static void main(String[] args) {
		System.out.println("First project with Maven");
		logger.debug("Printing to logger");

	}

}
