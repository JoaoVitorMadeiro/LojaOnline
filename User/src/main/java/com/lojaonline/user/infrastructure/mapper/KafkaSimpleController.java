package com.lojaonline.user.infrastructure.mapper;
import java.util.concurrent.ExecutionException;

import com.lojaonline.user.infrastructure.entity.UserEntity;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSimpleController {

    private Logger log = LoggerFactory.getLogger(KafkaSimpleController.class);

    //	@Autowired
    private KafkaTemplate<String, UserEntity> kafkaTemplate;

    @Autowired
    public KafkaSimpleController(KafkaTemplate<String, UserEntity> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @GetMapping("/user/test")
    public UserEntity getUserEntity() {
        return new UserEntity("name", "emaill", "password", "type");
    }

    @PostMapping("/user/add")
    public void ProduceToKafka(@RequestBody UserEntity user) {

        log.info("received UserEntity" + user);

        ProducerRecord<String, UserEntity> message = new ProducerRecord<String, UserEntity>("User-group", user);
        ListenableFuture<SendResult<String, UserEntity>> send = (ListenableFuture<SendResult<String, UserEntity>>) kafkaTemplate.send(message);

        try {
            log.info("record metadata" + send.get().getRecordMetadata());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @KafkaListener(topics = "User-group")
    public void ConsumeToTopic(UserEntity user) {

        log.info("received Message in Group user_consumer" + user.toString());
    }
}