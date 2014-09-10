package com.egmat.escholar.admin;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableTransactionManagement

public class Application {
	private static Logger log = Logger.getLogger(
			Application.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
    
}
