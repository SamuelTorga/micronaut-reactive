package com.samueltorga.reactive.controller.jobs;

import com.samueltorga.reactive.controller.messages.EasyCollectorEventProducer;
import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class KafkaProducerJob {

    private final EasyCollectorEventProducer easyCollectorEventProducer;

    @Scheduled(fixedDelay = "5s")
    void produceMessage() {
        easyCollectorEventProducer.sendEvent("TEST");
    }

}
