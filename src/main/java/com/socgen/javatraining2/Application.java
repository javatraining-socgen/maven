package com.socgen.javatraining2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String args[]) {
		logger.debug("Hello Debug!!");
		logger.warn("Hello WarningDebug!!");
		logger.error("Hello Error!!");
		logger.info("Hello Info!!");
	}
}
