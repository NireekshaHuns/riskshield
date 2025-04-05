package com.riskshield.riskshield;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.riskshield.riskshield")
public class RiskshieldApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiskshieldApplication.class, args);
	}

}
