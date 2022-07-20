package com.payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableEurekaClient
public class PaymentServiceApplication {

	static final Logger log = LoggerFactory.getLogger(PaymentServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
		log.debug("Starting my application in debug with {} args", args.length);
	}
}