package com.logger.july20.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Example using Logger
 * @author ashish
 */
@SpringBootApplication
public class LoggerApplication {

	public static void main(String[] args) {
		Logger logger=getLogger("LoggerApplication.class");
		logger.info("Information");
		logger.warn("Warning");
		logger.debug("Debugging");
		SpringApplication.run(LoggerApplication.class, args);
	}

}
