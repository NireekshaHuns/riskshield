package com.riskshield.riskshield;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class RiskshieldApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiskshieldApplication.class, args);
	}

}
