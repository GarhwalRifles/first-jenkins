package com.RawatKafka.kafkatest.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/kafka")
public class PoducerClient {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @GetMapping("/send")
    public ResponseEntity get(@RequestParam String msg){
        kafkaTemplate.send("fruits", msg);
        return ResponseEntity.ok("hello");
    }

}
