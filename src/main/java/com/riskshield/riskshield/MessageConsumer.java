package com.riskshield.riskshield;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class MessageConsumer {

    @Autowired
    private RiskEventRepository riskEventRepository;

    @RabbitListener(queues = "riskshield-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message from queue: " + message);

        RiskEvent riskEvent = new RiskEvent(message);
        riskEventRepository.save(riskEvent);

        System.out.println("Message saved to database!");
    }
}
