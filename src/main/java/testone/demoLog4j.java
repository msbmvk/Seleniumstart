package testone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demoLog4j {

	private static Logger logger =  LogManager.getLogger(demoLog4j.class);
	public static void main(String[] args) {
		
		System.out.print("hfhgh");

		logger.info("This is info mesg..");
		logger.error("Error msg");
		logger.warn("warn msg...");
		logger.fatal("fatal msg..");
		
	}

}
