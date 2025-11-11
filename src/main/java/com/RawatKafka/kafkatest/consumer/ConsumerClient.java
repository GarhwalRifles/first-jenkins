package com.RawatKafka.kafkatest.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClient {

    @KafkaListener(topics = "fruits", groupId = "abc")
    public void getMsg(String msg){
        System.out.println("msg : "+msg);
    }

}
