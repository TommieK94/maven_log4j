package base;

import org.apache.logging.log4j.*;
 
public class Main {
    private static Logger demoLogger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
    	System.out.println("Teeesting");
        demoLogger.info("Succesful");
        demoLogger.debug("This is a debug");
        demoLogger.error("DB error");
    }
}