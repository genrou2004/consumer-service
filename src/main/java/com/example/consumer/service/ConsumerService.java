package com.example.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${kafka.topic.transaction-events}", groupId = "consumer-group")
    public void consumeTransactionEvents(String message) {
        System.out.println("Consumed transaction event: " + message);
    }

    @KafkaListener(topics = "${kafka.topic.account-events}", groupId = "consumer-group")
    public void consumeAccountEvents(String message) {
        System.out.println("Consumed account event: " + message);
    }

    @KafkaListener(topics = "${kafka.topic.customer-events}", groupId = "consumer-group")
    public void consumeCustomerEvents(String message) {
        System.out.println("Consumed customer event: " + message);
    }

    @KafkaListener(topics = "${kafka.topic.transfer-events}", groupId = "consumer-group")
    public void consumeTransferEvents(String message) {
        System.out.println("Consumed transfer event: " + message);
    }
}
