package com.tw.mongock;

import io.mongock.driver.api.entry.ChangeEntryService;
import io.mongock.driver.couchbase.driver.CouchbaseDriver;
import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableMongock
@SpringBootApplication
public class MongockApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongockApplication.class, args);
	}

	@Bean
	ChangeEntryService changeEntryService(CouchbaseDriver couchbaseDriver){
		return couchbaseDriver.getChangeEntryService();
	}
}
