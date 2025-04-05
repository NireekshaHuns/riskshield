package com.riskshield.riskshield;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = "riskshield-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message from queue: " + message);
    }
}
