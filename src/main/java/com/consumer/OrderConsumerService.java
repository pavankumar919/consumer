package com.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderConsumerService {

    @KafkaListener(topics = "${spring.kafka.topic.order-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeOrder(Order order){
        log.info("Consumed order : {}",order.toString());
    }


}
