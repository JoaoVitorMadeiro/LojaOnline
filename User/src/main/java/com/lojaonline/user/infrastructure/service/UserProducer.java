package com.lojaonline.user.infrastructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public UserProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String userId, String isAdmin) {
        kafkaTemplate.send("user-topic", userId, isAdmin);
    }
}
