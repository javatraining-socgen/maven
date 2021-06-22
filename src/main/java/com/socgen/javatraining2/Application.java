package com.socgen.javatraining2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String args[]) {
		System.out.println("Baby is Back!");
		logger.trace("Hello Trace!!");
		logger.debug("Hello Debug!!");
		logger.info("Hello Info!!");
		logger.warn("Hello Warning!!");
		logger.error("Hello Error!!");
	}
}
