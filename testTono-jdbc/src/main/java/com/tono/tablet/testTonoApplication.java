package com.tono.tablet;

import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.logging.Log;



@SpringBootApplication
public class testTonoApplication {

		protected static final Log logger = LogFactory.getLog(testTonoApplication.class);


		public static void main(String[] args) {

		logger.info("the document  Swagger is in link: ==>  http://localhost:1111/swagger-ui.html");

			SpringApplication.run(testTonoApplication.class, args);


		logger.info("the document  Swagger is in link: ==>  http://localhost:1111/swagger-ui.html");
	}

}

