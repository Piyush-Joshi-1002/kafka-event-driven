package com.springbootkafkaeda.stockservice.kafka;


import com.springbootkafkaeda.basedomains.dto.OrderEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(@NotNull OrderEvent event){
         LOGGER.info(String.format("Order event recieved in stock service => %s", event.toString()));
         //save the order event into the database logic

    }
}
