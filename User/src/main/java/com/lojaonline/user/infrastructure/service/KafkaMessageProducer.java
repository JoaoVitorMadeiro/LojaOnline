package com.lojaonline.user.infrastructure.service;


import com.lojaonline.user.infrastructure.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageProducer {

    private static final String TOPIC = "UserTopic";

    @Autowired
    private KafkaTemplate<String, UserEntity> kafkaTemplate;

    public void sendMessage( String token, String userType) {
        UserMessage userMessage = new UserMessage(token, userType);
        kafkaTemplate.send(TOPIC, userMessage);
    }

    private static class UserMessage extends UserEntity {
        private String token;
        private String userType;

        public UserMessage(String token, String  userType){
            this.token = token;
            this.userType = userType;
        }

        public String getToken(){
            return token;
        }

        public String getUserType(){
            return userType;
        }

        public void setToken(String token){
            this.token = token;
        }

        public void setUserType(String userType){
            this.userType = userType;
        }


    }
}
