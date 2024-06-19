package com.shawen.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class HelloListener {

    @KafkaListener(topics = "shawen-topic")
    public void onMessage(String message){
        if (!StringUtils.isEmpty(message)){
            System.out.println(message);
        }
    }
}
