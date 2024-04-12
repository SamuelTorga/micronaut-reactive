package com.samueltorga.reactive.controller.messages;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface EasyCollectorEventProducer {

    @Topic("EASYCOLLECTOR-EVENTS")
    void sendEvent(String event);

}
