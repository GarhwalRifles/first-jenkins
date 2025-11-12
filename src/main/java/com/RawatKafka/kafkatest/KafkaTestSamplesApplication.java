package com.RawatKafka.kafkatest;

import java.nio.channels.Pipe.SourceChannel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaTestSamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTestSamplesApplication.class, args);
		sit();
	}
	
	//test
	public static void sit() {
		System.out.println("sit");
	}

}
