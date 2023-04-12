package com.assignment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Logging {
	public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("Logging update");

        logger.info("Simply an update");
        logger.warn("got warn");
        logger.error("Example of an error");
    }

}
