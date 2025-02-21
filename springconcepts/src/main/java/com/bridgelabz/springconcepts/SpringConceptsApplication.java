package com.bridgelabz.springconcepts;

import com.bridgelabz.springconcepts.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.info("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("Application Context Initialized");

		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Checking Context: {}", demoBean);
	}
}
