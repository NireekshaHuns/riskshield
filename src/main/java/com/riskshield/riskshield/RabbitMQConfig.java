package com.riskshield.riskshield;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue riskshieldQueue() {
        return new Queue("riskshield-queue", false);
    }
}

